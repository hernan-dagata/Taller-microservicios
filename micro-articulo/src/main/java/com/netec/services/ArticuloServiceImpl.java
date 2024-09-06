package com.netec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.netec.entities.Articulo;
import com.netec.repository.IArticuloDAO;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	private IArticuloDAO dao;

	@Override
	public List<Articulo> findAll() {
		Iterable<Articulo> resultado = dao.findAll();
		return (List<Articulo>) resultado;
	}

	@Override
	public Articulo save(Articulo articulo) {
		return dao.save(articulo);
	}

	@Override
	public void deleteById(int id) {
		if (dao.existsById(id)) {
			dao.deleteById(id);
			return;
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Articulo no encontrado " + id);
	}

	@Override
	public Articulo findById(int id) {
		return dao.findById(id).stream().findFirst()
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Articulo no encontrado " + id));
	}

}
