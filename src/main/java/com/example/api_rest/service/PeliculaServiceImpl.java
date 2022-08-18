package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IPeliculaDAO;
import com.example.api_rest.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService{

	@Autowired
	IPeliculaDAO iPeliculaDAO;

	@Override
	public List<Pelicula> listarPeliculas() {
		// TODO Auto-generated method stub
		return iPeliculaDAO.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula peliculaXID(int codigo) {
		// TODO Auto-generated method stub
		return iPeliculaDAO.findById(codigo).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(int codigo) {
		// TODO Auto-generated method stub
		iPeliculaDAO.deleteById(codigo);
	}

	
}
