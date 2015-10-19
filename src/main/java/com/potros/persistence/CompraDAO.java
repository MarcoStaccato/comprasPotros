package com.potros.persistence;

import java.util.List;

import com.potros.entities.Articulo;
import com.potros.entities.Compra;

public class CompraDAO extends GenericDAO<Compra>{
	
	public CompraDAO(){
		this.clase="Compra";
	}
	@Override
	public Class getClazz() {
		// TODO Auto-generated method stub
		return Compra.class;
	}
	@Override
	public boolean persist(Compra entity) {
		// TODO Auto-generated method stub
		return persist(entity);
	}
	@Override
	public boolean merge(Compra entity) {
		// TODO Auto-generated method stub
		return merge(entity);
	}
	@Override
	public Compra findById(int id) {
		// TODO Auto-generated method stub
		return findById(id);
	}
	@Override
	public boolean remove(Compra entity) {
		// TODO Auto-generated method stub
		return remove(entity);
	}
	@Override
	public boolean removeById(int id) {
		// TODO Auto-generated method stub
		return removeById(id);
	}
	@Override
	public List<Compra> findAll() {
		// TODO Auto-generated method stub
		return findAll();
	}
	

}
