
package p5.ejercicio2.estacionamiento;


public class Estacionamiento {
    
    private String nombre;
    private String direccion;
    private String horaApertura;
    private String horaCierre;
        
    
    private int cantPisos;
    private int cantPlazas;
    
               //pisos / plazas
    private Auto autos[][];
    
    //PREGUNTA. ¿esta bien tomar casilleros vacios si estan en null? ¿o hago una variable estaOcupado?

    public Estacionamiento(String nombre , String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        
        horaApertura = "08:00";
        horaCierre = "21:00";
        
        //inicializo la matriz con los tamaños dados: 
        cantPisos = 5;
        cantPlazas = 10;
        
        autos = new Auto[cantPisos][cantPlazas];        
    }
    
    public Estacionamiento(String nombre , String direccion, String horaApertura, String horaCierre,int cantPisos, int cantPlazas) {
        this.nombre = nombre;
        this.direccion = direccion;
        
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        
        //inicializo la matriz con los tamaños dados: 
        this.cantPisos = cantPisos;
        this.cantPlazas = cantPlazas;
        
        autos = new Auto[cantPisos][cantPlazas];   
    }
    
    
    public void ingresarAuto(Auto A, int nroPiso, int nroPlaza ){
        autos[nroPiso][nroPlaza] = A;
    }
    
    public String encontrarPatente(String patente){
        String st = "Auto inexistente";
        boolean seEncontro = false;
        
        
        //aca tambien podria usar FOR y modificar la condicion para añadir !seEncontro. PREGUNTAR si se puede.
        int i = 0;
        while(!seEncontro && i < cantPisos){
            
            int j = 0;
            while(!seEncontro && j < cantPlazas){
                
                //System.out.println("i:"+i+" j: "+j);
                
                if(autos[i][j]!=null && autos[i][j].getPatente().equals(patente)){
                    seEncontro = true;
                    st = "SE ENCONTRO EN: nro piso: "+ (i+1) + " ,nro plaza: " + (j+1);
                }
                
                j++;
            }
            
            i++;
        }
        
                
        return st;        
    }
    
    
    public int obtenerCantAutosEnPlaza(int nroPlaza){
        int cantidad = 0;
        
        for (int i = 0; i < cantPisos; i++) {
            if(autos[i][nroPlaza] != null){
                cantidad++;
            }
        }
        
        return cantidad;
    }
    
    
    @Override
    public String toString(){
        String str;
        
        str = "Estacionamiento. Direccion: " + direccion + " , hora de apertura: " + horaApertura + " ,hora de cierre: " + horaCierre + "\n";
        
        for (int i = 0; i < cantPisos; i++) {
            str += "\nPISO "+ (i+1) + " : ";
            
            for (int j = 0; j < cantPlazas; j++) {
                
                str += "PLAZA"+ (j+1) + " : ";
                
                if(autos[i][j]!= null)
                    str += autos[i][j];
                else//      [dueño= jorge| patente= ASD-923]
                    str += "[     estacionamiento vacio    ]";
                
                
                str += "\t |\t";
                
            }
            
        }
        
        
        return str;        
    }
    
    
    
    
    
    
}
