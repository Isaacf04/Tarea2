/**
 * 
 */
package com.ucreativa;

/**
 * @author Isaac
 *
 */
public class Profesor extends Persona {
	private String correo;
	private int experiencia;
	private double salario;
	
	// constructor
	
	/**
	 * @param correo
	 * @param experiencia
	 * @param salario
	 */
	public Profesor(String nombre, int edad, String identificacion, String correo, int experiencia, double salario) {
		super();
		super.edad = edad;
		super.nombre = nombre;
		super.identificacion = identificacion;
		this.correo = correo;
		this.experiencia = experiencia;
		this.salario = salario;
	}

	// get-set
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void planear() {
		System.out.println("I am doing planning");		
	}
	
	public void darClase() {
		System.out.println("Dar clase Java");		
	}
	
	public void calificarTarea2() {
		System.out.println("Entregar completo");		
	}

	@Override
	public String toString() {
		return "Profesor [correo=" + correo + ", experiencia=" + experiencia + ", salario=" + salario + ", nombre="
				+ nombre + ", identificacion=" + identificacion + ", edad=" + edad + "]";
	}	
	
	
}
