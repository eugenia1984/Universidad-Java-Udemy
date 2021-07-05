package areaYPerimetro;

import java.util.Scanner;

public class AreaYPerimetro {


    public static void main(String[] args) {
        // Se debe pedir alto y ancho para calcular 
        //aerea y perimetro de un rectangulo
        //declaro mis variables
        int alto;
        int ancho;
        int area;
        int perimetro;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el alto del rectangulo ( en numeros enteros ) : ");
        alto = leer.nextInt();
        System.out.println("Ingrese el ancho del rectangulo ( en numeros enteros ) : ");
        ancho = leer.nextInt();
        area = alto  * ancho ;
        perimetro = (alto + ancho ) * 2;
        System.out.println("Area : " + area + "\nPerimetro : " + perimetro );
    }
    
}
