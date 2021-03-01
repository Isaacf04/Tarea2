/**
 * 
 */
package com.ucreativa;

/**
 * @author Isaac
 *
 */
public class Vegetal {
		
	// attributes
	private String nombre;
	private String tipo;
	private String color;
	
	// constructor
	/**
	 * @param nombre
	 * @param tipo
	 * @param color
	 */
	public Vegetal(String nombre, String tipo, String color) {
		
		this.nombre = nombre;
		this.tipo = tipo;
		this.color = color;
	}
	
	// get-set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}	

	
	public void florear() {
			
		System.out.println("Bump: flor");
	}
	public void mostrarse() {
			
		System.out.println("Me ven!");
	}
	
	public void desaparecer() {
		System.out.println("Me fui");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hola, mis propiedades son: " +
				"nombre " + this.nombre +
				"tipo: " + this.tipo +
				"color: "+ this.color;
	}
		
}
