/**
 * 
 */
package com.ucreativa;

/**
 * @author Isaac
 *
 */
public class Vehiculo implements Actor, ObjetoInerte {
	// properties
		private String marcaVehiculo;
		private String nombreFabricante;
		private double tipoCombsutible;
		
		// constructor
		/**
		 * @param marcaVehiculo
		 * @param nombreFabricante
		 * @param tipoCombsutible
		 */
		public Vehiculo(String marcaVehiculo, String nombreFabricante, double tipoCombsutible) {
			super();
			
			this.marcaVehiculo = marcaVehiculo;
			this.nombreFabricante = nombreFabricante;
			this.tipoCombsutible = tipoCombsutible;
		}	
		
		
		// set-get 

		
	/**
	 * @return the marcaVehiculo
	 */
	public String getMarcaVehiculo() {
		return marcaVehiculo;
	}
	

	/**
	 * @param marcaVehiculo the marcaVehiculo to set
	 */
	public void setMarcaVehiculo(String marcaVehiculo) {
		this.marcaVehiculo = marcaVehiculo;
	}

	/**
	 * @return the nombreFabricante
	 */
	public String getNombreFabricante() {
		return nombreFabricante;
	}

	/**
	 * @param nombreFabricante the nombreFabricante to set
	 */
	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}

	/**
	 * @return the tipoCombsutible
	 */
	public double getTipoCombsutible() {
		return tipoCombsutible;
	}

	/**
	 * @param tipoCombsutible the tipoCombsutible to set
	 */
	public void setTipoCombsutible(double tipoCombsutible) {
		this.tipoCombsutible = tipoCombsutible;
	}
	
	@Override
	public void desaparecer() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void divertir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actuar() {
		// TODO Auto-generated method stub
		
	}


	
}