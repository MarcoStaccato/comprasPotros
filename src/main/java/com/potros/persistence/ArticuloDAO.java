package com.potros.persistence;

import com.potros.entities.Articulo;

public class ArticuloDAO extends GenericDAO<Articulo>{

	@Override
	public Class getClazz() {
		// TODO Auto-generated method stub
		return Articulo.class;
	}

}
