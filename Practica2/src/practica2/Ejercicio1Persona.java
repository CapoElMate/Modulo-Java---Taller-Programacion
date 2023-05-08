
package practica2;
import PaqueteLectura.Lector;

public class Ejercicio1Persona {

    public static void main(String[] args) {
        Persona persona;
        String nombre;
        int dni;
        int edad;
        
        System.out.print("ingrese nombre: ");
        nombre = PaqueteLectura.Lector.leerString();
        
        System.out.print("ingrese dni: ");
        dni = PaqueteLectura.Lector.leerInt();
        
        System.out.print("ingrese edad: ");
        edad = PaqueteLectura.Lector.leerInt();
        
        persona = new Persona(nombre,dni,edad);
        
        System.out.println(persona);
        
        
    }
    
    static void crearPersona(Persona p){
        
        
        
        
    }
    
}



