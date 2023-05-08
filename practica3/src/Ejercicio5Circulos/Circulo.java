
package practica3.Ejercicio5Circulos;


public class Circulo {
    private double radio;
    private String colorRelleno; 
    private String colorBordes;

    public Circulo(double radio, String colorRelleno, String colorBordes) {
        this.radio = radio;
        this.colorRelleno = colorRelleno;
        this.colorBordes = colorBordes;
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
