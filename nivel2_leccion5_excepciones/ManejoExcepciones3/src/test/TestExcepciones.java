/**
 * Si quiero hacer una division por 0 -> ArithmeticException / by zero
 * Pero ahora voy a utilizar mi mensaje personalizado de -> OperacionExcepcion
 */
package test;
//importo Aritmetica y podria tambien importar el metodo division que es estatico
import aritmetica.Aritmetica; 


public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        resultado = Aritmetica.division(10, 0);
        System.out.println("resultado = " + resultado);  //El resultado = 0 no es el resultado de la division sino el valor de la variable
    }
    
}
