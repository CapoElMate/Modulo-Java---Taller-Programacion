package p5.ejercicio1.investigadores;

public class Investigador {
    private String nombreCompleto;
    private int categoria;
    private String especialidad;
    private Subsidio[] subsidios;
    private int dimF; 
    private int dimL; 
    
    public Investigador(String nombreCompleto, int categoria, String especialidad) {
        this.nombreCompleto = nombreCompleto;
        this.categoria = categoria;
        this.especialidad = especialidad;
        
        dimF = 5;
        dimL = 0;
        subsidios = new Subsidio[dimF];
    }
    
    public void agregarSubsidio(Subsidio sub){
        if(dimL < dimF){
            subsidios[dimL] = sub;
            dimL++;
        }
    }
    
    public double montoOtorgadoSubsidios(){
        double monto = 0;
        
        for (int i = 0; i < dimL; i++){
            monto += subsidios[i].getMontoOtorgado();
            //System.out.println(subsidios[i].getMontoOtorgado());
        }
        
        return monto;
    }

    
    
    public void otorgarTodos(){
        for (int i = 0; i < dimL; i++){
            subsidios[i].setFueOtorgado(true);
        }
    }
    
    
    @Override
    public String toString() {
        return    " Nombre: " + nombreCompleto 
                + " ,categoria: " + categoria 
                + " ,especialidad: "+ especialidad 
                + " ,total otorgado por subsidios: " + montoOtorgadoSubsidios();
    }
    
    
    
    //getters y setters:

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    
    
    
}
