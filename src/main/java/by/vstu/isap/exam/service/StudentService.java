package by.vstu.isap.exam.service;

import java.util.List;

import by.vstu.isap.exam.entity.Studentyi;

public interface StudentService  {

	Studentyi read(Long id);

	List<Studentyi> read();
	
	Studentyi readByNomerZachetki(Long id);
	
	void delete(Long id);
	
	
	/*List<Studentyi> readByGroupId(Long id);

	List<Studentyi> readBySurname(String surname);
	
	List<Studentyi> readByThre(String name,String surname,String secondname);
	
	Studentyi read(Long id);

	List<Studentyi> read();

	void save(Studentyi entity);


	*/

}

