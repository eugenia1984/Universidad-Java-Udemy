package numeroMayor;

import java.util.Scanner;

public class NumeroMayor {


    public static void main(String[] args) {
        //Declaro mis variables
        int numero1;
        int numero2;
        //Uso sc para ller lo que ingresan por pantalla
        Scanner leer = new Scanner(System.in);
        //Pido ingresen los numeros y asigno a variables
        System.out.println("Ingresa un numero entero : ");
        numero1 = leer.nextInt();
        System.out.println("Ingresa otro numero entero: ");
        numero2= leer.nextInt();
        if (numero1 == numero2) {  // Primero descarto que sean iguales
            System.out.println("Ingreso dos numeros iguales");
        } else if (numero1 > numero2){
            System.out.println(numero1 + " es mayor a " + numero2);
        } else {
            System.out.println(numero1 + " es menor a " + numero2);
        }
    }
    
}
