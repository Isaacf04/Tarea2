/**
 * 
 */
package com.ucreativa;

/**
 * @author admin
 *
 */
public interface ObjetoInerte {
	// constructor ==> NO
	
	// properties => variables
	public static String nombreInerte = "Iridium";
	public static int numeroatomos = 94;
	public static String galaxiaOrigen = "Artemisa";
	
	// get-set ==> NO
	
	// methods
	abstract void metodo1();
	abstract void metodo2();
	abstract void metodo3();
	
	static String quiensoy() {
		return "Yo soy un elemento quimico";
	}

}
