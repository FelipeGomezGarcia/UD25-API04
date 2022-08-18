package com.example.api_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_rest.dto.Pelicula;
import com.example.api_rest.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {
	
	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas(){
		return peliculaServiceImpl.listarPeliculas();
	}
	
	@GetMapping("/peliculas/{codigo}")
	public Pelicula peliculaXID(@PathVariable(name="codigo") int codigo) {
		return peliculaServiceImpl.peliculaXID(codigo);
	}
	
	@PostMapping("/peliculas")
	public Pelicula guardarPelicula(@RequestBody Pelicula almacen) {
		return peliculaServiceImpl.guardarPelicula(almacen);
	}
	
	@PutMapping("/peliculas/{codigo}")
	public Pelicula actualizarPelicula(@PathVariable(name="codigo")int codigo, @RequestBody Pelicula pelicula) {
		Pelicula peliculaActualizado = peliculaServiceImpl.peliculaXID(codigo);
		
		peliculaActualizado.setNombre(pelicula.getNombre());
		peliculaActualizado.setCalificacionEdad(pelicula.getCalificacionEdad());
		
		return peliculaServiceImpl.actualizarPelicula(peliculaActualizado);
	}
	
	@DeleteMapping("/peliculas/{codigo}")
	public void eliminarPelicula (@PathVariable(name="codigo")int codigo) {
		peliculaServiceImpl.eliminarPelicula(codigo);
	}
}
