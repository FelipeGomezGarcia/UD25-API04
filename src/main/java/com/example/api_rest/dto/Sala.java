package com.example.api_rest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="salas")
public class Sala {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo;
	@Column(name = "nombre")
	String nombre;
	
	@ManyToOne
	@JoinColumn(name = "pelicula")
	Pelicula pelicula;

	public Sala() {
		
	}
	

	public Sala(int codigo, String nombre, Pelicula pelicula) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}


	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the pelicula
	 */
	public Pelicula getPelicula() {
		return pelicula;
	}


	/**
	 * @param pelicula the pelicula to set
	 */
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}


	@Override
	public String toString() {
		return "Sala [codigo=" + codigo + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
	}

	
}
