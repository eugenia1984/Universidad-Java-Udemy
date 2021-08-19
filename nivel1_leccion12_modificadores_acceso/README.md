# Modificadores de acceso en Java

Para donde aplican (SI):

| Modificador | Clase | Variable | Método | Constructor |
| ----------- | ----- | -------- | ------ | ----------- |
| public | SI | SI | SI | SI |
| protected | NO | SI | SI | SI |
| default * | SI | SI | SI | SI |
| private | No | SI | SI | SI |

Estan mencionados del menos restrictivo al más restrictivo

*es la ausencia de cualquier modificador, si no ponemos ninguno va el default

En el ejercicio práctico vamos a definir dos paquetes:

PAQUETE 1:

| Clase1 |
| ------ |
| +id atributo |
| + metodo() |

| Clase2 |
| ------ |

PAQUETE 2:

| Clase3 |
| ------ |

Esta Clase3 va a EXTENDER de la Clase1

| Clase4 |
| ------ |

Clase4 no tiene relación con ninguna otra clase

Mi **CLase1** :

-tiene el MODIFICADOR DE PUBLIC -> **public class Clase1** -> puede ser  utilizada en otra clase del mismo paquete o paquete externo.

-tiene un atributo PUBLIC -> **public String atributoPublico = "Valor atributo publico";** -> voy a poder acceder a este atributo desde otra clase. <br>
En mi TestModificadorAcceso voy a poder acceder al atributo -> ```JAVA System.out.println("clase1: " + clase1.atributoPublico);```


Voy a tener el **paquete test** con la **clase TestModificadoresAcceso** para en el mismo probar acceder a mi Clase1 que es PUBLIC.

Entonces en i Clase TestModificadoresAcceso creo instancio al objeto clase1 a partir de Clase1 y solo importo **import paquete1.Clase1;** y trabajo sin inconvenientes.


