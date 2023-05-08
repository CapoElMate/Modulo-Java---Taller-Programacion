package p5.ejercicio4.coro;

public class CoroSemicircular extends Coro {
    
    private Corista[] coristas;
    private int dimL; 
    private int dimF; 

    public CoroSemicircular(String nombre, Director director, int dimension) {
        super(nombre, director);
        dimL = 0;
        dimF = dimension;
        
        coristas = new Corista[dimF];
    }

    
    public void agregarCorista(Corista corista) {
        if(!estaLleno()){
            coristas[dimL] = corista;
            dimL++;
        }
    }
    
    public boolean estaLleno() {
        return (dimL >= dimF);        
    }

    
    public boolean estaBienFormado() {
        int i = 0;
        
        while(((i+1) < dimL) && (coristas[i].getTonoFundamental() >= coristas[i+1].getTonoFundamental()))
            i++;
        
        return (i == dimL);        
    }
    
    
    
    public String toString(){
        String str = super.toString();
        
        for (int i = 0; i < dimL; i++) {
            str += "\n corista nro " + (i+1) + " : " + coristas[i].toString();
        }
        
        return str;
    }
    
}
