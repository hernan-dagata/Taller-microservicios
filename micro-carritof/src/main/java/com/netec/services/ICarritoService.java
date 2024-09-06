package com.netec.services;

import java.util.List;

import com.netec.entities.Articulo;

public interface ICarritoService {
	
	boolean insertarArticulo(int id);
List<Articulo> showAll();

}
