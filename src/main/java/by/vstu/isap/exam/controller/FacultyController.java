package by.vstu.isap.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import by.vstu.isap.exam.entity.Faculty;

import by.vstu.isap.exam.service.FacultyService;

@RestController
@RequestMapping(value = "api/faculty")
public class FacultyController {

	
	@Autowired
	private FacultyService service;
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping
	public ResponseEntity<List<Faculty>> get() {
		List<Faculty> entities = service.read();
		if (entities.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(entities, HttpStatus.OK);
	}

	@PreAuthorize("hasAnyRole('ADMIN', 'USER')")
	@GetMapping("/{id}")
	public ResponseEntity<Faculty> getById(@PathVariable long id) {
		Faculty entity = service.read(id);
		if (entity == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(entity, HttpStatus.OK);
	}
}
