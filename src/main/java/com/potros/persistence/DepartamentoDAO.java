package com.potros.persistence;

import java.util.List;

import com.potros.entities.Articulo;
import com.potros.entities.Compra;
import com.potros.entities.Departamento;

public class DepartamentoDAO extends GenericDAO<Departamento>{
	
	public DepartamentoDAO(){
		this.clase="Departamento";
	}
	@Override
	public Class getClazz() {
		// TODO Auto-generated method stub
		return Departamento.class;
	}
	@Override
	public boolean persist(Departamento entity) {
		// TODO Auto-generated method stub
		return persist(entity);
	}
	@Override
	public boolean merge(Departamento entity) {
		// TODO Auto-generated method stub
		return merge(entity);
	}
	@Override
	public Departamento findById(int id) {
		// TODO Auto-generated method stub
		return findById(id);
	}
	@Override
	public boolean remove(Departamento entity) {
		// TODO Auto-generated method stub
		return remove(entity);
	}
	@Override
	public boolean removeById(int id) {
		// TODO Auto-generated method stub
		return removeById(id);
	}
	@Override
	public List<Departamento> findAll() {
		// TODO Auto-generated method stub
		return findAll();
	}
	
}
