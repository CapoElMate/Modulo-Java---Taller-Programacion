package p5.ejercicio3.recitales;


public abstract class Recital {
    private String nombreBanda;
    private String[] temas;
    private int dimF;
    private int dimL;

    
    public Recital(String nombreBanda,int cantTemas) {
        this.nombreBanda = nombreBanda;
        this.dimF = cantTemas;
        dimL = 0;
        
        temas = new String[cantTemas];
    }
    
    public void agregarTemas(String tema){
        if(dimL < dimF)
            temas[dimL++] = tema;
    }
    
    public void actuar(){
        for (int i = 0; i < dimL; i++) {
            System.out.println("Y ahora tocaremos " + temas[i] + " !!");
        }
    }
    
    public abstract double calcularCosto();

    public void setDimL(int dimL) {
        this.dimL = dimL;
    }
    
    
    
}
