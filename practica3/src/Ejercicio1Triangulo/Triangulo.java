package practica3.Ejercicio1Triangulo;


public class Triangulo {
    
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private String colorRelleno;
    private String colorLinea;
    
    public Triangulo(double ladoA,double ladoB,double ladoC, String colorRelleno,String colorLinea){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.colorRelleno = colorRelleno;
        this.colorLinea = colorLinea;
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
    
    public String getColorRelleno(){
        return this.colorRelleno;
    }
    
    public String getColorLinea(){
        return this.colorLinea;
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
    
    
    public void setColorRelleno(String color){
        this.colorRelleno = color;
    }

    public void setColorLinea(String color){
        this.colorLinea = color;
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
