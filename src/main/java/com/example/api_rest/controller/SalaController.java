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

import com.example.api_rest.dto.Sala;
import com.example.api_rest.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {
	
	@Autowired
	SalaServiceImpl salaServiceImpl;
	
	@GetMapping("/salas")
	public List<Sala> listarSalas(){
		return salaServiceImpl.listarSalas();
	}
	
	@GetMapping("/salas/{codigo}")
	public Sala salaXID(@PathVariable(name="codigo") int codigo) {
		return salaServiceImpl.salaXID(codigo);
	}
	
	@PostMapping("/salas")
	public Sala guardarSala(@RequestBody Sala caja) {
		return salaServiceImpl.guardarSala(caja);
	}
	
	@PutMapping("/salas/{codigo}")
	public Sala actualizarSala(@PathVariable(name="codigo")int codigo, @RequestBody Sala sala) {
		Sala salaActualizado = salaServiceImpl.salaXID(codigo);
		
		salaActualizado.setNombre(sala.getNombre());
		salaActualizado.setPelicula(sala.getPelicula());
		
		return salaServiceImpl.actualizarSala(salaActualizado);
	}
	
	@DeleteMapping("/salas/{codigo}")
	public void eliminarSala(@PathVariable(name="codigo")int codigo) {
		salaServiceImpl.eliminarSala(codigo);
	}
}
