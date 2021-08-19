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

