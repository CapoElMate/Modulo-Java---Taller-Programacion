package p5.ejercicio3.recitales;

public class EventoOcasional extends Recital {
    
    private int motivo; //  (/1. a beneficio /2. show de TV /3. show privado)
    private String nombreContratante;
    private String diaDelEvento;
    
    public EventoOcasional(String nombreBanda, int cantTemas, int motivo, String nombreContratante, String diaDelEvento){
        super(nombreBanda,cantTemas);
        this.motivo = motivo;
        this.nombreContratante = nombreContratante;
        this.diaDelEvento = diaDelEvento;
    }
    
    @Override 
    public void actuar(){
        switch(motivo){
            case 1:
                System.out.println("recuerden colaborar con " + nombreContratante);
                break;
            case 2:
                System.out.println("saludos amigos televidentes ");
                break;
            case 3:
                System.out.println("un feliz cumpleaños para " + nombreContratante);
                break;
        }
        
        super.actuar();        
    }
    
    public double calcularCosto(){
        double costo;
        
        switch(motivo){
            case 1: 
                costo = 0;
                break;
                
            case 2: 
                costo = 50000;
                break;
                
            case 3: 
                costo = 150000;
                break;
            
            default:
                costo = -1;
        }
        
        return costo;
    }
    
    
}
