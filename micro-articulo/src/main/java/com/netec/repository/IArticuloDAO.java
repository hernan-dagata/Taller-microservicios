package com.netec.repository;

import org.springframework.data.repository.CrudRepository;

import com.netec.entities.Articulo;

public interface IArticuloDAO extends CrudRepository<Articulo, Integer> {

}
