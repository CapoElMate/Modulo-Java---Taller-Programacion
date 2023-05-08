/*
Demo que crea objetos Libro invocando a los constructores definidos. 
 */
package practica3.Ejercicio2Libro;

public class Demo01ConstructoresLibro {

    public static void main(String[] args) {
        Autor autor1 = new Autor("Herbert Schildt","hombre escritor. Programador experto en java.", "U.S.A.");
        Libro libro1= new  Libro( "Java: A Beginner's Guide",   
                                 "Mcgraw-Hill", 2014,   
                                 autor1, "978-0071809252", 21.72);
        
        Autor autor2 = new Autor("CreateSpace Independent Publishing","is a Scotts Valley, California, US based company that provides online services for prospective book authors", "U.S.A.");
        Libro libro2= new Libro("Learning Java by Building Android Games",  
                              "CreateSpace Independent Publishing", 
                               autor2, "978-1512108347");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println("Precio del libro2: " +libro2.getPrecio());
        System.out.println("Año edición del libro2: " +libro2.getAñoEdicion());
        Libro libro3= new Libro(); 
    }
    
}
