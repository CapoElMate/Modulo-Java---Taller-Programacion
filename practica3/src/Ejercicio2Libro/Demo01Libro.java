/*
 Programa que instancia un objeto libro e inicializa sus v.i.s enviando mensajes set#
 */
package practica3.Ejercicio2Libro;

public class Demo01Libro {

    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setTitulo("Java: A Beginner's Guide");
        libro.setEditorial("Mcgraw-Hill");
        libro.setAñoEdicion(2014);
        
        Autor autor = new Autor("Herbert Schildt"," hombre escritor "," USA ");
        libro.setAutor(autor);
        
        libro.setISBN("978-0071809252");
        libro.setPrecio(21.72);
        System.out.println(libro.toString());
       // System.out.println(libro); /* invoca automaticamente al metodo toString */

    }
    
}
