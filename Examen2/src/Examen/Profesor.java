package Examen;

public class Profesor {
	String Nombre;
	String primerApellido;
	boolean Sustituto;
	public Profesor(String nombre, String primerApellido, boolean sustituto) {
		Nombre = nombre;
		this.primerApellido = primerApellido;
		Sustituto = sustituto;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public boolean isSustituto() {
		return Sustituto;
	}
	@Override
	public String toString() {
		return "Modulo [NOMBRE=" + Nombre + ", PRIMER APELLIDO=" + primerApellido + ", ES SUSTITUTO=" + Sustituto + "]";
	}
	
	

}
