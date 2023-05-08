
package practica3.Ejercicio4Hotel;
import PaqueteLectura.Lector;

public class Main {

    
    public static void main(String[] args) {
        
        int cantidadDeHabitaciones;
        Hotel hotel;
        Cliente cliente;
        int habitacion = 0;
        
        System.out.print("ingrese la cantidad de habitaciones de su hotel: ");
        cantidadDeHabitaciones = Lector.leerInt();
        
        hotel = new Hotel(cantidadDeHabitaciones);
        
        
        while(habitacion+1 != -1){
            
            System.out.print("ingrese la habitacion a ingresar: ");
            habitacion = Lector.leerInt()-1;
            
            if(habitacion+1 != -1){
                cliente = ingresarCliente();
                hotel.ingresarCliente(cliente, habitacion);
            }
            System.out.println("");
            
        }
        
        System.out.println("\n\nMostrando el hotel: \n\n"+ hotel);
        
        hotel.aumentarPrecio(1000);
        
        System.out.println("\n\nMostrando el hotel depues de los aumentos: \n\n"+ hotel);

        
    }
    
    
    static Cliente ingresarCliente(){
        String nombre;
        int dni;
        int edad;
        
        System.out.print("ingrese el nombre del cliente: ");
        nombre = Lector.leerString();
        
        System.out.print("ingrese el dni del cliente: ");
        dni = Lector.leerInt();
        
        System.out.print("ingrese la edad del cliente: ");
        edad = Lector.leerInt();
        
        return new Cliente(nombre,dni,edad);
        
    }
    
    
}
