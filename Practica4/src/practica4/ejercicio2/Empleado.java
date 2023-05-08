
package practica4.ejercicio2;


public abstract class Empleado {

    private String nombre;
    private double sueldoBasico;
    private int antiguedad;
    
    public Empleado(String n, double s, int a){
        setNombre(n);
        setSueldoBasico(s);
        setAntiguedad(a);
    }
    
    public abstract double calcularEfectividad();
    public abstract double calcularSueldoACobrar();
    
    
    public String toString(){
        String st;
        
        st =    "\t\t| Nombre: " + getNombre() ;
        st +=   "\t\t| Sueldo a cobrar: " + this.calcularSueldoACobrar() ;
        st +=   "\t\t| efectividad: " + this.calcularEfectividad() + " |";
                
        return st;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    
    
}
