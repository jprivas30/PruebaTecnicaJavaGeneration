package com.generation.javaexamentecnico.models;

//----------------------------------OBJETO CON ATRIBUTOS---------------------------------------------

public class Profesor {
    public String nombre;
	public String apellido;
    public String materia;

//-------------------------------------------CONSTRUCTOR---------------------------------------------

public Profesor() {
}

public Profesor(String nombre, String apellido, Integer edad, String materia, String telefonoEmergencia) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.materia = materia;
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


public String getMateria() {
    return materia;
}


public void setMateria(String materia) {
    this.materia = materia;
}


@Override
public String toString() {
    return "Profesor {nombre=" + nombre + ", apellido=" + apellido + ", materia=" + materia
            + "}";
}

//-------------------------------------------FUNCIONALIDADES-----------------------------------------

public void enseniar(){
    System.out.println("Me encanta enseñar");

}

public void evaluar(){
    System.out.println("Los reprovare a todos");

}

}
