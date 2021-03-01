/**
 * 
 */
package com.ucreativa;

/**
 * @author Isaac
 *
 */
public class Arbol extends Vegetal implements Actor {
	// properties
	private String marca;
	private String nombreCientifico;
	private double atributo1;
	
	// Constructor
	
	/**
	 * @param nombre
	 * @param tipo
	 * @param color
	 * @param marca
	 * @param nombreCientifico
	 * @param atributo1
	 */
	public Arbol(String nombre, String tipo, String color, String marca, String nombreCientifico, double atributo1) {
		super(nombre, tipo, color);
		this.marca = marca;
		this.nombreCientifico = nombreCientifico;
		this.atributo1 = atributo1;
	}
	
	public void tomarSol() {
		System.out.println("Necesito el sol");
		
	}
	
	public void metodo1() {
		System.out.println("metodo1");
	}
	
	public void metodo2() {
		System.out.println("metodo2");
	}	
	
	
	

	@Override
	
	public void divertir() {
		// TODO Auto-generated method stub
		
	}
	

	public void actuar() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}
	@Override
	
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre + ">> Hola");
	}
	
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return super.getTipo();
	}
	
	 // override
	
	@Override
	
	public void setTipo(String tipo) {
		// TODO Auto-generated method stub
		super.setTipo(tipo);
	}
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}
	@Override
	
	public void setColor(String color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}
	
	@Override
	public void florear() {
		// TODO Auto-generated method stub
		super.florear();
	}
	// polimorfisismo
	public void florear( String detalle) {
		System.out.println("Ya hay flores con polimorfismo");
	}
	
	@Override
	public void mostrarse() {
		// TODO Auto-generated method stub
		System.out.println("Aparecio el Arbol");
	}
	
	@Override
	public void desaparecer() {
		// TODO Auto-generated method stub
		super.desaparecer();
	}

	@Override
	public String toString() {
		return "Arbol [marca=" + marca + ", nombreCientifico=" + nombreCientifico + ", atributo1=" + atributo1 + "]";
	}	
	
}
