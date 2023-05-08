             
package p5.ejercicio1.investigadores;


public class Proyecto {
    private String nombreProyecto;
    private int codigo;
    private String nombreCompletoDirector;
    private Investigador[] investigadores;
    private int dimL,dimF;
    
    
    public Proyecto(String nombreProyecto, int codigo, String nombreCompletoDirector) {
        this.nombreProyecto = nombreProyecto;
        this.codigo = codigo;
        this.nombreCompletoDirector = nombreCompletoDirector;
        
        dimL = 0;
        dimF = 50;
        investigadores = new Investigador[dimF];
    }
    
    public void agregarInvestigador(Investigador inve){
        if(dimL < dimF){
            investigadores[dimL] = inve;
            dimL++;
        }
    }
    
    public void otorgarTodos(String nombre){
        //hay un error x aca. le da el mejor al ultimo // arreglado. el i < dimL tiene que ir antes que el otro.
        int i = 0;
        
        while(i < dimL && !investigadores[i].getNombreCompleto().equals(nombre))
            i++;
                
        if(i != dimL){
            investigadores[i].otorgarTodos();  
            System.out.println("el mayor es el "+ (1+i) );
        }
        else    
            System.out.println("no se encontro el mayor");
    }
    
    public double dineroTotalOtorgado(){
        double dineroTotal = 0;
        
        for (int i = 0; i < dimL; i++) {
            dineroTotal += investigadores[i].montoOtorgadoSubsidios();
        }
        
        return dineroTotal;
    }
    
    
    @Override
    public String toString() {
        String str = " nombre del proyecto: " + nombreProyecto
                    +" codigo: "+ codigo
                    +" nombre director: " + nombreCompletoDirector
                    +" dinero total otorgado: "+ dineroTotalOtorgado();     
        
        for (int i = 0; i < dimL; i++) {
            str += "\n|INVESTIGADOR " + (i+1) +" : |  " + investigadores[i].toString();
        }
        
        return str;
    }
    
    
    
    
}
