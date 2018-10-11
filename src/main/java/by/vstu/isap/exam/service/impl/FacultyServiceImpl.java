package by.vstu.isap.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.vstu.isap.exam.entity.Faculty;
import by.vstu.isap.exam.repository.FacultyRepository;
import by.vstu.isap.exam.service.FacultyService;

@Service
public class FacultyServiceImpl implements FacultyService {
	
	@Autowired
	private FacultyRepository repository;

	@Override
	public Faculty read(Long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Faculty> read() {
		return repository.findAll();
	}

}
