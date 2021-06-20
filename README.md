# Universidad-Java-Udemy

Curso de Udemy en Java

## Variables

-Permiten guardar información. <br>

-Son de tipo: PRIMITIVOS (entreros, flotantes) ó REFERENCIADOS - TIPO OBJETOS - (clases, intefases, arreglos). <br>

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
Una variable que fue definada dentro de un **método**, en este caso dle método main, no va a poder ser usada fuera del mismo. Esto es el **alcance (scope)** de la variable. No vamos a poder acceder a ella desde cualquier parte dle programa, sino que va a depender dónde fue definida.<br>

Un ejemplo de variable de tipo **String**, que no es de tipo piimitivo, sino de clase: <br>
```
String miVariableCadena = "Saludos";
```
También puedo reasignarle valor: <br>
```
String miVariableCadena = "Adios"";
```
Y puedo imprimir concatanando String con variable usando + : <br>
```
System.out.print.ln("El nuevo valor de mi variable miVariableCadena es : " + miVariableCadena);
```

