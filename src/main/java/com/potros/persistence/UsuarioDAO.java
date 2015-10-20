package com.potros.persistence;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.potros.entities.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario> {
	
	private Session session = HibernateUtil.getSessionFactory().openSession();

	public UsuarioDAO(){
		this.clase="Usuario";
	}
	
	public Usuario Autenticar(String usuario, String pass){
		Usuario u=null;
		String sql = "SELECT * FROM Usuarios WHERE DESCRIPCION = :descripcion and PASSWORD = :password";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(Usuario.class);
		query.setParameter("descripcion",usuario);
		query.setParameter("password",pass);
		List<Usuario> usuarios= query.list();
		for(Usuario usu:usuarios){
			if(usu!=null)
				u=usu;
		}
		return u;
	}
	
	@Override
	public Class<?> getClazz() {
		return Usuario.class;
	}

}
