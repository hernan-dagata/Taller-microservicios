package com.netec.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Carrito {
	
	List<Articulo> articulo;

	public Carrito() {
		super();
		articulo = new ArrayList<>();
	}
	
	public List<Articulo> getArticulos(){
		return articulo;
	}
	
	public void setArticulos(List<Articulo> articulo) {
		this.articulo = articulo;
	}

}
