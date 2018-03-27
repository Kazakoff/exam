package by.vstu.isap.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import by.vstu.isap.exam.entity.Gruppyi;

public interface GroupRepository extends JpaRepository<Gruppyi, Long> {

	Gruppyi findByNazvanie(String name);

}
