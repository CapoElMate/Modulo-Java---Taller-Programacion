
package p5.ejercicio2.estacionamiento;


public class Auto {
    private String nombreDueño;
    private String patente;

    public Auto(String nombreDueño, String patente) {
        this.nombreDueño = nombreDueño;
        this.patente = patente;
    }

    
    public String getPatente(){
        return patente;
    }
    
    @Override
    public String toString() {
        return "[due\u00f1o= " + nombreDueño + "| patente= " + patente + ']';
    }
    
    
    
}
