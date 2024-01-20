package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.entidades.Publicacion;

public interface PublicacionRepositorio extends JpaRepository<Publicacion, Long>{

}
