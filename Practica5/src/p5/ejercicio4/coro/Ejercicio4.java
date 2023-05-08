
package p5.ejercicio4.coro;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio4 {

    
    public static void main(String[] args) {
        System.out.println("ingrese la cantidad de hileras ");
        //int cantidadHileras = Lector.leerInt();
        int cantidadHileras =2;
        
        System.out.println("las personas por hilera: ");
        //int personasHilera = Lector.leerInt();
        int personasHilera =2;
        
        System.out.println("nombre del coro: ");
        String nombre = Lector.leerString();
        
        System.out.println("datos del director: ");
        Director direc = ingresarDirectorRnd();
        
        CoroPorHileras coroHileras = new CoroPorHileras(nombre, direc, cantidadHileras, personasHilera);
        
        for (int i = 0; i < coroHileras.getCoristasMaximos() ; i++) {
            coroHileras.agregarCorista(ingresarCoristaRnd());
            System.out.println("el coro esta lleno? "+ coroHileras.estaLleno());            
        }
        
        System.out.println(coroHileras);
        
        if(coroHileras.estaBienFormado())
            System.out.println("el coro esta bien formado");
        else   
            System.out.println("el coro NO esta bien formado");
    }
    
    
    
    //(String nombre, int DNI, int edad, int tonoFundamental)
    public static Corista ingresarCorista(){
        System.out.print("ingrese el nombre del corista: ");        
        String nombre = Lector.leerString();
        
        System.out.print("ingrese el DNI del corista: ");        
        int DNI = Lector.leerInt();
        
        System.out.print("ingrese la edad del corista: ");        
        int edad= Lector.leerInt();
        
        System.out.print("ingrese el tono del corista: ");        
        int tono= Lector.leerInt();
        
        return new Corista(nombre,DNI,edad,tono);
    }
    
    //(String nombre, int DNI, int edad, int antiguedad)
    public static Director ingresarDirector(){
        System.out.print("ingrese el nombre: ");        
        String nombre = Lector.leerString();
        
        System.out.print("ingrese el DNI: ");        
        int DNI = Lector.leerInt();
        
        System.out.print("ingrese la edad: ");        
        int edad= Lector.leerInt();
        
        System.out.print("ingrese su antiguedad: ");        
        int antiguedad= Lector.leerInt();
        
        return new Director(nombre,DNI,edad,antiguedad);
    }
    
    public static Director ingresarDirectorRnd(){
        String nombre = GeneradorAleatorio.generarString(5);
        System.out.print("nombre: ");        
        
        int DNI = GeneradorAleatorio.generarInt(100000000);
        System.out.print(" DNI: ");        
        
        int edad= GeneradorAleatorio.generarInt(100);
        System.out.print(" edad: ");        
        
        int antiguedad= GeneradorAleatorio.generarInt(20);
        System.out.print(" antiguedad: ");        
        
        return new Director(nombre,DNI,edad,antiguedad);
    }
    
    
//(String nombre, int DNI, int edad, int tonoFundamental)
    public static Corista ingresarCoristaRnd(){
        String nombre = GeneradorAleatorio.generarString(5);
        System.out.print("ingrese el nombre del corista: " + nombre);        
        
        int DNI = GeneradorAleatorio.generarInt(10000000);
        System.out.print("ingrese el DNI del corista: "+DNI);        
        
        int edad= GeneradorAleatorio.generarInt(100);
        System.out.print("ingrese la edad del corista: "+edad);        
        
        System.out.print("ingrese el tono del corista: ");        
        int tono= Lector.leerInt();
        
        return new Corista(nombre,DNI,edad,tono);
    }
    
}
