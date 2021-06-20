# Universidad-Java-Udemy

Curso de Udemy en Java

---


## Variables

-Permiten guardar información. <br>

-Son de tipo: 
   * **PRIMITIVOS** : entreros, flotantes 
   * **REFERENCIADOS - TIPO OBJETOS -** : clases, intefases, arreglos. <br>

¿ Cómo las defino? <br>

1ro : indico el **tipo** de variable. (int, float)<br>
2do : **nombro** a la variable con **camelCase**.<br>
3ro : **asigno** su valor mediante el operador de asignación: **=**.<br>

Puedo reasignar valores a la variable, por ejemplo: <br>

```

public class MiPrimerVariable {
  
  public static void main (String args [] ) {
    
    int miVariableEntera = 10 ;      //Defino mi variable de tipo INTEGER(entera), la nombro 'miVariableEntera' y le asigno el valor 10
    miVaraibleEntera = 3;       //Le reasigno su valor a 3
    System.out.println(miVariableEntera);   // Se va a imprimir 3
  }
}
```
Una variable que fue definada dentro de un **método**, en este caso del método main, no va a poder ser usada fuera del mismo. Esto es el **alcance (scope)** de la variable. No vamos a poder acceder a ella desde cualquier parte dle programa, sino que va a depender dónde fue definida.<br>

Un ejemplo de variable de tipo **String**, que no es de tipo primitivo, sino de clase: <br>
```
String miVariableCadena = "Saludos";
```
También puedo reasignarle valor: <br>
```
String miVariableCadena = "Adios"";
```
Y puedo imprimir concatenando String con variable usando + : <br>
```
System.out.print.ln("El nuevo valor de mi variable miVariableCadena es : " + miVariableCadena);
```

### Reglas para definir una variable:

  * La primer letra en minúscula, luego siempre la primer letra de las demás palabras en mayúscula -**camelCase**-
  * No puede tener caracteres especiales, tampoco es recomendable usar acentos.
  * Puede empezar con **_** o son **$**
  
Algunos ejemplos: miVariable , _miVariable, $miVariable.  

:heavy_check_mark:     **Ver el archivo HolaMundo.java**
---

## Concatenación de cadenas

```
public class ConcatenacionCadenas {
    
    public static void main(String args[]) {
        String usuario = "Juan";
        String titulo = "Ingeniero";
        String union = titulo + " " + usuario;  //" " es para concatenar un espacio en blanco
        System.out.println("union : " + union);  // Ingeniero Juan
    
    
    }
 
}
```
## Concatenación de números y cadenas y números

```
public class ConcatenacionCadenasNumeros {
    
    public static void main(String args[]) {
        // Defino dos variables de tipo entero
        int numero1 = 3;
        int numero2 = 4;
        //+ en vez de concatenar realiza la suma
        System.out.println(numero1 + numero2);  //imprime : 7
        //primero hace la suma y luego concatena
        System.out.println(numero1 + numero2 + usuario); //Imprime : 7Juan
        //Ejemplo de contexto cadena, de izq a der si encuentra cadena todo el resto lo trata como cadena
        System.out.println(usuario + numero1 + numero2);  //imprime : Juan34
        //Los parentesis modifican la prioridad en la evaluacion, primero realiza la suma y luego concatena el string con el int
        System.out.println(usuario + (numero1 + numero2)); //imprime: Juan7  
    }
 }   
```        

:heavy_check_mark:     **Ver el archivo ConcatenacionCadena.java**
---

## Caracteres especiales

**\n** : salto de línea <br>
**\t** : tabulador  <br> 
**\b**: retroceso, recorre un caracter hacia atrás, retrocedo una posiciñon. Si por ejemplo tengo: \b\b entonces retrocedo dos posiciones.  <br> 
\ ' : comilla simple. <br> 
\ " : comilla doble. <br>

---

## Clase Scanner

La usamos para capturar la información que escribe el usuario. <br>
Exportamos: <br>
```
import java.util.Scanner;
```
Pedimos el nombre, lo leemos y lo imprimirmos: <br>
```
//Clase Scanner
//Instanciamos a nuestro clase Scanner creando un nuevo objeto consola, para leer lo que ingrese el usuario por consola
        Scanner consola = new Scanner(System.in);
        System.out.println(" Escribe tu nombre: ");
        String usuario1 = consola.nextLine();
        System.out.println("usuario1 = " + usuario1);
```

Ejercicio practico pedir el titulo y autor del libro y mostrarlo

```

import java.util.Scanner;

public class ConcatenacionCadenas {

    public static void main(String args[]) {
    
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Escribe el titulo del libro : ");
        String libro = consola.nextLine();
        System.out.println("Escribe el autor del libro: ");
        String autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);

    }

}
```

---

## Tipos primitivos en Java : ENTEROS, SHORT, INTEGER, LONG

   * byte : 8 bits . Default : 0 .  -128 al 127
   * short : 16 bits . Default : 0 . -32768 al 32767
   * int : 32 bits . Default : 0 . -2147483648 al  2147483647
   * long : 64 bits . Default: 0 . -9223372036854775808 al  9223372036854775807

```
public class Enteros {
    
    public static void main(String args[])  {
    
    byte numeroByte = 10;
    byte numeroByte2 = (byte)129;  //para pasarlo a byte
    
    //Byte
    System.out.println("Valor variable numeroByte2 : " + numeroByte2);  //-127
    System.out.println(" Valor minimo byte : " + Byte.MIN_VALUE );  //-128
    System.out.println(" Valor maximo byte : " + Byte.MAX_VALUE );  //127
    
    //short 
    short numeroShort = 32000;
    System.out.println("numeroShort = " + numeroShort);
    System.out.println(" Valor minimo short : " + Short.MIN_VALUE );  //-32768
    System.out.println(" Valor maximo short : " + Short.MAX_VALUE );  //32767
    
    //Int
    System.out.println(" Valor minimo int : " + Integer.MIN_VALUE );  //  -2147483648
    System.out.println(" Valor maximo int : " + Integer.MAX_VALUE );  // 2147483647
    
    //Long
     System.out.println(" Valor minimo long : " + Long.MIN_VALUE );  //  -9223372036854775808
    System.out.println(" Valor maximo long : " + Long.MAX_VALUE );  // 9223372036854775807
    
    
    }
}
```

:heavy_check_mark:    **Ver el archivo Eneteros.java** 
---

## Tipos primitivos : FLOAT , DOUBLE

   * float: 32 bits . Default: 0.0 . Del 3.4028235E38 al 1.4E-45
```
public class FloatDouble {
     public static void main(String args[])  {
         
        System.out.println("Valor minimo tipo float : " + Float.MAX_VALUE);  // 3.4028235E38
        System.out.println("Valor maximo float : " + Float.MIN_VALUE);  // 1.4E-45
     }
}
```
   
   * double : 64 bits . Default: 0.0

```

```

:heavy_check_mark:     **Ver el archivo FloatDouble.java**
---

## Tipo primitivo Java: ENTERO

   * char : 16 bits . Default: \u0000
   
---

## Tipos primitivos en Java: BOOLEAN

El tipo boolean también es un tipo primitivo y puede almacenar solo el valor de **true** o **false**. <br>
Su valor por default es false. <br>


