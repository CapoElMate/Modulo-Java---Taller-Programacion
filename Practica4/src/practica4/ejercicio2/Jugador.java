
package practica4.ejercicio2;


public class Jugador extends Empleado{
    
    private int cantPartidos;
    private int cantGoles;

    public Jugador(String n, double s, int a,int cantPartidos, int cantGoles) {
        super(n, s, a);
        this.cantPartidos = cantPartidos;
        this.cantGoles = cantGoles;
    }
    
    public double calcularEfectividad(){
        return (double)getCantPartidos() / getCantGoles();
    }
    
    public double calcularSueldoACobrar(){
        double sueldo = getSueldoBasico();
        
        if(calcularEfectividad() > 0.5)
            sueldo += getSueldoBasico();
            
        return sueldo;
    }

    
    public int getCantPartidos() {
        return cantPartidos;
    }

    public void setCantPartidos(int cantPartidos) {
        this.cantPartidos = cantPartidos;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }
    
    
    
    
}
