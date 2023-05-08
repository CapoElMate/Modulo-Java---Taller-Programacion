/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4.ejercicio1;
import java.text.DecimalFormat;

public abstract class Figura {
    private String colorRelleno;
    private String colorLinea;
   
    public Figura(String unCR, String unCL){
        setColorRelleno(unCR);
        setColorLinea(unCL);
    }
    
    public String toString(){
        
        //uso decimal format para que quede mas bonito, no es necesario.
        DecimalFormat formato = new DecimalFormat("0.00");
        
        String aux = "\t[Area: " + formato.format(this.calcularArea()) +
                     "\t|Perimetro: " + formato.format(this.calcularPerimetro()) +
                     "\t|CR: "  + getColorRelleno() + 
                     "\t|CL: " + getColorLinea()+ " ]";             
             return aux;
       }

    
    
    public void despintar(){
        setColorLinea("negro");
        setColorRelleno("blanco");
    }
    
    public String getColorRelleno(){
        return colorRelleno;       
    }
    public void setColorRelleno(String unColor){
        colorRelleno = unColor;       
    }
    public String getColorLinea(){
        return colorLinea;       
    }
    public void setColorLinea(String unColor){
        colorLinea = unColor;       
    }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
     
}
