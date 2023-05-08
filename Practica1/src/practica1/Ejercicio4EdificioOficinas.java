
package practica1;
import PaqueteLectura.Lector;

public class Ejercicio4EdificioOficinas {


    public static void main(String[] args) {
        
        //matriz de           pisos / oficinas
        int[][] edificio = new int[8][5];
                        
        Integer piso  = 0;
        Integer oficina = 0;
        
        System.out.println("ingrese el piso: ");
        piso = PaqueteLectura.Lector.leerInt();
    
        System.out.println("ingrese la oficina: ");
        oficina = PaqueteLectura.Lector.leerInt();

        while(piso != 9){
            edificio[piso][oficina]++;
            System.out.println("ingrese el piso: ");
            piso = PaqueteLectura.Lector.leerInt();

            System.out.println("ingrese la oficina: ");
            oficina = PaqueteLectura.Lector.leerInt();
        }
        
        
        mostrarEdificio(edificio);
        
            
        
    }
    
    static void mostrarEdificio(int[][] edi){
        for(int i = 0; i < 8; i++){
            for (int j = 0; j < 4; j++){
                System.out.print("["+edi[i][j]+"]");
            } 
            System.out.println("");
        }
    }
    
    
    
    static void ingresarPersona(Integer p,Integer o){
        
        System.out.println("ingrese el piso: ");
        p = PaqueteLectura.Lector.leerInt();
    
        System.out.println("ingrese la oficina: ");
        o = PaqueteLectura.Lector.leerInt();
        
        
        System.out.println("");
    }
    
    
}
