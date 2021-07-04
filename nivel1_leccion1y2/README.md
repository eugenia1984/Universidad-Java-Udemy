# Nivel 1. Fundamentos de Java 

---

# Lección 1 - Comenzando con la Tecnología Java

## El asombroso mundo de la programación en Java 

## Qué es la tecnología Java (desde un enfoque práctico) 

## Nuestro primer programa en Java desde cero 

---

# Lección 2 - Variables y Operadores en Java


## Uso de Variables en Java y para qué las utilizamos 

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


## Palabra reservada var

Al utilizar **var** ya no se necesita definir el tipo de variable, pero si se debe asignar un valor para que se entienda de qué tipo es. <br>

```
var miVariableEntera2 = 25;
var miVariableCadena2 = "Nueva cadena";
```

---


## Tipos de Datos en Java y cómo se clasifican <br>

## Tipos primitivos en Java : BYTE , SHORT, INTEGER, LONG

   * byte : 8 bits . Default : 0 .  -128 al 127
   * short : 16 bits . Default : 0 . -32768 al 32767
   * int : 32 bits . Default : 0 . -2147483648 al  2147483647
   * long : 64 bits . Default: 0 . -9223372036854775808 al  9223372036854775807
   
 Un ejemplo de número long: <br>
 var numeroLong = 922337203685477580L;
 **Con LONG puedo indicar con L al final, solo con long, con los demás tipo de números no debo indicar con la letra al final.**

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
   
Un ejemplo de FLOAT : var numeroFLotante = 10.0F; <br>
**Puedo indicar con una F al final que es flotante.** <br>

```
public class FloatDouble {
     public static void main(String args[])  {
         
        System.out.println("Valor minimo tipo float : " + Float.MAX_VALUE);  // 3.4028235E38
        System.out.println("Valor maximo float : " + Float.MIN_VALUE);  // 1.4E-45
     }
}
```
   
   * double : 64 bits . Default: 0.0. Desde 1.7976931348623157E308 al  4.9E-324. Tienen un . para indicar cuando comienza el decimal.
  
Un ejemplo de DOUBLE : var numeroDouble = 1.7976931348623157E308D . <br>  
**Puedo indicar con una D que es de tipo double**. <br>

```
public class FloatDouble {
     public static void main(String args[])  {
        //Double
        System.out.println("Valor minimo tipo double: " + Double.MAX_VALUE);//  1.7976931348623157E308
        System.out.println("Valor maximo double: " + Double.MIN_VALUE); //  4.9E-324
        }
}        
```

:heavy_check_mark:     **Ver el archivo FloatDouble.java**

---

## Tipo primitivo Java: ENTERO

   * char : 16 bits . Default: \u0000 . Es solamente un cracter, se usan comillas simples. Son los caracteres uniocode. También se puede usar el valor decimal, tiene 16 bits, mismo tamaño que un short.
   
```
public class Char {
    public static void main(String args[])  {
        
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter); 
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);  // imprime: varChar = !
        
        char varCharDecimal = 33;  // Para hacer una conversion
        System.out.println("varCharDecimal = " + varCharDecimal);  //imprime: varCharDecimal = !
        
         char varSimbolo = '!';
        System.out.println("varSimbolo = " + varSimbolo);  //imprime: varSimbolo = !
        
         //un tipo char puede convertirse a entero
        int VaraibleEnteraSimbolo = '!';
        System.out.println("VaraibleEnteraSimbolo = " + VaraibleEnteraSimbolo);  //Pero me imprime 33, se convierte a su codigo decimal
    }
    
}
```

:heavy_check_mark:   **ver el archivo Char.java**
   
---

## Tipos primitivos en Java: BOOLEAN

El tipo boolean también es un tipo primitivo y puede almacenar solo el valor de **true** o **false**. <br>
Su valor por default es false. <br>
Valores de tipo bandera, si está en verde (true) podemos continuar, si está en rojo (false) no. Por eso se los conoce como **tipo de datos bandera** . <br>

```
public class Boolean {
    
    public static void main( String args[]) {
    
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
    }
}
```

Se usan mucho en los **algoritmos**. <br>

```
public class Boolean {
    
    public static void main( String args[]) {
    
        boolean varBoolean = true;
        
        //varBoolean ya se entiende que es true, es como poner varBoolean ==true
        if (varBoolean) {
            System.out.println("La bandera es verdadera. ");
        } else {
            System.out.println("La bandera es falsa.");
        }
        
         //Otro ejemplo de algoritmo viendo si una persona es mayor de eddad
        int edad = 30;
        boolean esAdulto = edad >= 18; 
        if (esAdulto) {
            System.out.println("Tiene : " + edad + " Es meyor de edad");
        } else {
            System.out.println("Tiene: " + edad + "Es menor de edad");
        }
    }
}
```

:heavy_check_mark:     **Ver el archivo Boolean.java**

---



## Conversión de tipo Entero a String y vice versa

Para convertir de **String** a **Entero** uso el método **.parseInt()**. <br>

```
public class ConversionTipoPrimitivos {
    
    public static void main( String args[]) {
        
        //Convertir un tipo STRING en un tipo INT
        //Metodo .parseInt() de la clase Integer
        int edad = Integer.parseInt("20");
        System.out.println("edad más 1 = " + (edad + 1));
        
        
    }
}
```

:heavy_check_mark:     **Ver el archivo ConversionTipoPrimitivos.java**


---


### Manejo y Clasificación de operadores en Java <br>



## Conversión de tipo Entero a String y vice versa

Para convertir de **String** a **Entero** uso el método **.parseInt()**. <br>

```
public class ConversionTipoPrimitivos {
    
    public static void main( String args[]) {
        
        //Convertir un tipo STRING en un tipo INT
        //Metodo .parseInt() de la clase Integer
        int edad = Integer.parseInt("20");
        System.out.println("edad más 1 = " + (edad + 1));
        
        
    }
}
```

:heavy_check_mark:     **Ver el archivo ConversionTipoPrimitivos.java**

---

