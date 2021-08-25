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
        
        try{
            //De haber importado division ->
            //resultado = division(resultado, resultado);
            resultado = Aritmetica.division(10, 0);
        } catch(Exception e) {
        //Mando a imprimir la pila de excepciones por consola con System.out
        //no es requerido el System.out pero el IDE lo sugiere
            e.printStackTrace(System.out);
            //Si quiero mandar a imprimir de manera individual el mensaje uso getMessage
            System.out.println(e.getMessage());
        }
    //El resultado = 0 no es el resultado de la division sino el valor de la variable
        System.out.println("resultado = " + resultado);
    }
    
}
