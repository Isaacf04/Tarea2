/**
 * 
 */
package com.ucreativa;

/**
 * @author Isaac
 *
 */
public class Estudiante extends Persona {
	// variables

	public String carrera;
	public String curso;
	public int cantidadCreditos;
	
	// constructor
	/**
	 * @param carrera
	 * @param curso
	 * @param cantidadCreditos
	 */
	public Estudiante(String carrera, String curso, int cantidadCreditos, int edad, String nombre, String identificacion) {
		super();
		super.edad = edad;
		super.nombre = nombre;
		super.identificacion = identificacion;
		this.carrera = carrera;
		this.curso = curso;
		this.cantidadCreditos = cantidadCreditos;
	}
	
	// get-set

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getCantidadCreditos() {
		return cantidadCreditos;
	}

	public void setCantidadCreditos(int cantidadCreditos) {
		this.cantidadCreditos = cantidadCreditos;
	}
	
	public void estudiarJava() {
		System.out.println("Estoy estudiando Java OOP");
	}
	
	public void hacerProyecto() {
		System.out.println("Terminar proyecto Amazon");
	}
	
	public void EsperarResultadoCurso() {
		System.out.println("Esperando resultado");
	}	
	
}
