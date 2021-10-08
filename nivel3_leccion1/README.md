# Nivel 3 - Leccion 1

## Instrucciones para bajar MySQL y Workbench

Definir un **usuario** y una **contraseña. Y que se inicie MySQl al inciiar la computadora.

---

## Creación de Base de Datos con MySQL

1-Click en **DataBase**

2-Connect to **DATABASE**. Com nos conectamos locarlmente:

Hostname:  localhost ó 127.0.01

Port: 3306

Usuario: el que creamso recien

Password: el que creamos recien


*Si no aparece conectado, hay que hacer:

tecla de logo de windows + R

services.msc

Y buscar en la lista el nombre de la conexión MySQl

->Propiedades -> Automatico

-> Habilitar o iniciar

Haciendo click en el icono de **SCHEMa** creo la nueva Base de Datos con el nombre **test**. Refresco / actualizo y en la lita de SCHEMAS ya veo *test*.

En comando:
```
CREATE SCHEMA `test` ;
```

---

## Creación de tabla

Haciendo click derecho sobre tabla puedo crear uan nueva tabla de nombre *persona*:

Columna:

id_persona | INT | PK (primary key) | NN (NOT NULL) | AI (AutoIncrement)

nombre VARCHAR

apellido VARCHAR

email VARCHAR

telefono VARCHAR


-> Click en **appy**


En sentencia SQL:

```
CREATE TABLE `test`.`persona` (
  `id_persona` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  PRIMARY KEY (`id_persona`));
```

---





