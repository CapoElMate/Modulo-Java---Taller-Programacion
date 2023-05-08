package practica4.ejercicio1;


public class Cuadrado extends Figura{
    
    private double lado;
    
    public Cuadrado(double unLado, String unColorR, String unColorL){
        super(unColorR,unColorL);
        setLado(unLado);

    } 
    
    public double getLado(){
        return lado;       
    }
  
    public void setLado(double unLado){
        lado=unLado;
    }

    public double calcularArea(){
       return (getLado()* getLado());
    }
    
    public double calcularPerimetro(){
       return (getLado()*4);
    }
        
    
    public String toString(){
       String aux = super.toString();
       //con el substring borro los dos ultimos elementos del string. AKA el " ]" anterior.
       return aux.substring(0, aux.length() - 2) + "\t|Lado: " + getLado() + " ]";        
    }

 
}
