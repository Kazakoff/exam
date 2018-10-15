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
	
/*	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
	@GetMapping("/{id}")
	public ResponseEntity<Student> getById(@PathVariable long id) {
		Student entity = service.read(id);
		if (entity == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(entity, HttpStatus.OK);
	}

	@GetMapping("/group/{id}")
	public ResponseEntity<List<Student>> getStudentsByGroup(@PathVariable long id) {
		List<Student> students = service.readByGroupId(id);
		if (students.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(students, HttpStatus.OK);
	}
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
	@GetMapping("/surname/{surname}")
	public ResponseEntity<List<Student>> getStudentsBySurname(@PathVariable String surname) {
		List<Student> students = service.readBySurname(surname);
		if (students.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(students, HttpStatus.OK);
	}

	@PreAuthorize("hasAnyRole('ADMIN')")
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> put(@RequestBody Student entity) {
		service.save(entity);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> post(@RequestBody Student entity) {
		service.save(entity);
		return new ResponseEntity<>(HttpStatus.OK);
	}



	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
	@GetMapping("/thre/{name,surname,secondname}")
	public ResponseEntity<List<Student>> getStudentsByThre(@PathVariable String name,String surname,String secondname) {
		List<Student> students = service.readByThre(name,surname,secondname);
		if (students.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(students, HttpStatus.OK);
	}
	*/
}
