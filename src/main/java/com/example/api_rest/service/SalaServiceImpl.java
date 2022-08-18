package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.ISalaDAO;
import com.example.api_rest.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService{

	@Autowired
	ISalaDAO iSalaDAO;

	@Override
	public List<Sala> listarSalas() {
		// TODO Auto-generated method stub
		return iSalaDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		// TODO Auto-generated method stub
		return iSalaDAO.save(sala);
	}

	@Override
	public Sala salaXID(int codigo) {
		// TODO Auto-generated method stub
		return iSalaDAO.findById(codigo).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		// TODO Auto-generated method stub
		return iSalaDAO.save(sala);
	}

	@Override
	public void eliminarSala(int codigo) {
		// TODO Auto-generated method stub
		iSalaDAO.deleteById(codigo);
	}

}
