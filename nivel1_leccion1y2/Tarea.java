
import java.util.Scanner;

/*
 Se solicita capturar la siguiente información de una tienda de libros:
nombre (String)
id (int)
precio (double)
envioGratuito (boolean)

Tu tarea es imprimir un mensaje en el siguiente formato:
Proporciona el nombre:
Proporciona el id:
Proporciona el precio:
Proporciona el envio gratuito:
<nombre> #<id>
Precio: <simbolo><precio>
Envio Gratuito: <envioGratuito>
 */

public class Tarea {


    public static void main(String[] args) {
        // Declaro mis variables
        String nombre="";
        int id = 0;
        double precio = 0;
        boolean envioGratuito = true;
        
        //Pido los datos por consola , los guardo en variables y al final los muestro
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Proporciona el nombre : ");
        nombre = sc.nextLine();
        
        
        System.out.println("Proporciona el id : ");
        id = Integer.parseInt(sc.nextLine());
        
        System.out.println("Proporciona el precio : ");
        precio = Double.parseDouble(sc.nextLine());
        
        System.out.println("Ingresa el tipo de envío - true para envio y false para retiro :");
        envioGratuito = Boolean.parseBoolean(sc.nextLine());
        
        System.out.println( nombre + " #" + id);
        System.out.println("Precio : $ " + precio);
        System.out.println("Envío gratuito: " + envioGratuito);
        
    }
    
}
