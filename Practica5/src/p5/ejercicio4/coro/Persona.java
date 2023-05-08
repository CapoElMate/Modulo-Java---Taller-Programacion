package p5.ejercicio4.coro;

public abstract class Persona {
    private String nombre;
    private int DNI;
    private int edad;

    public Persona(String nombre, int DNI, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }
    
    
    @Override
    public String toString() {
        return "nombre: " + nombre + ", DNI: " + DNI + ", edad: " + edad;
    }
}
