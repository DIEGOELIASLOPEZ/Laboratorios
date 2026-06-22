# Instrucciones
Los constructores se utilizan para definir una plantilla para un nuevo tipo de objeto. El operador `new` creará una nueva instancia de dicho objeto.

**¡Hoy explorarás las funciones constructoras y aprenderás a crear tus propios objetos personalizados!**

Para cada una de estas tareas, escribe el código directamente en el archivo de la tarea; ¡los scripts de evaluación analizarán lo que hayas escrito!

## Tareas

1. Se te ha proporcionado un constructor para un objeto `Mail`.
    * Modifica el código para que el asunto sea la palabra `hello` y el mensaje sea la palabra `world`.

2. Se te ha proporcionado un constructor para un objeto `Mail`.
    * Modifica el código para que el usuario proporcione su propio asunto y mensaje como parámetros de ejecución, en ese orden.
    * Los parámetros de ejecución son los valores que se pasan a un programa cuando este se ejecuta.
    * Por ejemplo, si el usuario ejecuta el programa con el comando `node index.js 2 hello world`, entonces "node" es el programa, "index.js" es el primer parámetro, "2" es el segundo parámetro, y "hello" y "world" son el tercer y cuarto parámetro, respectivamente.
    * Puedes acceder a los parámetros de ejecución en tu programa utilizando el array `process.argv`.
    * En el ejemplo, el proceso y el primer parámetro (índices 0 y 1 del array `process.argv`) son "node" e "index.js", por lo que puedes ignorarlos.
    * El segundo parámetro (índice 2) es utilizado por este programa para determinar el número de tarea a ejecutar, así que también puedes ignorarlo.
    * Puedes acceder al asunto y al mensaje utilizando `process.argv[3]` y `process.argv[4]`, respectivamente.

3. Se te ha proporcionado un constructor para un objeto `Mail`.
    * Modifica el código para que el usuario proporcione su propio asunto y mensaje como parámetros de ejecución, en ese orden.
    * A continuación, amplía el constructor para incluir un método `printMail()` que imprima lo siguiente en la consola:
        * `<subj>: <msg>`
        * Por ejemplo, si las dos entradas son `hello` y `world`, la salida debería ser `hello: world`.

4. Para esta tarea, deberás escribir tu propio constructor.
    * Crea un constructor llamado `Journey` que acepte dos parámetros: `start` y `end`.
    * Crea un par de constantes llamadas `from` y `to`, y asígnales los valores provenientes de los argumentos de la línea de comandos.

## Tareas adicionales

Si has completado las tareas anteriores, ¡prueba estas tareas extra como un desafío adicional!

5. Crea un constructor para un objeto `FriendsList` que almacene una lista de nombres en un arreglo (array).
    * Tu programa debe pedir al usuario un número y, a continuación, solicitar que se introduzca cada nombre (uno por uno) tantas veces como indique ese número.
    * Luego, el programa debe imprimir el arreglo directamente en la consola.
        * La salida debería verse así: `[ 'nombre1', 'nombre2' ]`

6. ¿Puedes crear un constructor para un objeto que describa una lista de la compra? ¡Usa esta tarea para experimentar con constructores!
    * ¿Qué longitud debería tener la lista?
        * No todos los usuarios querrán la misma cantidad de artículos.
    * ¿Cómo manejarías las cantidades múltiples de un mismo artículo, como 2 botellas de leche o una docena de huevos?
    * ¿Cómo obtendrías esta información del usuario?
    * ¿Cómo almacenarías estos datos en un objeto?
    * ¿Cómo sería la función constructora de este objeto?

7. ¿Puedes crear un constructor para un objeto que describa un automóvil? ¡Usa esta tarea para experimentar con constructores!
    * Piensa en qué datos debería tener el objeto, cómo obtendrías esa información del usuario y cómo la almacenarías.
        * ¿La marca, el modelo y el año?
        * ¿El color?
        * ¿El número de puertas?
        * ¿El kilometraje?
        * ¿Si tiene motor de combustión o es eléctrico?
        * ¿Algo más?