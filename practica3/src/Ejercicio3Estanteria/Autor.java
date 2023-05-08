

package practica3.Ejercicio3Estanteria;

import practica3.Ejercicio2Libro.*;

public class Autor {
    String nombre;
    String biografia;
    String origen;
    
    public Autor(String nombre, String biografia, String origen){
        this.nombre = nombre;
        this.biografia = biografia;
        this.origen = origen;
    }
    
    //getters y setters:
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getOrigen(){
        return this.origen;
    }
    
    public void setOrigen(String origen){
        this.origen = origen;
    }
    
    public String getBiografia(){
        return this.biografia;
    }
    
    public void setBiografia(String biografia){
        this.biografia = biografia;
    }
    
    @Override
    public String toString(){
        return (" [ " +this.nombre + " , \'"+this.biografia+"\' , de origen: "+this.origen +" ] ");
    }
    
    
    
    
}
