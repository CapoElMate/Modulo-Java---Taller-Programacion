

package practica3.Ejercicio1Triangulo;
import PaqueteLectura.Lector;

public class Ejercicio1Triangulo {

    
    public static void main(String[] args) {
        Triangulo triangulo;        
        
        double ladoA,ladoB,ladoC;
        String colorLinea,colorRelleno;
        
        System.out.println("ingresa el lado A: ");
        ladoA = PaqueteLectura.Lector.leerDouble();
        
        System.out.println("ingresa el lado B: ");
        ladoB = PaqueteLectura.Lector.leerDouble();
        
        System.out.println("ingresa el lado C: ");
        ladoC = PaqueteLectura.Lector.leerDouble();
        
        
        System.out.println("ingresa el color de los bordes: ");
        colorLinea = PaqueteLectura.Lector.leerString();
        
        System.out.println("ingresa el color del relleno: ");
        colorRelleno = PaqueteLectura.Lector.leerString();
        
        triangulo = new Triangulo(ladoA,ladoB,ladoC,colorRelleno,colorLinea);
        
        
        System.out.println("\nel trianguo: ");
        System.out.println("el perimetro: "+ triangulo.calcularPerimetro());
        System.out.println("el area: "+ triangulo.calcularArea());
        
        
    }
    
}
