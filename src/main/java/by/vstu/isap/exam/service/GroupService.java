package by.vstu.isap.exam.service;


import java.util.List;

import by.vstu.isap.exam.entity.Gruppyi;

public interface GroupService  {

	Gruppyi read(Long id);

	List<Gruppyi> read();

/*	void save(Gruppyi entity);

	void delete(Long id);
	
	Gruppyi readByName(String name);
*/
}
