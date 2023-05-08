
package practica4.ejercicio3;


public class Trabajador extends Persona {

    private String trabajo;
    
    public Trabajador(String nombre,int dni,int edad, String trabajo) {
        super(nombre,dni,edad);
        this.trabajo = trabajo;
    }

    @Override // ¿hace falta el override?
    public String toString() {
        return super.toString() + " Soy " + trabajo; 
    }

    
    //¿hace falta generar getters y setters de todo?
    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    
    
}
