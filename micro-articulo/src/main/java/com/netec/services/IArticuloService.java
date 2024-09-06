package com.netec.services;

import java.util.List;

import com.netec.entities.Articulo;

public interface IArticuloService {

	List<Articulo> findAll();

	Articulo save(Articulo articulo);

	void deleteById(int id);

	Articulo findById(int id);

}
