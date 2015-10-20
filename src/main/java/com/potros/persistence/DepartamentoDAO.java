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
		
}
