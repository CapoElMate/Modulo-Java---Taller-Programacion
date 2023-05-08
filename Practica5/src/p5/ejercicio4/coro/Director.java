package p5.ejercicio4.coro;

public class Director extends Persona{

    private int antiguedad;
    
    public Director(String nombre, int DNI, int edad,int antiguedad) {
        super(nombre, DNI, edad);
        this.antiguedad = antiguedad;
    }

    
    public String toString() {
        return super.toString() + " ,antiguedad: " + antiguedad;
    }
    
    
    
}
