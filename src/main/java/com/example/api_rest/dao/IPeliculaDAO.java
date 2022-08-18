package com.example.api_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Pelicula;

public interface IPeliculaDAO extends JpaRepository<Pelicula, Integer>{

}
