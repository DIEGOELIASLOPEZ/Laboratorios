
def addmultiplenumbers(numbers):
  resultado = 0
  c= 0
  while(c < (len(numbers))):
    resultado = resultado + numbers[c]
    c+=1
  return resultado

def multiplymultiplenumbers(numbers):
  resultado = 1
  c= 0
  for c in range(len(numbers)):
    resultado = resultado * numbers[c]
  return resultado

def isiteven(num):
  return True if num %2 ==0 else False

def  isitaninteger(num):
  return True if num%1 == 0 else False

def pedir_dos_numeros(lista):
  salir = True
  while(salir):
    print("ESCRIBE UN NUMERO (00 para salir)")
    numero = float(input("Escibe un numero: "))
    if numero != 00:
      lista.append(numero)
    else:
      salir = False
  return lista

def pedir_un_numero():
  numero = float(input("Escibe un numero: "))
  return numero


def main():
  salir_main =True
  lista = []
  while(salir_main):
    print("="*40)
    print("CALCULADORA MEJORADA")
    print("selecciona una opcion")
    print("(1) Suma multiple de numeros")
    print("(2) Multiplicacion multiple de numeros")
    print("(3) ¿Es par tu numero?")
    print("(4) ¿Es enero tu numero?")
    print("(5) SALIR")
    opcion = int(input(": "))

    print("="*40)
    if opcion == 1 or opcion ==2:

      if opcion == 1:
        print("SUMA DE MULTIPLES NUMEROS NUMEROS")
        numeros = pedir_dos_numeros(lista)
        print(addmultiplenumbers(numeros))
      elif opcion == 2:
        print("MULTIPLICACION DE MULTIPLES NUMEROS NUMEROS")
        numeros = pedir_dos_numeros(lista)
        print(multiplymultiplenumbers(numeros))

    elif opcion == 3:
      print("¿ES PAR TU NUMERO?")
      numeros = pedir_un_numero()
      print(isiteven(numeros))
    elif opcion == 4:
      print("¿ES ENTERO TU NUMERO?")
      numeros = pedir_un_numero()
      print(isitaninteger(numeros))
    elif opcion == 5:
      print("SALIENDO DEL PROGRAMA...")
      salir_main = False
        
    else:
      print("Opcion no disponible") 
    print("="*40)



    
      



if __name__=="__main__":
  main()