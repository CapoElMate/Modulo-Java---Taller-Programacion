
package practica3.Ejercicio4Hotel;


public class Habitacion {
    private double costoPorNoche;
    private boolean estaOcupada;
    private Cliente cliente;
    
    
    public Habitacion(double costo){
        costoPorNoche = costo;
        estaOcupada = false;
        cliente = null;
    }
    
    public boolean ocuparHabitacion(Cliente c){
        boolean seIngreso = false;
        
        //aunque el ejercicio pide que suponga que la habitacion no esta ocupada, yo lo hice asi igual.
        if(!estaOcupada){
            
            cliente = c;
            estaOcupada = true;
            
            seIngreso = true;
        }        
        return seIngreso;
    }
    
    public void aumentarCosto(double aumento){
        costoPorNoche += aumento;
    }
    
    public boolean estaOcupada() {
        return estaOcupada;
    }
    
    public Cliente getCliente(){
        return cliente;
    }

    
    

    @Override
    public String toString() {
        String s;
        s = "por noche cuesta: "+ costoPorNoche + ", estaOcupada? " + estaOcupada;
        
        if (true)    s += ", aloja a = " + cliente;
        
        return s;
    }
    
    
    
}
