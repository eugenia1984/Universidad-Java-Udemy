/*
 SENTENCIAS DE CONTROL : 
IF / ELSE 
IF / IF ELSE / ELSE
 */
package sentenciasDeControl;

import java.util.Scanner;

public class SentenciasDeControl {


    public static void main(String[] args) {
        
    // EJEMPLO 1 : IF / ELSE
        boolean condicion = true;
    //Como los bloques de codigo son de 1 linea las {} son opcionales
    //Pero es buena práctica tener las {}
        if (condicion) {
                System.out.println("Condición verdadera.");
        } else { 
                System.out.println("Condición falsa.");
        }
        
    //EJEMPLO 2 : IF / ELSE IF / ELSE
        int numero= 2;
        String numeroTexto = "Numero desconocido";
        if (numero == 1) {
            System.out.println("Numero uno.");
        } else if (numero == 2) {
            System.out.println("Numero tres.");
        } else if (numero == 3) {
            System.out.println("Numero cuatro.");
        } else {
            System.out.println("Numero no encontrado");
        }
        System.out.println("La variable numero es: " + numero);
        
    //EJEMPLO 3 : IF / ELSE IF / ELSE
    //Declaro mi variable    
        int mes;
    //Como no tengo ELSE si ingresa un numero que no es entre 1 y 12 vale esto    
        String estacion = "Estación desconocida";
        
        Scanner leer = new Scanner(System.in);
    //Pido al usuaruio ingrese el mes    
        System.out.println("Ingresa el mes vigente (en numero) para decir la estacion: ");
    //Con Integer.parseInt() paso de String a int    
        mes = Integer.parseInt(leer.nextLine());
        
        if ( mes == 1 || mes == 2 || mes == 3 ) {
            estacion = "verano";
        } else if ( mes ==4 || mes == 5 || mes ==6 ) {
            estacion="otoño";
        } else if ( mes ==7 || mes == 8 || mes == 9 ) {
            estacion="invierno";
        } else if ( mes == 10 || mes == 11 || mes == 12 ) {
            estacion="primavera";
        } 
        System.out.println("Estacion : " + estacion);
        
    }
    
}
