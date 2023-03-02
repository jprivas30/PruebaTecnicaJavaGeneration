package com.generation.javaexamentecnico.models;

//----------------------------------OBJETO CON ATRIBUTOS---------------------------------------------


public class Materia {
    public String catedra;
    public String profesor;
	public String aula;
    
//-------------------------------------------CONSTRUCTOR---------------------------------------------
    
public Materia() {
}
    
public Materia(String catedra, String profesor, String aula) {
    this.catedra = catedra;
    this.profesor = profesor;
    this.aula = aula;
}
    
//-------------------------------------------GETTER AND SETTER---------------------------------------

public String getcatedra() {
    return catedra;
}

public void setcatedra(String catedra) {
    this.catedra = catedra;
}
public String getProfesor() {
    return profesor;
}
public void setProfesor(String profesor) {
    this.profesor = profesor;
}
public String getAula() {
    return aula;
}
public void setAula(String aula) {
    this.aula = aula;
}
@Override
    public String toString() {
    return "Materia [catedra=" + catedra + ", profesor=" + profesor + ", aula=" + aula + "]";
}

//-------------------------------------------FUNCIONALIDADES-----------------------------------------

}
