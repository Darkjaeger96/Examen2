package Examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//importa las bibliotecas que creas necesaria.
public class Curso{

  public static void main (String[]arg){
	 List<String> ListaAlumnos = new ArrayList<String>();
    Alumno alumno1 = new Alumno("joaquinto", "pocas luces", 13);
    Alumno alumno2 = new Alumno("alvaro","elistillo de clase", 15);
    Alumno alumno3 = new Alumno("antonio", "pedante sabelotodo", 43);
    Alumno alumno4 = new Alumno("beatriz", "aprueba todo", 23);
    Alumno alumno5 = new Alumno("carmen", "brillante brillante", 17);
    
    List<String> ListaProfesores = new ArrayList<String>();
    Profesor profesor1 = new Profesor("augusto", "mecargotodo", true);
    Profesor profesor2 = new Profesor("pedrito", "machacón", false);
    //crea un objeto de tipo modulo
    modulo();
    
    //añade los alumnos y los profesores
    
    //lee desde la clase scanner el nombre del módulo
    //y las horas del mismo, dichas horas deben estar comprendidas entre
    //3 a 8
    Scanner in = new Scanner(System.in);
    String NombreModulo = in.next();
    System.out.printf("Nombre del modulo: %n%s", NombreModulo);
    int HorasModulo = in.nextInt();
    System.out.printf("Lista de Alumnos menores de edad: %n%d", Alumno.Edad);
    System.out.printf("Lista de alumnos: %n%s", ListaAlumnos);
    System.out.printf("Lista de profesores: %n%s", ListaProfesores);
    
    

    //usa una expresión regular para controlar el dato introducido
    //tanto para que sea un entero y está en ese rango de valor
    //igual con el  nombre del módulo, deben ser solo letras
    //NO puede lanzarse una excepción por introducir un valor no entero
    //en el caso que la cantidad introducida no corresponda al rango anterior
    //o no sea una cadena de letras el nombre del módulo
    //se establecerá 6 horas en caso de una lectura errónea
    //y DEFAULT como nombre del ciclo  en caso incorrecto 

    //imprime la referencia del módulo
    //imprime la lista de alumnos
    //imprime la lista alumnes menores de edad
    //imprime la lista de profesores

  }
private static void modulo() {
	// TODO Auto-generated method stub
}
}
