/**
 * 
 */
package com.ucreativa;

/**
 * @author Isaac
 *
 */
public interface Actor {
	// constructor ==> NO
	
	// properties => variables
	public static String nombreArtistico = "Karo G";
	public static int anniosExperiencia = 6;
	public static String tipo = "Principal";
	
	// get-set ==> NO
	
	// methods
	abstract void desaparecer();
	abstract void divertir();
	abstract void actuar();
	
	static String identificador() {
		return "Yo soy un actor";
	}	
	
}
