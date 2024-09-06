package com.netec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netec.entities.Articulo;
import com.netec.services.IArticuloService;

@RestController
public class ArticuloController {

	@Autowired
	private IArticuloService servicio;

	@GetMapping("/articulo")
	public List<Articulo> findAll() {
		return servicio.findAll();
	}

	@GetMapping("/articulo/{id}")
	public Articulo findOneProduct(@PathVariable("id") int id) {
		return servicio.findById(id);
	}

	@PostMapping("/articulo")
	public Articulo guardarArticulo(@RequestBody Articulo articulo) {
		return servicio.save(articulo);
	}

	@DeleteMapping("/articulo/{id}")
	public void deleteById(@PathVariable("id") int id) {
		servicio.deleteById(id);
	}

}
