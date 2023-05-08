

package p5.ejercicio3.recitales;

public class ejercicio3 {

    public static void main(String[] args) {
        
        Gira gira = new Gira("CA-CC", 5, "SuperGiraBsAs", 3);
        
        gira.agregarTemas("ggg");
        gira.agregarTemas("aaa");
        gira.agregarTemas("sss");
        gira.agregarTemas("zzz");
        gira.agregarTemas("mmm");
       
        gira.agregarFecha(new Fecha("La palta", "30 febrero"));
        gira.agregarFecha(new Fecha("malos aires", "1 marzo"));
        gira.agregarFecha(new Fecha("mar del cobre", "4 julio"));
        
        System.out.println("costo de la gira: " + gira.calcularCosto());
        gira.actuar();
        gira.actuar();
        gira.actuar();
        
        
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        EventoOcasional evento = new EventoOcasional("Rata Negra", 3, 2 , "macricio mauri", "10 diciembre");
        evento.agregarTemas("la historia de un manco");
        evento.agregarTemas("aaa");
        evento.agregarTemas("zzz");
        
        System.out.println("costo del evento: " + evento.calcularCosto());
        evento.actuar();
        
        
    }
    
}
