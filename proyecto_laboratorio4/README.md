# Proyecto Laboratorio de nivel 3

## Objetivo:

Crear unn pruyecto con las sigueintes características:

-Crear una tabla llamada **usuario** en MySQL en el esquema test:

-id_usuario (int) (PK)

-usuario (VARCHAR)

-password (VARCHAR)

1-Crear las clases similares al ejercicio JDBC para el manejo de las operaciones SELECT, INSERT, DELETE pero ahora para la tabla de usuario.

---

**1.** En MySQL Workbench en mi SCHEMA **test** que ya tenia del ejercicio anterior:

```SQL
CREATE TABLE `test`.`usuario` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`id_usuario`));
```

**2.** Selecciono la table:

```SQL
SELECT * FROM test.usuario
```

**3.** Agreo usuario:

```SQL
INSERT INTO `test`.`usuario` (`usuario`, `password`) VALUES ('ana.costa', '123456');
INSERT INTO `test`.`usuario` (`usuario`, `password`) VALUES ('maria.lopez', 'abcdef');
```

**4.** En NetBeans creo el nuevo proyecto: **laboratoriofinal4**  y los paquetes *datos*, *domian* con su clase *usario*, *test*

**5.** Creo la clase *Usario* en el paquete *domain* con sus atributos:

```JAVA
private int idUsuario;
private String userName;
private String password;
```

Los constructores vacíos y con parámetros. Los Getters y setters y el toString.

En el mismo paquete *domain* copio la clase **Persona** del ejercicio anterior.

**6.** Reutilizo la clase **Conexion** y **PersonaJDBC** del paquete *datos* del ejercicio anterior. Y creo la clase **UsuarioJDBC** en el mismopaquete.





---
