nstrucciones

¡Ahora es tu oportunidad de crear un cuestionario! Tu cuestionario puede funcionar como tú quieras.

Primero, vamos a separar nuestra lógica interactiva dentro de la función main(), de la siguiente manera:

def main():
  print("Hello learners!")

if __name__=="__main__":
  main()

Este es código boilerplate (plantilla base) de Python, que solo se ejecutará cuando el programa sea iniciado por una persona. Todo tu código ahora debe estar dentro de una función: ya sea esta función main() (donde puedes poner cosas como instrucciones input) o alguna otra función.

La evaluación automática se basará en la funcionalidad de la siguiente función (la cual debe incorporarse en tu programa):

trivia_fetch(num) — esta función debe existir en tu programa, debe recibir un número como entrada y debe devolver un diccionario con datos curiosos (trivia) sobre ese número.

Recuerda: Este proyecto será calificado automáticamente, ¡y las computadoras son muy literales!

Nota: ¡Usa las pruebas! No tiene nada de malo ejecutar las pruebas hasta que las apruebes. ¡No es hacer trampa!