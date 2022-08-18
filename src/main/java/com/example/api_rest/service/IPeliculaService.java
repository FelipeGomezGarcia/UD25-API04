package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Pelicula;

public interface IPeliculaService {

	public List<Pelicula> listarPeliculas();
	
	public Pelicula guardarPelicula(Pelicula pelicula);
	
	public Pelicula peliculaXID(int codigo);
	
	public Pelicula actualizarPelicula(Pelicula pelicula);
	
	public void eliminarPelicula(int codigo);
}
