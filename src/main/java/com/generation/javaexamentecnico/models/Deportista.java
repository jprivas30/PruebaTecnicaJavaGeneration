package com.generation.javaexamentecnico.models;

//----------------------------------OBJETO CON ATRIBUTOS---------------------------------------------


public class Deportista extends Alumno{
    public String deportePractica;
    public Boolean compite;
    
//-------------------------------------------CONSTRUCTOR---------------------------------------------
    
public Deportista() {
    super();
}
    
public Deportista(String deportePractica, Boolean compite) {
    this.deportePractica = deportePractica;
    this.compite = compite;
}
    
//-------------------------------------------GETTER AND SETTER---------------------------------------

public String getDeportePractica() {
    return deportePractica;
}

public void setDeportePractica(String deportePractica) {
    this.deportePractica = deportePractica;
}

public Boolean getCompite() {
    return compite;
}

public void setCompite(Boolean compite) {
    this.compite = compite;
}

@Override
public String toString() {
    return super.toString()+ "Deportista [deportePractica=" + deportePractica + ", compite=" + compite + "]";
}


}
