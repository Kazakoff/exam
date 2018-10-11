package by.vstu.isap.exam.service;

import java.util.List;

import by.vstu.isap.exam.entity.Faculty;

public interface FacultyService {
	
	Faculty read(Long id);

List<Faculty> read();
}
