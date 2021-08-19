/*
Cada tipo PRIMITIVO en Java tiene la CLASE WRAPPER asociada
-clase envolvente del tipo primitivo-
int -> Integer
long -> Long
float -> Float
double -> Double
boolean -> Boolean
byte -> Byte
char -> Caracter
short -> Short

Las clases contienen atributos y  métodos, en cambio los tipos primitivos
solo almacenan valores pero no tienen ni atributos ni metodos; para usar objetos
usamos estas clases envolventes

AUTOBOXING -> paso de un primitivo a un object
UNBOXING -> paso de un object a un primitivo
 */
package test;

public class TestAutoboxingUnboxing {
    
    public static void main(String[] args) {
        
        //AUTOBOXING
        Integer entero = 10;
        System.out.println("entero : " + entero);
        System.out.println("entero : " + entero.toString()); //uso el metodo .toString
        System.out.println("entero : " + entero.floatValue());  //para tener su valor flotante
        System.out.println("entero : " + entero.doubleValue());  //para tener su valor de tipo double
        
        //UNBOXING
        int entero2 = entero;  //entero es de la clase Integer aca ya entero2 es de tipo primitivo
        System.out.println("entero2 : " + entero2);
        
        
    }
    
}
