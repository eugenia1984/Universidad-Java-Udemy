package operadoresCondicionales;

/**
OPERADORES CONDICIONALES
* && : AND , DEBEN SER AMBOS TRUE -> TRUE
* || : OR, CON QUE UNO SEA TRUE -> ES TRUE
 */
public class OperadoresCondicionales {

    public static void main(String[] args) {
        int a = 10;
        int valorMinimo = 0;
        int valorMaximo = 10;
        boolean resultado;
        //Defino un rango de valores:
        //si a es mayor o igual a 0
        // y si a es menor o igual a 10
        //es decir que si esta en: [0 ; 10] - incluyo 0 y 10
        resultado = a >= 0 && a <= 10;
        System.out.println("a es mayor o igual a 0 y es menor o igual a 10 : " + resultado);
    
        boolean  vacaciones = false;
        boolean diaDescanso = false;
        //como ambas expresiones son falses, es false y va a ejecutar el bloque del else
        if (vacaciones || diaDescanso) {  
            System.out.println("El padre puede asistir al juego.");
        } else {
            System.out.println("El padre está ocupado.");
        }
        
    }
    
}
