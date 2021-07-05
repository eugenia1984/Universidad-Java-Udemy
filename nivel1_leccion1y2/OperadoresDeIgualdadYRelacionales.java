package operadoresDeIgualdadYRelacionales;

import java.util.Scanner;

public class OperadoresDeIgualdadYRelacionales {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        boolean c = ( a == b);
        System.out.println("c = " + c);
        
        boolean d = a != b;
        System.out.println("d = " + d);
        
        //Ejemplo con String con .equals()
        String cadena1 = "Hola";
        String cadena2 = "Adios";
        boolean esIgual = cadena1.equals(cadena2);
        System.out.println(cadena1 + " es igual a " + cadena2 + " ? : " + esIgual);
        
        //Operadores relacionales
        boolean g = a > b;  // 3 > 2  es mayor que
        System.out.println("a ( " + a + " ) es mayor ( > ) a b ( " + b + " )  ? " + g);
        
        //Declaro mi variable edad
        int edad;
        //Pido por consola ingrese la edad
        System.out.println("Ingrese su edad para decirle si es adulto: ");
        Scanner sc = new Scanner(System.in);
        //Leo y asigno el valor a la varieble
        edad = sc.nextInt();
        if (edad < 0) {  //Si ingreso un número negativo
            System.out.println("La edad no puede ser menor a 0");
        } else if (edad >= 18) {  //Si la edad es mayor o igual a 18
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
    
}
