
package practica3.Ejercicio5Circulos;
import PaqueteLectura.Lector;

public class Principal {

    public static void main(String[] args) {
        double radio;
        String cRelleno,cLinea;
        
        radio = Lector.leerDouble();
        
        cRelleno = Lector.leerString();
        cLinea = Lector.leerString();
        
        Circulo circulo = new Circulo(radio,cRelleno,cLinea);
        
        System.out.print("el perimetro: " + circulo.calcularPerimetro());
        System.out.println(" el area: "+ circulo.calcularArea());
        
    }
    
}
