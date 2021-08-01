# Uso de Arreglos en Java


Un **array** es un conjunto de elementos de diferentes tipos, pueden ser int, String, objects, boolean, double, etc.<br>

Los **elementos** comienzan con el **índice** 0. <br>
Siempre el length va a ser igual a length-1 .<br>

Ejemplo: <br>

Arreglo de tipos INT: <br>
indices:  0  -  1  -  2  -  3  4<br>
elementos: 35 / 25 / 50 / 46 <br>
El largo (**length**) es de : 4 <br>

## ¿ Cómo declaro un array ?

Los corchetes pueden estar antes o después del nombre de la viariable. <br>

*tipo de dato* + *nombre de la variable de tipo areglo* + *corchetes* : <br>

```
//Arreglo de tipo entero
int edades[];
```      
 
 *tipo de dato* + *corchetes* + *nombre de la voriable de tipo arraeglo* : <br>
 
 ```
//Arreglo de tipo entero
int []edades;
```  

## ¿ Cómo le doy dimesión al arreglo ?

Una vez que tiene una dimensión, es fija, no puede modificarse. <br>

``` 
int edades[] = new int[3];
``` 

Si lo mando a imprimir por consola voy a ver que ya ocupa un lugar en memoria, por más que todavía no tenga sus elementos. <br>


Para acceder a los elementos del arreglo y modificarlos: <br>
*nombre del arreglo* + *corchetes con el índice del elemento que quiero modificar* = *valor a asignar* ; <br>

``` 
edades[0] = 10;
``` 
    
## ¿ Cómo recorro mi arreglo ?

Con un ciclo **FOR**. <br>


```
for (int i = 0; i < edades.length; i++) {
     System.out.println("Arreglo edades con índice : " + i + " de valor: " + edades[i]);
}
```


---

:computer: Se pueden ver los ejercicios de la carpeta **Arreglos**, con su clase **TestArreglos** dentro del paquete **test**. <br>

---

# Manejo de Matrices en Java
