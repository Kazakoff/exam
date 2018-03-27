package by.vstu.isap.exam.service;

import java.util.List;

import by.vstu.isap.exam.entity.AbstractEntity;

public interface Service<T extends AbstractEntity> {

	T read(Long id);

	List<T> read();

	void save(T entity);

	void delete(Long id);

}