package com.generation.javaexamentecnico.models;
import java.util.ArrayList;

//----------------------------------OBJETO CON ATRIBUTOS---------------------------------------------

public class Alumno {
    public String nombre;
	public String apellido;
    public String curso;
    public ArrayList <Double> notas;
    public Double promedio;
    public Double mejorNota;
    public Double peorNota;
    
//-------------------------------------------CONSTRUCTOR---------------------------------------------
    
public Alumno() {
}

public Alumno(String nombre, String apellido, String curso, ArrayList<Double> notas, Double promedio, Double mejorNota,
        Double peorNota) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.curso = curso;
    this.notas = notas;
    this.promedio = promedio;
    this.mejorNota = mejorNota;
    this.peorNota = peorNota;
}

//-------------------------------------------GETTER AND SETTER---------------------------------------


public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public String getCurso() {
    return curso;
}

public void setCurso(String curso) {
    this.curso = curso;
}

public ArrayList<Double> getNotas() {
    return notas;
}

public void setNotas(ArrayList<Double> notas) {
    this.notas = notas;
}

public Double getPromedio() {
    return promedio;
}

public void setPromedio(Double promedio) {
    this.promedio = promedio;
}

public Double getMejorNota() {
    return mejorNota;
}

public void setMejorNota(Double mejorNota) {
    this.mejorNota = mejorNota;
}

public Double getPeorNota() {
    return peorNota;
}

public void setPeorNota(Double peorNota) {
    this.peorNota = peorNota;
}

@Override
public String toString() {
    return "\nAlumno [nombre=" + nombre + ", apellido=" + apellido + ", curso=" + curso + ", notas=" + notas
            + ", promedio=" + promedio + ", mejorNota=" + mejorNota + ", peorNota=" + peorNota + "]";
}


//-------------------------------------------FUNCIONALIDADES-----------------------------------------

public void estudiar(){
    System.out.println("Me encanta estudiar ;D");
}

}


