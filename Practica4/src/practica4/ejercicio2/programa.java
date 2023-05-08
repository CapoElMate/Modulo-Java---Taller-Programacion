

package practica4.ejercicio2;


public class programa {

    
    public static void main(String[] args) {
           Entrenador ent = new Entrenador("jorge",300000, 10, 2);
           
           Jugador jug = new Jugador("di Maria", 100000, 3, 30 , 50);
           
           System.out.println("entrenador: " + ent);
           System.out.println("jugador: " + jug);
    }    
}
