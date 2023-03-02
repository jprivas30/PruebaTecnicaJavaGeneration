package com.generation.javaexamentecnico;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.javaexamentecnico.models.Alumno;
import com.generation.javaexamentecnico.models.Curso;
import com.generation.javaexamentecnico.models.Profesor;

import java.util.Collections;

import java.util.ArrayList;

@SpringBootApplication
public class JavaexamentecnicoApplication {

//------------------------------FUNCION PARA HALLAR EL PROMEDIO DE NOTAS-------------------------------------

public static Double promedioNotas(ArrayList<Double> notas){
	Double promedioArray;
	Double suma = 0.0;
	for (int i = 0; i < notas.size(); i++) {
		suma += notas.get(i);		
	} 
	promedioArray= suma/notas.size();
	return Math.round(promedioArray * 100d) / 100d;
}

//-------------------------------FUNCION PARA MOSTRAR EL PROGRAMA PRINCIPAL ---------------------------------

public static void mostrarPrograma(Scanner teclado){

//DECLARACION DE VARIABLES

Integer cantidadAlumnos;
String nombreProfesor;
String apellidoProfesor;
String materia;
String grado;
Profesor profesor1= new Profesor();
Curso curso1= new Curso();
Integer cantidadNotas;
curso1.setNotaAprovatoria(7.0);
ArrayList <Alumno> listaClases= new ArrayList<>(); 

//PARA COMENZAR EL PROGRAMA 

System.out.print("------------------------ BIENVENIDO AL PORTAL DE EVALUACION --------------------------------");
System.out.print("\n ------------------------------INGRESE SUS DATOS ------------------------------ \n");

//PEDIR DATOS AL USUARIO DEL PROFESOR, MATERIA Y CURSO

teclado.nextLine();
System.out.print("\nIndique su nombre Profesor: ");
nombreProfesor = teclado.nextLine();
profesor1.setNombre(nombreProfesor);
System.out.print("Indique su apellido por favor: ");
apellidoProfesor = teclado.nextLine();
profesor1.setApellido(apellidoProfesor);
System.out.print("Indique la materia que imparte por favor: ");
materia = teclado.nextLine();
profesor1.setMateria(materia);
System.out.print("Indique el curso al que pertenecen los alumnos a evaluar : ");
grado = teclado.nextLine();
curso1.setGrado(grado);

//PARA VALIDAD LAS OPCIONES QUE ELIJA EL USUARIO

do{
	System.out.print("Indique la cantidad de alumnos a evaluar : ");
	cantidadAlumnos = teclado.nextInt();
	
	if(cantidadAlumnos <= 0){
		System.out.print("La cantidad de alumnos debe ser mayor a cero, porfavor intente denuevo");
	}
}while(cantidadAlumnos <= 0);

curso1.setCantidadAlumnos(cantidadAlumnos);

do{
	System.out.print("Indique la cantidad de notas por alumnos: ");
	cantidadNotas = teclado.nextInt();
	if(cantidadNotas <= 0){
		System.out.print("La cantidad de notas debe ser mayor a cero, por favor entente mas tarde");
	}
}while(cantidadNotas <= 0);

//COMENZAR A SOLICITAR DATOS DEL ALUMNO 
System.out.print("\n ------------------------INGRESE DATOS DE LOS ALUMNOS ------------------------- \n");

ArrayList <Double> notasCurso = new ArrayList<>();

//CICLO PARA ITERAR LA CANTIDAD DE VECES QUE VA A PEDIR DATOS (QUE SEA UNA VEZ POR ALUMNO)
for(int i = 1; i<= cantidadAlumnos; i++){
	
	Alumno alumnoNuevo= new Alumno();
	teclado.nextLine();
	alumnoNuevo.setCurso(grado);
	System.out.print("\nIndique el nombre del Alumno(a) : ");
	alumnoNuevo.setNombre(teclado.nextLine());
	System.out.print("Indique el apellido del Alumno(a) : ");
	alumnoNuevo.setApellido(teclado.nextLine());
	ArrayList <Double> notaAlum = new ArrayList<Double>();

//CICLO PARA SOLICITAR Y GUARDAR LOS DATOS DE LAS NOTAS INGRESADAS POR EL USUARIO
	for(int x = 1; x<= cantidadNotas; x++){
		
		do{
			
			if(cantidadNotas <= 0){
				System.out.print("La cantidad de notas debe ser mayor a cero, por favor entente mas tarde");
			}
		}while(cantidadNotas <= 0);
		
		System.out.print("Indique la nota " + x + " de "+ profesor1.getMateria()+ " del Alumno " + alumnoNuevo.getNombre() + " en formato decimal (ejemplo: 5.3): ");	
		notaAlum.add(teclado.nextDouble());
	
	//METODO PARA ORDENAR ARRAYLIST JAVA 
		Collections.sort(notaAlum);
	}
	alumnoNuevo.setNotas(notaAlum);
	alumnoNuevo.setPeorNota(notaAlum.get(0));
	alumnoNuevo.setMejorNota (notaAlum.get(notaAlum.size() - 1));
	alumnoNuevo.setPromedio(promedioNotas(notaAlum));
	notasCurso.add(promedioNotas(notaAlum));
	listaClases.add(alumnoNuevo);
	curso1.setNotas(notasCurso);
}

int opciones;
// MENU PARA VISUALIZAR LOS DATOS INGRESADOS
do{
	System.out.println("\n---------------------------HA FINALIZADO LA RECEPCION DE DATOS---------------------------------------\n");
	System.out.println("Seleccione 1 si desea VER LOS DATOS INGRESADOS AL PROGRAMA");
	System.out.println("Seleccione 0 para SALIR del menú");
	System.out.print("Seleccione su opción: ");
	opciones = teclado.nextInt();
	
}while(opciones < 0 || opciones > 1);

//ACCIONES QUE SE VAN A REALIZAR DEPENDE DE LA OPCION SELECCIONADA POR EL USUARIO 

if(opciones == 1){
		System.out.println("\n ------------------------LOS DATOS DEL CURSO "+ curso1.getGrado() + " SON: ------------------------- \n");
		System.out.println("Profesor del Curso : " + profesor1.getNombre() + " " + profesor1.getApellido());
		System.out.println("Materia Impartida: " + profesor1.getMateria());
		System.out.println("La lista de los Estudiantes del curso son : \n" + listaClases);
		System.out.println("La nota promedio del curso es : "+ promedioNotas(curso1.getNotas()));
	}else{
	System.out.println("\nGracias por cerrar el Menu");
}
}

	public static void main(String[] args) {

//INICIALIZACION DEL TECLADO
Scanner teclado= new Scanner(System.in);

int opcion;
//MENU PRINCIPAL DEL PROGRAMA 
do{
	System.out.println("\n-----------------------MENU PRINCIPAL PORTAL DE EVALUACION--------------------------------\n");
	System.out.println("Bienvenido/a");
	System.out.println("Seleccione 1 si quiere COMENZAR A USAR EL PROGRAMA");
	System.out.println("Seleccione 0 para SALIR DEL MENU");
	System.out.print("Seleccione su opción: ");
	opcion = teclado.nextInt();
	
}while(opcion < 0 || opcion > 2);

//ACCIONES QUE SE VAN A REALIZAR DEPENDE DE LA OPCION SELECCIONADA POR EL USUARIO 

if(opcion == 1){
	mostrarPrograma(teclado);
 	}else{
	System.out.println("\nGracias por cerrar el Menu");
	teclado.close();
}

}
}


