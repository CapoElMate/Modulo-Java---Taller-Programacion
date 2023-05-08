
package p5.ejercicio1.investigadores;

public class Subsidio {
    private double montoPedido;
    private String motivo;
    private boolean fueOtorgado;

    public Subsidio(String motivo, double montoPedido) {
        setFueOtorgado(false);
        this.motivo = motivo;
        this.montoPedido = montoPedido;
    }
    
    public double getMontoOtorgado(){
        double monto = 0;
        
        if(fueOtorgado){
            monto = montoPedido;
        }
        
        return monto;
    }
    
    //getters y setters: 
    
    public void setFueOtorgado(boolean fueOtorgado) {
        this.fueOtorgado = fueOtorgado;
    }
    
    
    
}
