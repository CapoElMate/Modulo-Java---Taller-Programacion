package p5.ejercicio4.coro;


public class CoroPorHileras extends Coro{
    private int cantHileras;
    private int coristasPorHileras;
    private int coristasIngresados;
    private int coristasMaximos;
    
    
    Corista coristas[][];
    
    public CoroPorHileras(String nombre, Director director,int cantHileras, int coristasPorHileras){
        super(nombre,director);
        this.cantHileras = cantHileras;
        this.coristasPorHileras = coristasPorHileras;
        
        coristas = new Corista[cantHileras][coristasPorHileras];
        coristasMaximos = cantHileras * coristasPorHileras;
        coristasIngresados = 0;
    }


    public void agregarCorista(Corista corista) {
        if(!estaLleno()){
            coristas[coristasIngresados / coristasPorHileras][coristasIngresados % coristasPorHileras] = corista;
            coristasIngresados++;
        }
    }

    
    public boolean estaLleno() {
        return coristasIngresados >= coristasMaximos;
    }

    
    
    /*Todos los miembros de una misma hilera
    tienen el mismo tono fundamental y además 
    todos los primeros miembros de cada hilera 
    están ordenados de mayor a menor en cuanto
    a tono fundamental*/
    
    //NOTA: PREGUNTAR si este metodo esta bien hecho.
    public boolean estaBienFormado() {
        
        boolean estaBien = true;
        int tonoHileraActual;
        
        //hago dos fors, para que recorran con el "i", todas las hileras para ver si son ,mayores que el anterior.
        for (int i = 0 ; i < cantHileras && estaBien; i++) {
            
            tonoHileraActual = coristas[i][0].getTonoFundamental();
            
            //esto lo hago para comparar si la hilera cumple la propiedad de que la actual(i) tiene que ser mayor o igual a la siguiente(i+1).
            if((i+1) < cantHileras){     //el if esta porque si la hilera(i) es la ultima, se va de rango al sumarle 1.
                System.out.println("i: " + i);
                estaBien = (tonoHileraActual >=  coristas[i+1][0].getTonoFundamental());//Compara y lo carga en la variable booleana. en caso que no se cumpla se sale del for.
                System.out.println("tonoHileraActual" + tonoHileraActual + " TonoFundamental sig." + coristas[i+1][0].getTonoFundamental());
            }
            
            //el for con la "j" recorre cada una de las hileras verificando si no son todos los numeros son iguales, que pare de recorrer.
            for (int j = 0  ; j < coristasPorHileras && estaBien; j++) {
                estaBien = (tonoHileraActual == coristas[i][j].getTonoFundamental());//Compara y lo carga en la variable booleana. en caso que no se cumpla se sale del for.
            }
            
        }
        
        return estaBien;
        
    }

    
    public String toString() {
        String str = super.toString();
        
        for (int i = 0; i < cantHileras; i++) {
            
            str += "\n";
            
            for (int j = 0; j < coristasPorHileras; j++) {
                
                if(coristas[i][j] != null)
                    str += "\t[" + coristas[i][j].toString() + "]";
                else
                    str += "\t[           espacio vacio           ]";
                
            }
            
        }
        
        return str;
    }

    public int getCoristasMaximos() {
        return coristasMaximos;
    }
    
    
    
    
    
    
    
    
}
