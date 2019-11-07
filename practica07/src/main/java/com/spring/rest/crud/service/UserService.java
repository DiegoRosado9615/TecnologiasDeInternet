package com.spring.rest.crud.service;

import java.util.List;
import java.util.ListIterator;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.crud.dao.UserDao;
import com.spring.rest.crud.dto.UserResponse;
import com.spring.rest.crud.model.Usuarios;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserDao dao;
	
	public UserResponse getUser(Integer id) {
		UserResponse response = new UserResponse();
		List<Usuarios> usuarios = dao.getUsuarioInfo(id);
		if(usuarios.size() != 0) {
			response.setCodigo(200);
			response.setMensaje("Petición completada");
			response.setPayload(usuarios.get(0));
			return response;
		} else {
			response.setCodigo(400);
			response.setMensaje("El id de usuario no existe");
			return response;
		}
	}
}
