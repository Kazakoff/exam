package by.vstu.isap.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import by.vstu.isap.exam.entity.Studentyi;

public interface StudentRepository extends JpaRepository<Studentyi, Long> {

	Studentyi findByNomerZachetki(Long id);

	//List<Studentyi> findByShifrGruppyi(String name);
	
	List<Studentyi> findByFamiliya(String familiya);
	
/*	@Query("Select u from students u  where u.name = :name and u.surname = :surname and u.secondname = :secondname")
	List<Studentyi> findByThre(@Param("name") String name,@Param("surname") String surname,@Param("secondname") String secondname);
*/
}

