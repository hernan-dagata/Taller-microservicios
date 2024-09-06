package com.netec.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.netec.entities.Articulo;

// @FeignClient(name = "micro-articulo", url = "http://localhost:9091")
@FeignClient(name = "micro-articulo")
public interface IArticuloFeign {
	
	@GetMapping("/articulo/{id}")
	public abstract Articulo findById(@PathVariable("id") int id);

}
