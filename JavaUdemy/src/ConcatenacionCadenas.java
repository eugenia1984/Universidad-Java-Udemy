/*
CONCATENACION DE CADENAS Y ENTEROS
CLASE SCANNER
 */
import java.util.Scanner;
public class ConcatenacionCadenas {

    public static void main(String args[]) {
        String usuario = "Juan";
        System.out.println("usuario = " + usuario);
        String titulo = "Ingeniero";
        String union = titulo + " " + usuario;
        System.out.println("union : " + union + ".");
        // Defino dos variables de tipo entero
        int numero1 = 3;
        int numero2 = 4;
        //+ en vez de concatenar realiza la suma
        System.out.println(numero1 + numero2);  //imprime : 7
        //primero hace la suma y luego concatena
        System.out.println(numero1 + numero2 + usuario); //Imprime : 7Juan
        //Ejemplo de contexto cadena, de izq a der si encuentra cadena todo el resto lo trata como cadena
        System.out.println(usuario + numero1 + numero2);  //imprime : Juan34
        //los parentesis modifican la prioridad en la evaluacion
        System.out.println(usuario + (numero1 + numero2)); //imprime: Juan7 
        
        //Clase Scanner
        //Instanciamos a nuestro clase Scanner creando un nuevo objeto consola
        //Para leer lo que nuestro usuario ingrese por consola
        Scanner consola = new Scanner(System.in);
        System.out.println(" Escribe tu nombre: ");
        //nextLine lee la linea completa no solo la primer palabra
        //leo le valor ingresado y lo asigno a mi varaible usuario1
        String usuario1 = consola.nextLine();
        System.out.println("usuario1 = " + usuario1);
        
        //Ejercicio practico pedir el titulo y autor del libro y mostrarlo
        System.out.println("Escribe el titulo del libro : ");
        String libro = consola.nextLine();
        System.out.println("Escribe el autor del libro: ");
        String autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
              
        
    }
}
