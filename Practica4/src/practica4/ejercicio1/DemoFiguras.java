
package practica4.ejercicio1;


public class DemoFiguras {

    
    public static void main(String[] args) {
        Cuadrado cuad = new Cuadrado(10,"Rojo", "Negro");
        System.out.println("Representacion del cuadrado: " + cuad.toString()); 
        
        Triangulo triangulo = new Triangulo(2,3,5,"rojo","amarillo");
        System.out.println("Representacion del triangulo: " + triangulo); 
        
        Circulo circulo = new Circulo(3,"rojo","amarillo");
        System.out.println("Representacion del circulo: "+ circulo);
        
        circulo.despintar();
        System.out.println("circulo despintado:\t" + circulo );
        
    }
    
    
    
}
