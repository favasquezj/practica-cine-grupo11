package gestion;

import java.io.Serializable;

import gestion.Cinema;

public class Persona implements Serializable{

	// ================================================================================
	// ATRIBUTOS
	private String nombre;
	private Cinema cinema;
	private int id;
	
	
	
	// ===========================================================================================
	// CONSTRUCTOR
	public Persona(String nombre, Cinema cinema, int id) {
		super();
		this.nombre = nombre;
		this.cinema = cinema;
		this.id = id;
	}
	
	
	
	// ================================================================================
	// CONSTRUCTOR AUXILIAR
	public Persona(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id =id;
	}

	// ================================================================================
	// GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	
	
	
	

	

}
