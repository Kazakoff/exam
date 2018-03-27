package by.vstu.isap.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.vstu.isap.exam.entity.Studentyi;
import by.vstu.isap.exam.repository.StudentRepository;
import by.vstu.isap.exam.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public Studentyi read(Long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Studentyi> read() {
		return repository.findAll();
	}
	@Override
	public Studentyi readByNomerZachetki(Long id) {
		return repository.findByNomerZachetki(id);
	}

/*	@Override
	public void save(Student entity) {
		repository.save(entity);
	}

	@Override
	public void delete(Long id) {
		repository.delete(id);
	}

	@Override
	public List<Student> readByGroupId(Long id) {
		return repository.findByGroup_id(id);
	}

	@Override
	public List<Student> readBySurname(String surname) {
		return repository.findBySurname(surname);
	}

	@Override
	public  List<Student>  readByThre(String name, String surname, String secondname) {
		
		
	return repository.findByThre(name, surname, secondname);	
	}
*/
}
