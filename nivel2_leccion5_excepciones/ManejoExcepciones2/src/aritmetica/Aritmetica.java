package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
//throws OperacionExcepcion -> me avisa que puede lanzar una excepcion del tipo OperacionExcepcion
    public static int division(int numerador, int denominador) throws OperacionExcepcion{
        //si denominador es igual a 0 voy a tener excepcion
        if (denominador == 0) {
            throw new OperacionExcepcion("Division entre cero"); 
        //aca lanzo la excepcion que la mando como mensaje a OperacionExcepcion
        } 
        //si el denominador no es 0 ->  puedo hacer la divisionsin ningun problema
        return numerador / denominador;
    }
}
