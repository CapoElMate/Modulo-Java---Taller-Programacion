
package practica1;
import PaqueteLectura.Lector;


public class Ejercicio2Jugadores {

    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
        double[] vec;
        
        
        //Paso 3: Crear el vector para 15 double     
        vec = new double[15];
        
        //Paso 4: Declarar indice y variables auxiliares a usar
        int i;
        double suma = 0;
        double promedio;
        
        int cantSobrePromedio = 0;
        
        
        
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        for (i=0; i<15; i++){
            
            System.out.print("ingrese la altura del jugador "+ (i+1) +" : ");
            vec[i] = PaqueteLectura.Lector.leerDouble();
            System.out.println("");
            
            suma += vec[i];
        }
        
        //Paso 7: Calcular el promedio de alturas, informarlo
        promedio = suma / 15;
        System.out.println("promedio de altura: "+ promedio);
        
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        for (i=0; i<15; i++){
            if(vec[i] > promedio)
                cantSobrePromedio++; 
                 
        }
        
        //Paso 9: Informar la cantidad.
        System.out.println("la cantidad de jugadores por encima del promedio es: "+ cantSobrePromedio);  
        
        
    }
    
}
