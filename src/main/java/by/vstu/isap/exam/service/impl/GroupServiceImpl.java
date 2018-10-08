package by.vstu.isap.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.vstu.isap.exam.entity.Gruppyi;
import by.vstu.isap.exam.repository.GroupRepository;
import by.vstu.isap.exam.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupRepository repository;

	@Override
	public Gruppyi read(Long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Gruppyi> read() {
		return repository.findAll();
	}

	@Override
	public void save(Gruppyi entity) {
		repository.save(entity);
	}
/*
	@Override
	public void delete(Long id) {
		repository.delete(id);
	}

	@Override
	public Group readByName(String name) {
		return repository.findByName(name);
	}
*/
}

