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
}
