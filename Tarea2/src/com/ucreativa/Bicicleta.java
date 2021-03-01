/**
 * 
 */
package com.ucreativa;

/**
 * @author Isaac
 *
 */
public class Bicicleta extends Vehiculo {

	// properties
		private String marcaBici;
		private String cantidadCmabios;
		private String colorBici;
		
		
		// constructor
		/**
		 * @param marcaVehiculo
		 * @param nombreFabricante
		 * @param tipoCombsutible
		 */
		public Bicicleta(String marcaVehiculo, String nombreFabricante, double tipoCombsutible, String marcaBici, String cantidadCmabios, String colorBici ) {
			super(marcaVehiculo, nombreFabricante, tipoCombsutible);
			this.marcaBici = marcaBici;
			this.cantidadCmabios = cantidadCmabios;
			this.colorBici = colorBici;
			// TODO Auto-generated constructor stub
		}
		
		
		// get-set		
	
	

	/**
		 * @return the marcaBici
		 */
		public String getMarcaBici() {
			return marcaBici;
		}

		/**
		 * @param marcaBici the marcaBici to set
		 */
		public void setMarcaBici(String marcaBici) {
			this.marcaBici = marcaBici;
		}

		/**
		 * @return the cantidadCmabios
		 */
		public String getCantidadCmabios() {
			return cantidadCmabios;
		}

		/**
		 * @param cantidadCmabios the cantidadCmabios to set
		 */
		public void setCantidadCmabios(String cantidadCmabios) {
			this.cantidadCmabios = cantidadCmabios;
		}

		/**
		 * @return the colorBici
		 */
		public String getColorBici() {
			return colorBici;
		}

		/**
		 * @param colorBici the colorBici to set
		 */
		public void setColorBici(String colorBici) {
			this.colorBici = colorBici;
		}
		
		// methods

	public void transportar() {
		System.out.println("Viajo mas rapido que una tortuga");
	}
	
	public void metodoBici1() {
		System.out.println("Soy una bicicleta");
	}
	
	public void metodoBici2() {
		System.out.println("Viaje ecologico");
	}


	@Override
	public String toString() {
		return "Bicicleta [marcaBici=" + marcaBici + ", cantidadCmabios=" + cantidadCmabios + ", colorBici=" + colorBici
				+ "]";
	}	
	

}
