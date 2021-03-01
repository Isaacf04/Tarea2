/**
 * 
 */
package com.ucreativa;

/**
 * @author Isaac
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		// *****
		Arbol arb1 = new Arbol("Cypress", "madera", "Verde",  "Cepa",  "Eucaliptos", 10);
		
		arb1.setNombre("Maracuya");
		arb1.florear();
		System.out.println(arb1.toString());
		// ********
		
        Arbusto arbu1 = new Arbusto("Sotacabayo", "acuifero", "Verde musgo",  "ramas",  "Zygia longifolia", 3);
		
        arbu1.mostrarse();
        arbu1.setNombre("Mango");
		System.out.println(arbu1.toString());
		
		// *****
		
		Persona profe = new Profesor("Petrukio", 101, "12343", "isaac.fernandez.gonzalez@ucreativa.com", 3, 22222);
		profe.divertir();
	
		
		// *****
	   Persona student = new Estudiante("Ing Electrica", "Digitales",4 ,33 ,"Rafa", "A621");
	   student.Despedirse();
	   
	   // *****	   
	  
	}		 

}
