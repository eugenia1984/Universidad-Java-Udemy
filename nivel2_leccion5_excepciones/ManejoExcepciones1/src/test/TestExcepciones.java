/**
 * Si quiero hacer una division por 0 -> ArithmeticException / by zero
 */
package test;


public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        
        try{
            resultado = 10 / 0;
        } catch(Exception e) {
        //Mando a imprimir la pila de excepciones por consola con System.out
        //no es requerido el System.out pero el IDE lo sugiere
            e.printStackTrace(System.out);
        }
    //El resultado = 0 no es el resultado de la division sino el valor de la variable
        System.out.println("resultado = " + resultado);
    }
    
}
