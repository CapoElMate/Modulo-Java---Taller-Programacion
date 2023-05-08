
package practica2;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;


public class Ejercicio4Casting {
    
    static Persona ingresarPersona(){
        int edad,dni;
        String nombre;
        
        edad = PaqueteLectura.GeneradorAleatorio.generarInt(99);
        
        if(edad != 0){
            dni = PaqueteLectura.GeneradorAleatorio.generarInt(8999)+1000;
            nombre = PaqueteLectura.GeneradorAleatorio.generarString(8);   
            
            return new Persona(nombre,dni,edad);                    
        }
        else{
            return new Persona(null,0,edad);
        }
    }
    
    public static void main(String[] args) {
        
        PaqueteLectura.GeneradorAleatorio.iniciar();
        
        //5 dias y 8 turnos
        Persona matriz[][] = new Persona[5][8];       
        
        
        int cantPersonas = 0;
        Persona p = ingresarPersona();
        System.out.println(p);
        
        while((cantPersonas < 40)  && (p.getEdad() != 0)){
            
            /*
            System.out.println("cant: "+ cantPersonas);
            System.out.println("i: " + ((cantPersonas % 5) - 1));
            System.out.println("j: " + (cantPersonas / 5) );
            */
            
            matriz[(cantPersonas / 8) ][ (cantPersonas % 8)  ] = p;
            
            p = ingresarPersona();            
            System.out.println(p);
            
            cantPersonas++;
        }
        
        System.out.println("");
        System.out.println("");
        
        int i= 0, j=0;
        
        while (i < 5)
        {            
            j = 0;
            System.out.print("dia " + (i+1) +" : ");
            while((j<8) && matriz[i][j] != null){
               System.out.print("\tturno "+(j+1)+": ["+matriz[i][j]+"]");
               j++;
           } 
        
            System.out.println("");
            
            i++;
        }
        
       
        
        
    }
    
}
