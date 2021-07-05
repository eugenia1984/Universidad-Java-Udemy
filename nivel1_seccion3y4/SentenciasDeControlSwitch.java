/*
SENTENCIA DE CONTROL: SWITCH
Primero se evalua una expresión de tipo numérico o String.
 */
package sentenciasDeControlSwitch;

import java.util.Scanner;

public class SentenciasDeControlSwitch {

    public static void main(String[] args) {
    
        //EJERCICIO 1:
        int numero = 2;
        String numeroTexto = "Valor desconocido";
        
        switch (numero) {
            case 1:
                numeroTexto = "Numero UNO.";
                break;
            case 2:
                numeroTexto = "Numero DOS.";
                break;
            case 3:
                numeroTexto = "Numero TRES.";
                break;
            case 4:
                numeroTexto = "Numero CUATRO.";
                break;    
            default:
                numeroTexto="Caso no encontrado";
        }
        System.out.println("Variable numeroTexto : " + numeroTexto);
        
        //EJERCICIO 2:
        int mes;
        String estacion = "Estación desconocida";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un mes (en numero): ");
        mes = Integer.parseInt(sc.next());
        
        switch (mes) {
            case 1: case 2: case 3:
                estacion="Verano";
                break;
            case 4: case 5: case 6:
                estacion="Otoño";
                break;    
            case 7: case 8: case 9:
                estacion="Invierno";
                break;    
            case 10: case 11: case 12:
                estacion="Primavera";
                break;    
            default:
                estacion ="Ingreso un mes arroneo";
        }
        System.out.println("El mes indicado corresponde a la estación : " + estacion);
    }
    //EJERCICIO 3:
    /*
    El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
    El usuario proporcionará un valor entre 0 y 10.
    Si está entre 9 y 10: imprimir una A
    Si está entre 8 y menor a 9: imprimir una B
    Si está entre 7 y menor a 8: imprimir una C
    Si está entre 6 y menor a 7: imprimir una D
    Si está entre 0 y menor a 6: imprimir una F
    cualquier otro valor debe imprimir: Valor desconocido
    */
    int nota;
    
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese su nota - entre 0 y 10 - : ");
        
    nota = Integer.parseInt(leer.nextLine());
    
     //Si esta entre 9 y 10 imprimir: A
        if ( nota >= 9 && nota <= 10)
            System.out.println("A");
        //Si esta entre  8 y menor a 9 imprimir: B
        else if( nota >= 8 && nota < 9)
            System.out.println("B");
        //Si esta entre 7 y menor a 8 imprimir: C
        else if( nota >= 7 && nota < 8)
            System.out.println("C");
        //Si esta entre 6 y menor a 7 imprimir: D
        else if( nota >= 6 && nota < 7)
            System.out.println("D");
        //Si esta entre 0 y menor a 6 imprimir: F
        else if( nota >= 0 && nota < 6)
            System.out.println("F");
        //Si no esta en el rago, imprimir: Valor desconocido
        else
            System.out.println("Valor desconocido");
    }
    
}
