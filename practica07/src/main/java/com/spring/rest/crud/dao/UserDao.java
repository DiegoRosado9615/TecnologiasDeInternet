package com.spring.rest.crud.dao;

import java.util.List;

import com.spring.rest.crud.model.Usuarios;

public interface UserDao {

	public List<Usuarios> getUsuarioInfo(Integer id);
}
