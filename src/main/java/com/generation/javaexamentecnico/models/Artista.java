package com.generation.javaexamentecnico.models;


//----------------------------------OBJETO CON ATRIBUTOS---------------------------------------------


public class Artista extends Alumno{
    public String area;
    public String artistaFavorito;

//-------------------------------------------CONSTRUCTOR---------------------------------------------

public Artista() {
    super();
}

public Artista(String area, String artistaFavorito) {
    this.area = area;
    this.artistaFavorito = artistaFavorito;
}
    
//-------------------------------------------GETTER AND SETTER---------------------------------------


public String getArea() {
    return area;
}

public void setArea(String area) {
    this.area = area;
}

public String getArtistaFavorito() {
    return artistaFavorito;
}

public void setArtistaFavorito(String artistaFavorito) {
    this.artistaFavorito = artistaFavorito;
}

@Override
public String toString() {
    return super.toString()+ "Artista {area=" + area + ", artistaFavorito=" + artistaFavorito + "}";
}


}
