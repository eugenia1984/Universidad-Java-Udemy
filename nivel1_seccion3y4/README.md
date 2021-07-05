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

## Uso del ciclo for y su uso

## Uso del ciclo while y cómo aplicarlo

## Uso del ciclo do-while y cuando utilizarlo
