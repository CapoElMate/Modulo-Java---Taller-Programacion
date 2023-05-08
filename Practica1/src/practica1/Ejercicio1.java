
package practica1;
import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int i;
        
        GeneradorAleatorio.iniciar();
        
        i = GeneradorAleatorio.generarInt(12);
        
        while(i != 11){
            
            System.out.println("i vale: " + i);
            
            i = GeneradorAleatorio.generarInt(12);
        }
        
        System.out.println("finalmente! i vale: " + i);
        
    }
    
}
