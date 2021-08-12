
package test;

import enumeracion.Continentes;
import enumeracion.Dias;


public class TestEnumeraciones {
    
    public static void main(String[] args) {
        //Para la enumeracion de Dias
        System.out.println("--- enum de Dias ---");
        //Para acceder a los valores de una ENUM es como si fuera un atributo static public final
        System.out.println("Día 1 de la semana: "+ Dias.LUNES);
        
        //Llamo al metodo para imprimir el dia de la semana de la enum acorde al switch
        indicarDiaSemana(Dias.MARTES);
        
        //enum de continentes
        System.out.println("--- enum de Continentes ---");
        //para imprimir un valor del enum
        System.out.println("Continente  nro:  4 " + Continentes.AMERICA);
        //Para mostrar un atributo del mismo
        System.out.println("Nro. de paises en el 4to continente: " + 
                Continentes.AMERICA.getPaises());
    }
    
    //Metodo para mandar a imprimir que dia de la semana manejamos en la enumeracion
    private static void indicarDiaSemana(Dias dias) {
    
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;  
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;  
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;    
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break; 
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;  
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;    
            default:
                System.out.println("Se eligio una opción erronea");
        }
    }
    
}
