package practica4.ejercicio1;


public class Triangulo extends Figura {
    
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public Triangulo(double ladoA,double ladoB,double ladoC, String colorRelleno,String colorLinea){
        super(colorRelleno,colorLinea);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    } 
    
    public double getLadoA(){
        return this.ladoA;
    }
    public double getLadoB(){
        return this.ladoB;
    }
    public double getLadoC(){
        return this.ladoC;
    }
    
    public void setLadoA(double lado){
        this.ladoA = lado;
    }
    public void setLadoB(double lado){
        this.ladoB = lado;
    }
    public void setLadoC(double lado){
        this.ladoC = lado;
    }
    
    public double calcularPerimetro(){
        double perimetro;
        
        perimetro = this.ladoA + this.ladoB +this.ladoC;
        
        return perimetro;        
    }
    
    public double calcularArea(){
        
        double s,area;
        
        s = (this.ladoA + this.ladoB + this.ladoC) / 2.0;
        area = Math.sqrt(s*(s-this.ladoA)*(s-this.ladoB)*(s-this.ladoC));
        
        return area;
    }
    
    
}
