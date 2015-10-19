package com.potros.persistence;

import java.util.List;

import com.potros.entities.ElementoConId;

public class ElementoConIdDAO extends GenericDAO<ElementoConId> {

	@Override
	public Class getClazz() {
		// TODO Auto-generated method stub
		return ElementoConId.class;
	}

	@Override
	public boolean persist(ElementoConId entity) {
		// TODO Auto-generated method stub
		return persist(entity);
	}

	@Override
	public boolean merge(ElementoConId entity) {
		// TODO Auto-generated method stub
		return merge(entity);
	}

	@Override
	public ElementoConId findById(int id) {
		// TODO Auto-generated method stub
		return findById(id);
	}

	@Override
	public boolean remove(ElementoConId entity) {
		// TODO Auto-generated method stub
		return remove(entity);
	}

	@Override
	public boolean removeById(int id) {
		// TODO Auto-generated method stub
		return removeById(id);
	}

	@Override
	public List<ElementoConId> findAll() {
		// TODO Auto-generated method stub
		return findAll();
	}
	
}
