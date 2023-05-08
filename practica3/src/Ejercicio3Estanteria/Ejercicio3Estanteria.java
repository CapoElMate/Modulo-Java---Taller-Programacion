
package practica3.Ejercicio3Estanteria;

public class Ejercicio3Estanteria {


    public static void main(String[] args) {
        Estante estante = new Estante(9);
        
        Autor autorAux;
        Libro libroAux;
        
        autorAux = new Autor("J.K Rowling", "Es una escritora, productora de cine y guionista", "Britanica");
        libroAux = new Libro("Harry potter", "salamandra", 1997, autorAux , "9788418797125", 0);
        estante.agregarAlEstante(libroAux);
        
        autorAux = new Autor("J.R.R Tolkien", "Fue un escritor, poeta, filólogo, lingüista y profesor universitario", "Britanico");
        libroAux = new Libro("El Hobbit", "Editorial George Allen & Unwin", 1937, autorAux , "9780008367435", 0);
        estante.agregarAlEstante(libroAux);
        
        autorAux = new Autor("Antoine de Saint-Exupéry", "Fue un aviador y escritor", "Frances");
        libroAux = new Libro("El principito", "Reynal & Hitchcock", 1943, autorAux , "9789877478853", 0);
        estante.agregarAlEstante(libroAux);
        
        autorAux = new Autor("Louisa May Alcott", "Comprometida con el movimiento abolicionista y con el sufragismo, escribió bajo el seudónimo de A. M. Barnard una colección de novelas y relatos", "Estadounidense");
        libroAux = new Libro("Mujercitas", "Roberts Brothers", 1868, autorAux , "978-0143106654", 0);
        estante.agregarAlEstante(libroAux);
        
        autorAux = new Autor("J.D. Salinger", "Nació en Nueva York en 1919, Salinger se interesó por la escritura desde joven y publicó su primera historia corta en 1940. Además de su carrera literaria, Salinger también fue soldado en la Segunda Guerra Mundial. ", "Estadounidense");
        libroAux = new Libro("El Guardian Frente Al Centeno", "Little, Brown and Company", 1951, autorAux , "978-0143106654", 0);
        estante.agregarAlEstante(libroAux);
        
        autorAux = new Autor("Muriel Barbery", "nacida en Casablanca, Marruecos, en 1969. Además de su carrera literaria, Barbery es doctora en Filosofía y ha trabajado como profesora. ", "Francesa");
        libroAux = new Libro("La elegancia del erizo", "Gallimard", 2006, autorAux , "978-2070780938", 0);
        estante.agregarAlEstante(libroAux);
        
        autorAux = new Autor("John Katzenbach", "Estudió periodismo y trabajó como reportero antes de dedicarse a la escritura. Katzenbach es autor de varios thrillers psicológicos ", "Estadounidense");
        libroAux = new Libro("El psicoanalista", "Ediciones B,", 2002, autorAux , "978-8466613955", 0);
        estante.agregarAlEstante(libroAux);
        
        autorAux = new Autor("Michael Ende", "fue un escritor nacido en 1929, es conocido principalmente por sus obras de literatura infantil y juvenil", "Aleman");
        libroAux = new Libro("Momo", "Thienemann Verlag", 1868, autorAux , "978-0143106654", 0);
        estante.agregarAlEstante(libroAux);
        
        autorAux = new Autor("F. Scott Fitzgerald", "bio ", "Estadounidense");
        libroAux = new Libro("El gran Gatsby", "Charles Scribner's Sons", 1925, autorAux , "978-0743273565", 0);
        estante.agregarAlEstante(libroAux);
        
        autorAux = new Autor("Crónica de una muerte anunciada", "bio ", "Estadounidense");
        libroAux = new Libro("Gabriel García Márquez", "Editorial La Oveja Negra", 1981, autorAux , "978-958-06-0088-2", 0);
        estante.agregarAlEstante(libroAux);
        
        
        System.out.println("el libro mujercitas: " + estante.encontrarTitulo("El gran Gatsby"));
        
        
        
        
    }
    
}
