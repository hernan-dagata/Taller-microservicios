package com.netec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netec.entities.Articulo;
import com.netec.entities.Carrito;
import com.netec.feign.IArticuloFeign;

@Service
public class CarritoServiceImpl implements ICarritoService{

	@Autowired
	private Carrito carrito;
	
	@Autowired 
	private IArticuloFeign feign;
	
	@Override
	public boolean insertarArticulo(int id) {
		Articulo art = feign.findById(id);
		if(art != null) {
			carrito.getArticulos().add(art);
			return true;
		}
		return false;
	}

	@Override
	public List<Articulo> showAll() {
		// TODO Auto-generated method stub
		return carrito.getArticulos();
	}

}
