
package practica3.Ejercicio4Hotel;
import PaqueteLectura.GeneradorAleatorio;
import java.util.HashSet;
import java.util.Set;

public class Hotel {
    private int dimF; //cantidad de habitaciones totales
    private Habitacion habitaciones[];

    public Hotel(int dimF){
        this.dimF = dimF;
        
        habitaciones = new Habitacion[dimF];
        
        for(int i = 0; i<dimF ; i++){
            habitaciones[i] = new Habitacion(GeneradorAleatorio.generarInt(6001)+2000);            
        }
    }
    
    //tengo que ingresar un cliente aca.
    //en caso que necesite, retorno un false si no puedo ingresar en la habitacion.
    public boolean ingresarCliente(Cliente c, int nroHab){
        boolean seIngreso = false;
        Habitacion hab = habitaciones[nroHab];  //para mejorar la legibilidad, creo una referencia a la habitacion que me interesa.
        
        hab.ocuparHabitacion(c);
        
        return seIngreso;
    }
            
    
    public void aumentarPrecio(double aumento){
        
        Habitacion[] hs = habitaciones;  //para mejorar la legibilidad, creo una referencia a la habitacion que me interesa.
        
        for(int i = 0; i<dimF ; i++){
            hs[i].aumentarCosto(aumento);            
        }
        
    }
    
    @Override
    public String toString(){
        Habitacion[] hs = habitaciones;  //para mejorar la legibilidad, creo una referencia a la habitacion que me interesa.
        String str = "";
        
        for(int i = 0; i<dimF ; i++){
            str += "\nHabitacion " + (i+1) + " : " + hs[i].toString();
        }
        
        return str;
        
    }
    
    
    
    
}
