package com.example.api_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Sala;

public interface ISalaDAO extends JpaRepository<Sala, Integer>{

}
