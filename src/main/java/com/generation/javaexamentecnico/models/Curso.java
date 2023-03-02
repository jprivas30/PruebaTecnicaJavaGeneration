package com.generation.javaexamentecnico.models;

import java.util.ArrayList;

//----------------------------------OBJETO CON ATRIBUTOS---------------------------------------------

public class Curso {
    public String grado;
    public Integer cantidadAlumnos;
    public ArrayList <Double> notas;
    public Double notaAprovatoria;
    public ArrayList <Alumno> estudiantesCurso;
    
//-------------------------------------------CONSTRUCTOR---------------------------------------------

public Curso() {
}

public Curso(String grado, Integer cantidadAlumnos, ArrayList<Double> notas, Double notaAprovatoria,
        ArrayList<Alumno> estudiantesCurso) {
    this.grado = grado;
    this.cantidadAlumnos = cantidadAlumnos;
    this.notas = notas;
    this.notaAprovatoria = notaAprovatoria;
    this.estudiantesCurso = estudiantesCurso;
}

//-------------------------------------------GETTER AND SETTER---------------------------------------

public String getGrado() {
    return grado;
}

public void setGrado(String grado) {
    this.grado = grado;
}

public Integer getCantidadAlumnos() {
    return cantidadAlumnos;
}

public void setCantidadAlumnos(Integer cantidadAlumnos) {
    this.cantidadAlumnos = cantidadAlumnos;
}

public ArrayList<Double> getNotas() {
    return notas;
}

public void setNotas(ArrayList<Double> notas) {
    this.notas = notas;
}

public Double getNotaAprovatoria() {
    return notaAprovatoria;
}

public void setNotaAprovatoria(Double notaAprovatoria) {
    this.notaAprovatoria = notaAprovatoria;
}

public ArrayList<Alumno> getEstudiantesCurso() {
    return estudiantesCurso;
}

public void setEstudiantesCurso(ArrayList<Alumno> estudiantesCurso) {
    this.estudiantesCurso = estudiantesCurso;
}

@Override
public String toString() {
    return "Curso [grado=" + grado + ", cantidadAlumnos=" + cantidadAlumnos + ", notas=" + notas + ", notaAprovatoria="
            + notaAprovatoria + ", estudiantesCurso=" + estudiantesCurso + "]";
}


//-------------------------------------------FUNCIONALIDADES-----------------------------------------


}
