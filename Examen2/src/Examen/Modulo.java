package Examen;

import java.util.ArrayList;
import java.util.List;


public class Modulo {
	String Nombre;
	int DuracionHoras;
	List<String> ImpartenModulo = new ArrayList<String>();
	List<String> Alumnos = new ArrayList<String>();
	String AlumnosMatriculados;
	
	public Modulo(String nombre, int duracionHoras, List<String> impartenModulo, List<String> alumnos) {
		Nombre = nombre;
		DuracionHoras = duracionHoras;
		ImpartenModulo = impartenModulo;
		Alumnos = alumnos;
	}
	public String getNombre() {
		return Nombre;
	}
	public int getDuracionHoras() {
		return DuracionHoras;
	}
	public List<String> getImpartenModulo() {
		return ImpartenModulo;
	}
	public List<String> getAlumnos() {
		return Alumnos;
	}
	

	public void setAlumnos(List<String> alumnos) {
		if(Alumno.Edad <= 17){
		Alumnos = alumnos;
		}
		else{
		try {
			
		} catch (Exception e) {
			System.out.println("No es menor de edad");
		}
		}
	}
	public void setAlumnosMatriculados(String alumnosMatriculados) {
		AlumnosMatriculados = alumnosMatriculados;
	}
	public void setImpartenModulo(List<String> impartenModulo) {
		ImpartenModulo = impartenModulo;
	}
	@Override
	public String toString() {
		return "Modulo [NOMBRE DEL MODULO=" + Nombre + ", HORAS=" + DuracionHoras + ", PROFESORES=" + ImpartenModulo
				+ ", ALUMNOS=" + AlumnosMatriculados + "]";
	}
	
	
		
}

	
	
	

