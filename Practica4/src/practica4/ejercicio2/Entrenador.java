
package practica4.ejercicio2;


public class Entrenador extends Empleado{
    
    private int cantCampeonatosGanados;
    
    
    public Entrenador(String nombre, double sueldo, int antiguedad, int cantCamp){
        super(nombre,sueldo,antiguedad);
        setCantCampeonatosGanados(cantCamp);
    }
    
    
    public double calcularEfectividad(){
        return (double)getAntiguedad() / getCantCampeonatosGanados(); 
    }
    
    public double calcularSueldoACobrar(){
        double sueldo = getSueldoBasico();
        
        if(getCantCampeonatosGanados() >= 1 && getCantCampeonatosGanados() <= 4)
            sueldo += 5000;
        
        if(getCantCampeonatosGanados() >= 5 && getCantCampeonatosGanados() <= 10)
            sueldo += 30000;
        
        if(getCantCampeonatosGanados() > 10)
            sueldo += 50000;
        
        
        return sueldo;
    }

    
    public int getCantCampeonatosGanados() {
        return cantCampeonatosGanados;
    }

    public void setCantCampeonatosGanados(int cantCampeonatosGanados) {
        this.cantCampeonatosGanados = cantCampeonatosGanados;
    }

    
    
            
    
    
    
    
}
