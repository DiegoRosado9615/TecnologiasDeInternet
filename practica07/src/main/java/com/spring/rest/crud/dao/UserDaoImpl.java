package com.spring.rest.crud.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.rest.crud.model.Usuarios;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory factory;
	
	private Session getSession() {
		Session session = null;
		try {
			session = factory.getCurrentSession();
		}catch(HibernateException ex) {
			session = factory.openSession();
		}
		return session;
	}

	@SuppressWarnings("unchecked")
	@Override
	public java.util.List<Usuarios> getUsuarioInfo(Integer id) {
		return getSession().createCriteria(Usuarios.class).add(Restrictions.eq("id_usuario", id)).list();
	}
}
