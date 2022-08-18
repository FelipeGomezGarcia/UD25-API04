package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Sala;

public interface ISalaService {
	
	public List<Sala> listarSalas();
	
	public Sala guardarSala(Sala sala);
	
	public Sala salaXID(int codigo);
	
	public Sala actualizarSala(Sala sala);
	
	public void eliminarSala(int codigo);
}
