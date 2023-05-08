
package practica2;
import PaqueteLectura.Lector;

public class Ejercicio5Partidos {
    
    public static void main(String[] args) {
        
        Partido[] partidos = new Partido[20];
        Partido nuePart;
        int dimL = 0;
        
        nuePart = ingresarPartido();
        
        while(!nuePart.getVisitante().equals("zzz") && (dimL < 20)){
            
            partidos[dimL] = nuePart;
            nuePart = ingresarPartido();
            
            dimL++;
        }
        
        System.out.println("la cantidad de partidos ganados de river es: " + partidosGanadosRiver(partidos, dimL));
        System.out.println("la cantidad de goles de local de boca es: " + golesBocaLocal(partidos, dimL));
        
    }
    
    static int partidosGanadosRiver(Partido[] partidos, int dimL)    {
        int cantPartidos = 0;
        
        
        for(int i = 0; i<dimL; i++){
            if(partidos[i].getGanador().equals("river") || partidos[i].getGanador().equals("River"))
                cantPartidos++;
        }
        
        return cantPartidos;
        
    }
    
    static int golesBocaLocal(Partido[] partidos, int dimL){
        int cantGoles = 0;
        
        for(int i = 0; i<dimL ; i++){
            
            if(partidos[i].getLocal().equals("boca") || partidos[i].getLocal().equals("Boca"))
                cantGoles += partidos[i].getGolesLocal();            
            
        }
        
        return cantGoles;
    }
    
    static Partido ingresarPartido(){
        
        int golesVisitante = 0;
        int golesLocal = 0;
        String nombreVisitante = null;
        String nombreLocal = null;
        
        
        System.out.println("ingrese el equipo visitante y sus goles: ");
        
        nombreVisitante = PaqueteLectura.Lector.leerString();
        
        if(!nombreVisitante.equals("zzz")){
            
            golesVisitante = PaqueteLectura.Lector.leerInt();


            System.out.println("ingrese el equipo local y sus goles: ");

            nombreLocal = PaqueteLectura.Lector.leerString();
            golesLocal = PaqueteLectura.Lector.leerInt();
        
        }
        
        
        return new Partido(nombreLocal,nombreVisitante,golesLocal,golesVisitante);
    }
    
    
}
