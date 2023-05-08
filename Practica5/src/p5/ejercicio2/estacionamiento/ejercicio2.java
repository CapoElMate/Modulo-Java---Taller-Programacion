

package p5.ejercicio2.estacionamiento;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class ejercicio2 {

    
    public static void main(String[] args) {
        
        GeneradorAleatorio.iniciar();
        
        Estacionamiento e = new Estacionamiento("jorgito cocheras"," 13 e/ 40 y 41","10:00","23:00", 3, 3);
        
        
        //esto esta bien hacerlo asi? lo hice para no tener que crear 6 autos distintos.
        Auto autos[] = {new Auto("jorge","ASD-923"),
                        new Auto("homero","DOU-999"),
                        new Auto("ash","PKM-151"),
                        new Auto("rene","CAL-013"),
                        new Auto("pepe","JSN-123"),
                        new Auto("moni","LAD-231")
        };
                 //[auto][piso/plaza]
        int posicion[][] = {{1,1}, 
                            {0,1},
                            {1,0},
                            {1,2},
                            {0,2},
                            {2,2} };
        
        for (int i = 0; i < 6; i++) {
            e.ingresarAuto(autos[i], posicion[i][0] , posicion[i][1]);
        }
        
        
        //los ingreso al azar por "vagancia"
//        for (int i = 0; i < autos.length; i++) {
//            int piso,plaza;
//            
//            piso = GeneradorAleatorio.generarInt(3);
//            plaza = GeneradorAleatorio.generarInt(3);            
//            
//            System.out.println("piso: " + (piso+1) + " , plaza: " + (plaza+1));
//            
//            e.ingresarAuto(autos[i], piso , plaza);
//            //System.out.println(autos[i]);
//        }
        
        
        System.out.println("\n\n" + e);
        System.out.println("cant. autos en la plaza 1: " + e.obtenerCantAutosEnPlaza(0));
        
        System.out.print("encontrar la patente: ");
        String patenteABuscar = Lector.leerString();
        
        while(patenteABuscar != "AAA-000"){
            System.out.println(e.encontrarPatente(patenteABuscar));
            patenteABuscar = Lector.leerString();            
        } 
        
    }
    
}
