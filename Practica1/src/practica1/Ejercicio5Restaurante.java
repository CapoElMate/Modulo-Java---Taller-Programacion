
package practica1;

import PaqueteLectura.Lector;

public class Ejercicio5Restaurante {

    public static void main(String[] args) {
        
                                    //clientes / aspectos
        int[][] calificaciones = new int[5][4];
        
        for (int i = 0; i<5; i++){
            System.out.println("cliente "+i+": ");
            
            for(int j = 0; j<4; j++){
                System.out.println("aspecto " +j+ " : ");
                calificaciones[i][j] = PaqueteLectura.Lector.leerInt();
            }
        }
        
        int sumatoria;
        
        //aspecto
        for(int i = 0; i<4; i++){
            sumatoria = 0;
            
            //clientes:
            for (int j = 0; j<5; j++){
                sumatoria += calificaciones[j][i];
            }
            double promedio = (sumatoria/5.0);
            System.out.println("el promedio para el aspecto"+i+": " + promedio);
        }        
    }
    
}
