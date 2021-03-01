/**
 * 
 */
package com.ucreativa;

/**
 * @author Isaac
 *
 */
public abstract class Persona implements Actor {
	
	public String nombre;
	public String identificacion;
	public int edad;

	@Override
	public void desaparecer() {
		// TODO Auto-generated method stub
		System.out.println("bye bye");
	}

	@Override
	public void divertir() {
		// TODO Auto-generated method stub
		System.out.println("Super funny");
		
	}

	@Override
	public void actuar() {
		// TODO Auto-generated method stub
		System.out.println("I am acting from Persona");
	}
	
	public void saludar() {
		System.out.println("Hola, mi nombree es: " + nombre + "y mi edad es " + edad + "años.");		
	}
	
	public void Despedirse() {
		System.out.println("Bye aligator");		
	}
	
	public void comer() {
		System.out.println("I am having lunch");		
	}


}
 