package com.example.api_rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "peliculas")
public class Pelicula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo;
	@Column(name="nombre")
	String nombre;
	@Column(name="calificacionedad")
	int calificacionEdad;
	
	@OneToMany
	@JoinColumn(name="codigo")
	List<Sala> salas;

	public Pelicula() {
		
	}

	public Pelicula(int codigo, String nombre, int calificacionEdad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacionEdad = calificacionEdad;
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
	 * @return the calificacionEdad
	 */
	public int getCalificacionEdad() {
		return calificacionEdad;
	}


	/**
	 * @param calificacionEdad the calificacionEdad to set
	 */
	public void setCalificacionEdad(int calificacionEdad) {
		this.calificacionEdad = calificacionEdad;
	}


	/**
	 * @return the salas
	 */
	public List<Sala> getSalas() {
		return salas;
	}


	/**
	 * @param salas the salas to set
	 */
	@JsonIgnore
	@OneToMany(fetch =  FetchType.LAZY, mappedBy = "Sala")
	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", calificacionEdad=" + calificacionEdad
				+ ", salas=" + salas + "]";
	}

	
	
}
