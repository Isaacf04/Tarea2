/**
 * 
 */
package com.ucreativa;

/**
 * @author Isaac
 *
 */
public class Arbusto extends Vegetal implements Actor {
	
	// properties
			private String marca2;
			private String nombreCientifico2;
			private double atributo2;
	
	// constructor 
	
			/**
			 * @param nombre
			 * @param tipo
			 * @param color
			 */
			public Arbusto(String nombre, String tipo, String color, String marca2, String nombreCientifico2, double atributo2) {
				super(nombre, tipo, color);
				this.marca2 = marca2;
				this.nombreCientifico2 = nombreCientifico2;
				this.atributo2 = atributo2;
				
				// TODO Auto-generated constructor stub
			}
	
	
	// methods

	@Override
	public void divertir() {
		// TODO Auto-generated method stub
		
	}



	@Override
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
		super.setNombre(nombre);
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return super.getTipo();
	}

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

	@Override
	public void mostrarse() {
		// TODO Auto-generated method stub
		super.mostrarse();
	}

	@Override
	public void desaparecer() {
		// TODO Auto-generated method stub
		super.desaparecer();
	}


	@Override
	public String toString() {
		return "Arbusto [marca2=" + marca2 + ", nombreCientifico2=" + nombreCientifico2 + ", atributo2=" + atributo2
				+ "]";
	}

	
	
	

}
