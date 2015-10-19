package com.potros.persistence;
import java.util.List;

public interface UniversalDAO<T>{
	public List<T> findAll();
	public boolean removeById(int id);
	public boolean remove(T entity);
	public T findById(int id);
	public boolean merge(T entity);
	public boolean persist(T entity);
}
