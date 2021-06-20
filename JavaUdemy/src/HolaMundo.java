// Este es un comentario simple - de una sola linea
/*
-Siempre se comienza con una CLASE en Java
-Esta clase es PUBLICA por eso tengo PUBLIC
-El nombre del archivo tiene de nombre con extension .java para poder funcionar
-Vamos a escribir un METODO (funcion) para poder ejecutar el programa
-Vemos todo por consola
-Mi clase (método main que me permite ejecutar mi programa):
public static void main( String args []) {
    }
-Un método es una parte de nuestro código que nos permite ejecutar el programa
- Para mandar a escribir una línea en cosola, llamamos al método print next line: System.out.println();
-Las sentencias siempre terminan con ;
-Las String se definen entre " "
- Con click derecho y RUN FILE ejecuto mi programa y lo veo por consola.

-VARIABLES: permiten guardar información (los datos). 
Tiene un identificador y va a almacenar un valor, de tipo:
*PRIMITIVOS: enteros, flotantes
*REFERENCIADOS (tipo Objeto): clases, interfases, arreglos

Para definir la variable:
1ro: indicamos el tipo
2do: el nombre en camelCase
3ro: su valor
una vez que defino mi variable, para reasignarle el valor directamente la llamo 
por el nombre y le asigno nuevo valor.
*/
public class HolaMundo {
    public static void main( String args []) {
        System.out.println("Hola Mundo desde Java ");  //Shortcut: sout+TAB
        //Defno la variable de tipo entera
        //Le doy como nombre miVariableEntera
        //Le asigno el valor 10
        int miVariableEntera = 10; 
        //mando a imprimir mi variable
        System.out.println(miVariableEntera);
        //modificamos el valor de la varaible
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        //defino una variable de tipo STRING y le asigno el valor Saludos
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);  //Shortcut: mi+CTRL+SPACE
        miVariableCadena= "Adios"; //Reasigno le valor de mi variable, deja de ser Saludos y pasa a ser Adios
        System.out.println("El nuevo valor de miVariableCadena es : " + miVariableCadena);  // Cocatenación de cadena
        //var = inferencia de tipo Java
        //var miVariableEntera2 = 15;
        //System.out.println(miVariableEntera2);
    }
}

