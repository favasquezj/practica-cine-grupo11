package gestion;

import java.util.ArrayList;
import gestion.Cinema;

public class Cliente extends Persona {
	
	// ================================================================================
	// ATRIBUTOS
	private String usuario;
	private String contrasena;
	private Reserva cobro;
	private boolean clienteFrecuente;
	static private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	
	// ===========================================================================================
	// CONSTRUCTOR
	public Cliente(String nombre, Cinema cinema, int id, String usuario, String contrasena, 
			Reserva cobro, boolean clienteFrecuente) {
		super(nombre, cinema, id);
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.cobro = cobro;
		this.cobro.setCliente(this);
		this.clienteFrecuente = clienteFrecuente;
		cinema.clientes.add(this);
		clientes.add(this);
	}
	
	
	// ================================================================================
	// CONSTRUCTOR AUXILIAR
	
	
	
	public Cliente(String nombre, int id, Cinema cinema, String usuario, String contrasena, boolean clienteFrecuente) {
		super(nombre, id);
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.clienteFrecuente = clienteFrecuente;
		this.setCinema(cinema);
		cinema.clientes.add(this);
		clientes.add(this);
		this.cobro = new Reserva(this, cinema);
	}



	// ======================================================================
	// GETTERS Y SETTERS
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Reserva getCobro() {
		return cobro;
	}

	public void setCobro(Reserva cobro) {
		this.cobro = cobro;
	}

	public boolean isClienteFrecuente() {
		return clienteFrecuente;
	}

	public void setClienteFrecuente(boolean clienteFrecuente) {
		this.clienteFrecuente = clienteFrecuente;
	}

	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public static void setClientes(ArrayList<Cliente> clientes) {
		Cliente.clientes = clientes;
	}

	
	// ======================================================================
		// METODOS
	
	static public Cliente nuevoCliente(String nombre, int id, Cinema cinema, String usuario, 
			String contrasena, boolean frecuente) {
			Cliente cliente = new Cliente(nombre, id, cinema, usuario, contrasena, frecuente);
			return cliente;
		}
	
	public static Cliente encontrarCliente(int codigo) {
		int i = 0;
		Cliente encontrado = null;
		while (i < clientes.size()) {
			if (clientes.get(i).getId() == codigo) {
				encontrado = clientes.get(i);
				break;
			}
			else {
				encontrado = null;
			}
			i++;
		}
		return encontrado;
	}
		
	
	public String toString() {
		return "El cliente "+this.getNombre()+" tiene una reserva "+ this.getCinema().getCodigo()+ "para el día"+
				this.getCinema().getFecha();
	}
}
