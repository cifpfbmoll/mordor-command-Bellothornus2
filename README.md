<<<<<<< HEAD
COMMAND PATTERN
===============

Programa la lógica de una oficina de correos que procesa pedidos.

En función de si el tratamiento del pedido es posible o no la oficina procesa el pedido (`true` /`false`) e informa de su estado (aceptado /rechazado).

Como los pedidos pueden ser de múltiples tipos, muchos de ellos aun desconocidos y cada uno con sus particularidades propias, vamos a usar el patrón de diseño de comportamiento **_command pattern_**.

Consulta el manual de referencia para ver un ejemplo del patrón:

![Diagrama de clases UML Command Pattern](./diagrama_clases_UML_command_pattern.jpg)


Aplicando el patron COMMAND no procesaremos pedidos, sino que le pasaremos a la oficina (el **procesador**) el tipo de **tratamiento** que ha de aplicar a cada pedido, y será el propio pedido el que decida cómo debe ser tratado.

PASA LOS CASOS TEST PROPUESTOS y utilízalos como guia para el desarrollo practicando **TDD**. No puedes modificar el código de los casos test. 

La clase `App.java` contiene el `main` o script principal y ha de funcionar. No puedes modificar el código del método `main`.

Crea un proyecto **Maven** siguiendo el esquema: `org.mvpigs.commandpattern`

Respeta la estructura del proyecto indicada 
en el nombre de los paquetes que se indican en los casos test. 

- Realiza commits periódicamente mientras avanzas en el desarrollo de la aplicación.
- Publica tu solución en un repo en GitHub.
- Compártelo conmigo si es privado.
=======
# Autograding Example: Java
This example project is written in Java, and tested with Gradle/JUnit.

### The assignment
The tests are currently failing because of an output mismatch. Fixing the `System.out.println` in the main method will make the tests green.

### Setup command
N/A

### Run command
`gradle test`

### Notes
- The JDK is installed on GitHub Actions machines, so you're also able to directly invoke `javac`, `java`, or any other CLI command included in the JDK. 
>>>>>>> 8e171f3a8dfb6355c2568513b5e426debc6af519
