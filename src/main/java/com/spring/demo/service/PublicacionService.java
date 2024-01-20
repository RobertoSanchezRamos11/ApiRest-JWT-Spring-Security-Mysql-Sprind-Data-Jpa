package com.spring.demo.service;

import com.spring.demo.dto.PublicacionDTO;
import com.spring.demo.dto.PublicacionRespuesta;

public interface PublicacionService {
	
	public PublicacionDTO crearPublicacion(PublicacionDTO publicacionDTO);
	
	public PublicacionRespuesta obtenerTodasLasPublicaciones(int numeroDePagina, int medidaDePagina, String ordenarPor, String sortDir);
	
	public PublicacionDTO obtenerPublicacionPorId(Long id);
	
	public PublicacionDTO actualizarPublicacion(PublicacionDTO publicacionDTO, Long id);
	
	public void eliminarPublicacion(Long id);
}
