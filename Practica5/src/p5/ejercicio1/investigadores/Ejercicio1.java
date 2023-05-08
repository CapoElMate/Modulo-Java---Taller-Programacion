
package p5.ejercicio1.investigadores;


public class Ejercicio1 {

    public static void main(String[] args) {
        Proyecto proyecto1 = new Proyecto("Arsat 23", 909, "rene favaloro");
        
        Investigador inv1 = new Investigador("jorge", 1, "aeroespacial");
        Investigador inv2 = new Investigador("maria", 1, "computacion");
        Investigador inv3 = new Investigador("fran", 2, "diseño");
        
        Subsidio sub1 = new Subsidio("sueldo", 100000);
        Subsidio sub2 = new Subsidio("viaticos", 20000);
        Subsidio sub3 = new Subsidio("materiales", 30000);
        
        inv1.agregarSubsidio(sub1);
        inv1.agregarSubsidio(sub2);
        inv1.agregarSubsidio(sub3);

        
        Subsidio sub4 = new Subsidio("sueldo", 100000);
        Subsidio sub5 = new Subsidio("viaticos", 20000);        
        sub4.setFueOtorgado(true);
        inv2.agregarSubsidio(sub4);
        inv2.agregarSubsidio(sub5);

        
        Subsidio sub6 = new Subsidio("sueldo", 10000);        
        Subsidio sub7 = new Subsidio("viaticos", 20000);        
        sub7.setFueOtorgado(true);
        
        inv3.agregarSubsidio(sub6);
        inv3.agregarSubsidio(sub7);
        
        proyecto1.agregarInvestigador(inv1);
        proyecto1.agregarInvestigador(inv2);
        proyecto1.agregarInvestigador(inv3);
        
        proyecto1.otorgarTodos("jorge");
        proyecto1.otorgarTodos("emanuel");

        System.out.println("proyecto1: " + proyecto1);
        
    }
    
}
