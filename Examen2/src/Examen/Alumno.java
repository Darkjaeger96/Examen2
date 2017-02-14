package Examen;

public class Alumno {
	String Nombre;
	String Apellidos;
	static int Edad;
	public Alumno(String nombre, String apellidos, int edad) {
		Nombre = nombre;
		Apellidos = apellidos;
		Edad = edad;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public int getEdad() {
		return Edad;
	}
	@Override
	public String toString() {
		return "Alumno [NOMBRE= " + Nombre + ", APELLIDOS= " + Apellidos + ", EDAD= " + Edad + "]";
	}
	
	
	
}
