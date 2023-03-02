package com.generation.javaexamentecnico.models;

//----------------------------------OBJETO CON ATRIBUTOS---------------------------------------------

public class Academico extends Alumno{
    public String areaInteres;
    public String libroFavorito;
    
//-------------------------------------------CONSTRUCTOR---------------------------------------------
    
public Academico() {
    super();
    }

public Academico(String areaInteres, String libroFavorito) {
    this.areaInteres = areaInteres;
    this.libroFavorito = libroFavorito;
}

//-------------------------------------------GETTER AND SETTER---------------------------------------

public String getAreaInteres() {
    return areaInteres;
}

public void setAreaInteres(String areaInteres) {
    this.areaInteres = areaInteres;
}

public String getLibroFavorito() {
    return libroFavorito;
}

public void setLibroFavorito(String libroFavorito) {
    this.libroFavorito = libroFavorito;
}

@Override
public String toString() {
    return super.toString()+ " Academico [areaInteres=" + areaInteres + ", libroFavorito=" + libroFavorito + "]";
}


}
