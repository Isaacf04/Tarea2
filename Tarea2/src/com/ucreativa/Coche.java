/**
 * 
 */
package com.ucreativa;

/**
 * @author Isaac
 *
 */
public class Coche extends Vehiculo {

	// properties
			private String marcaCoche;
			private String cantidadMarchas;
			private String colorCoche;
			
						
			// constructor
			
			
		// set-get
			/**
			 * @return the marcaCoche
			 */
			public String getMarcaCoche() {
				return marcaCoche;
			}
			/**
			 * @param marcaVehiculo
			 * @param nombreFabricante
			 * @param tipoCombsutible
			 */
			public Coche(String marcaVehiculo, String nombreFabricante, double tipoCombsutible, String marcaCoche, String cantidadMarchas, String colorCoche) {
				super(marcaVehiculo, nombreFabricante, tipoCombsutible);
				this.marcaCoche = marcaCoche;
				this.cantidadMarchas = cantidadMarchas;
				this.colorCoche = colorCoche;
				// TODO Auto-generated constructor stub
			}
			
			// methods
			/**
			 * @param marcaCoche the marcaCoche to set
			 */
			public void setMarcaCoche(String marcaCoche) {
				this.marcaCoche = marcaCoche;
			}
			/**
			 * @return the cantidadMarchas
			 */
			public String getCantidadMarchas() {
				return cantidadMarchas;
			}
			/**
			 * @param cantidadMarchas the cantidadMarchas to set
			 */
			public void setCantidadMarchas(String cantidadMarchas) {
				this.cantidadMarchas = cantidadMarchas;
			}
			/**
			 * @return the colorCoche
			 */
			public String getColorCoche() {
				return colorCoche;
			}
			/**
			 * @param colorCoche the colorCoche to set
			 */
			public void setColorCoche(String colorCoche) {
				this.colorCoche = colorCoche;
			}
			
			
			@Override
			public String toString() {
				return "Coche [marcaCoche=" + marcaCoche + ", cantidadMarchas=" + cantidadMarchas + ", colorCoche="
						+ colorCoche + "]";
			}			

}
