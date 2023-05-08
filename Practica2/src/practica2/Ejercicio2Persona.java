package practica2;
import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio2Persona {

    public static void main(String[] args) {
        Persona[] personas = new Persona[15];
        int dimL = 0;
        
        PaqueteLectura.GeneradorAleatorio.iniciar();
        
        int edad,dni;
        String nombre;
        
        edad = PaqueteLectura.GeneradorAleatorio.generarInt(99);
        dni = PaqueteLectura.GeneradorAleatorio.generarInt(8999)+1000;
        nombre = PaqueteLectura.GeneradorAleatorio.generarString(8);
        System.out.println("edad: " +edad);
        
        while ((edad != 0)&&(dimL < 15)){
                        
            personas[dimL] = new Persona(nombre,dni,edad);
            System.out.println(personas[dimL]);
            
            dimL++;
            
            //la unica manera de qeu se me ocurrio de que no pregunte de manera innecesaria los datos es esta:
            
            if(dimL < 15){ //pongo un if que compara dentro del while
                //ingreso de datos:
                edad = PaqueteLectura.GeneradorAleatorio.generarInt(99);
                dni = PaqueteLectura.GeneradorAleatorio.generarInt(8999)+1000;
                nombre = PaqueteLectura.GeneradorAleatorio.generarString(8);
                System.out.println("edad: " +edad);
            }
            
        }
        
        int mayores = 0;
        Persona menorDni = new Persona();
        
        menorDni.setDNI(99999);
        
        for(int i = 0; i<dimL; i++){
            if(personas[i].getEdad() > 65)
                mayores++;
            
            if(personas[i].getDNI() < menorDni.getDNI())
                menorDni = personas[i];
        }
        
        System.out.println("la persona con el menor dni es: "+ menorDni);
           
    }
}
