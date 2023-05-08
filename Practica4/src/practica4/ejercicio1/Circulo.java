
package practica4.ejercicio1;


public class Circulo extends Figura{
    private double radio;
    private String colorRelleno; 
    private String colorBordes;

    public Circulo(double radio, String colorRelleno, String colorBordes) {
        super(colorRelleno,colorBordes);
        this.radio = radio;
    }
    
    public double calcularPerimetro(){
        double perimetro;
        
        perimetro = radio * Math.PI * 2;
        
        return perimetro;
    }
    
    public double calcularArea(){
        double area;
        
        area = radio * radio * Math.PI; 
        
        return area;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public String getColorBordes() {
        return colorBordes;
    }

    public void setColorBordes(String colorBordes) {
        this.colorBordes = colorBordes;
    }
    
    
    
}
