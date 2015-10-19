package com.potros.persistence;

import java.util.List;

import com.potros.entities.Articulo;

public class ArticuloDAO extends GenericDAO<Articulo>{
	
	public ArticuloDAO(){
		this.clase="Articulo";
	}
	@Override
	public Class getClazz() {
		// TODO Auto-generated method stub
		return Articulo.class;
	}
	@Override
	public boolean persist(Articulo entity) {
		// TODO Auto-generated method stub
		return persist(entity);
	}
	@Override
	public boolean merge(Articulo entity) {
		// TODO Auto-generated method stub
		return merge(entity);
	}
	@Override
	public Articulo findById(int id) {
		// TODO Auto-generated method stub
		return findById(id);
	}
	@Override
	public boolean remove(Articulo entity) {
		// TODO Auto-generated method stub
		return remove(entity);
	}
	@Override
	public boolean removeById(int id) {
		// TODO Auto-generated method stub
		return removeById(id);
	}
	@Override
	public List<Articulo> findAll() {
		// TODO Auto-generated method stub
		return findAll();
	}

}
