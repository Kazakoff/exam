package by.vstu.isap.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import by.vstu.isap.exam.entity.Studentyi;
import by.vstu.isap.exam.service.StudentService;
// http://localhost:8080/REST/api/student
@RestController
@RequestMapping(value = "api/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping
	public ResponseEntity<List<Studentyi>> get() {
		List<Studentyi> entities = service.read();
		if (entities.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(entities, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Studentyi> getById(@PathVariable long id) {
		Studentyi entity = service.readByNomerZachetki(id);
		if (entity == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(entity, HttpStatus.OK);
	}
	
	//@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable long id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	


}
