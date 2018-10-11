package by.vstu.isap.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import by.vstu.isap.exam.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {

	Faculty findByName(String name);

}
