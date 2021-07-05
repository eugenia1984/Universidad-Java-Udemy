# Lección 3 - Sentencias de Control en Java

# Uso de la estructura if-else y dónde utilizarla


INICIO -> EXPRESION A EVALUAR (tengo dos caminos ) : <br>

-> TRUE ( por bloque if ) -> SENTENCIA1 -> FIN <br>

-> FALSE ( por el bloque else )-> SENTENCIA2 -> FIN <br>

También tengo la opción de : **IF / ELSE IF / ELSE** <br>
Puedo tener tantos ELSE IF como necesite, pero si son varios, tal vez conviene usar SWITCH. <br>

La expreción a evaluar es **boolean** . <br>

:computer:   Ver **SentenciasDeControl.java** <br>


# Manejo de la esctrutura switch y cuando aplicarla

INICIO -> EXPRESION A EVALUAR ( tengo varios caminos ) : <br>
-> CASO 1 -> SENTENCIA 1 -> FIN <br>
-> CASO 2 -> SENTENCIA 2 -> FIN <br>
-> CASO 3 -> SENTENCIA 3 -> FIN <br>
-> DEFAULT -> SENTENCIA DEFAULT - > FIN <br>

La sentencia DEFAULT es como el ELSE , va a ejecutarse cuando no coincida con ninguno de los demás casos. <br>
En cada caso, luego de ejecutar la sentencia tengo un BREAK, para cortar el ciclo y salir del switch (no sigue evaluando los demás casos, ahorra memoria). <br>
Se usa cuando se tiene entre 3 a 5 opciones <br>

La expresión a evaluar es de tipo **numérica** o **String o Char** . <br>


:computer:   Ver **SentenciasDeControlSwitch.java** <br>


---

# Lección 4 - Manejo de Ciclos en Java

Son repetición de líneas de código. <br>
Se revisa una **condición**, si es **verdadera (True)** se ejecuta el código, y se vuelve a evaluar al condición, mientras siga siendo verdadera se ejecutará el código; cuando pasa a **Falsa (False)** se llega al fin del ciclo.<br>

## Uso del ciclo for y su uso

Se revisa la CONDICION, se ejecuta la LÍNEA DE CÓDIGO, hay un INCREMENTO / DECREMENTO, y se vuelve a evaluar. Cuando al condición es FALSE termina de ejecutarse. <br>

El CONTADOR va a estar dentro de la condición del FOR, donde tengo: <br>
inicialización ( esta variable es de alcance LOCAL, no se puede ejecutar fuera del for) <br>
condicion <br>
incremento/decremento <br>

La variable de inicialización solo se ejecuta en el primer ciclo, luego se va evaluando su valor moficiado conel incremento o decremento. <br>

## Uso del ciclo while y cómo aplicarlo

Tiene una **variable** que es un **contador** que se va a ir modificando para en un momento pasar a False. <br>
Siempre PRIMERO EVALUA LA CONDICIÓN  y si es TRUE se ejecuta, es decir que si desde el principio la condición es False el bloque de código nunca se ejecutará. <br>

## Uso del ciclo do-while y cuando utilizarlo

Va a ejecutar el bloque de código AL MENOS UNA VEZ, por más que la condición sea FALSE; ya que siempre primero se ejecuta y luego ve si se cumple la condición. <br>

## Break

Nos corta el ciclo, hace que salgamos del mismo, como en el caso del Switch. <br> 

## Continue

No ejecuta y nos manda a la siguiente iteración del ciclo. <br>

## Etiquetas

Permite indicar a las palabras CONTINUE y BREAK ir a un lugar particular del programa. <br>
No es tan recomendable utilizarlo, puede romper nuestra lógica dle programa, no es buena práctica, pero se muestra por si se la ve, entenderla.<br>

```
inicio:
for (int contador = 0; contador < 3; contador++ ) {
  if( contador % 2 != 0 ) {
    continue inicio;
  }
  System.out.println("contador: " + contador);
}
```


:computer:   Ver **Ciclos.java** <br>
