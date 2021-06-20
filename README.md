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
## Concetenación de números y cadenas y números

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
    }
 }   
```        
