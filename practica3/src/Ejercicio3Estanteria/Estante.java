
package practica3.Ejercicio3Estanteria;

public class Estante {
    private Libro[] libros;
    private int cantLibros;
    private int espacioEnEstante;
    
    public Estante(int espacioEnEstante){
        this.espacioEnEstante = espacioEnEstante;
        this.libros = new Libro[espacioEnEstante];
        this.cantLibros = 0;     
    }
    
    public int getCantLibros(){
        return this.cantLibros;
    }
    
    public boolean estanteLleno(){
        return (this.espacioEnEstante == this.cantLibros);
    }
    
    public void agregarAlEstante(Libro l){
        //if(!estanteLleno()){
            libros[getCantLibros()] = l;
            this.cantLibros++;
        //}
    }
    
    //preguntar si este metodo esta bien:
    
    public Libro encontrarTitulo(String titulo){
        boolean seEncontro = false;
        
        int i = 0;
        
        while(!seEncontro && i < this.cantLibros){ // ¿aca uso getCantLibros() o this.cantLibros?
            System.out.println("i: " + i);
            seEncontro = this.libros[i].getTitulo().equals(titulo);
            i++;
        }
        
        if(seEncontro)
            return this.libros[i-1];
        
        else
            return null; // ¿es ok que devuelva null?
    }
    
}
