
package p5.ejercicio4.coro;


public class Corista extends Persona{
    
    private int tonoFundamental;

    public Corista(String nombre, int DNI, int edad, int tonoFundamental) {
        super(nombre, DNI, edad);
        this.tonoFundamental = tonoFundamental;
    }    
    
    public String toString(){
        return super.toString() + " ,tono: " + tonoFundamental;
    }

    public int getTonoFundamental() {
        return tonoFundamental;
    }
    
    
    
}
