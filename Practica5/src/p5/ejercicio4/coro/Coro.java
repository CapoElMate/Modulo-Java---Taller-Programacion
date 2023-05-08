package p5.ejercicio4.coro;

public abstract class Coro {
    
    private String nombre;
    private Director director;
    
    public Coro(String nombre, Director director) {
        this.nombre = nombre;
        this.director = director;
    }
    
    
    public abstract void agregarCorista(Corista corista);
    public abstract boolean estaLleno();
    public abstract boolean estaBienFormado();
    
    
    
    public String toString(){
        return "Nombre del coro: " + nombre + " , Director: " + director.toString();
    }

}
