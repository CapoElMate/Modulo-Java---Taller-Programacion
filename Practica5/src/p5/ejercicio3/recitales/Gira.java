
package p5.ejercicio3.recitales;

public class Gira extends Recital{
    
    private String nombre;
    private Fecha[] fechas;
    
    private int fechasDimF;  //dimF
    private int fechasDimL;  //dimL
    private int fechaActual;    //la proxima fecha a tocar.

    
    public Gira(String nombreBanda, int cantTemas,String nombre, int fechasDimF) {
        super(nombreBanda, cantTemas);
        this.nombre = nombre;
        this.fechasDimF = fechasDimF;
        
        fechas = new Fecha[fechasDimF];
        
        fechasDimL = fechaActual = 0; // no sabia que se podia en java!        
    }

        
    public void agregarFecha(Fecha fecha){
       if(fechasDimL < fechasDimF){
           fechas[fechasDimL++] = fecha;
       }
    }
    
    
    @Override
    public void actuar(){
        if(fechaActual < fechasDimL){
            // System.out.println("act:" + fechaActual + " dimL: " + fechasDimL);
            System.out.println("buenas noches " + fechas[fechaActual].getCiudad() + " !!!");
            
            super.actuar();
            
            fechaActual++;
        }
    }
    
    //¿es necesario hacer override?
    public double calcularCosto(){
        return (30000.0 * fechasDimL);
    }
    
    
}
