

# Variables iniciales, input para pedir operacion 
completo = input("escribe una operacion: ")
# Inicializamos variable sin espacios para almacenar la operacion si es que existen escpacios entre los numeros y las operaciones
sin_espacios = ''

# Cadena Inicializada para agrupar un conjunto de nuemeros antes que se interrumpa por una operacion basica
numero = '' 

# Lista para agrupar los numeros antes que existiera un operador basico, asi como los operados [2, + , 213 , -, 34]
lista = []
# Candea de numeros para usalo como diccionario de numeros, para saber si un valor es un numero
numeros_cadena = '1234567890'
# Candea de operadores para usalo como diccionario de simbolos, para saber si un valor es un operados
operadores = '+-*/'

# Lista para agrupar las operaciones elementales del suma y resta una vez aplicada las operaciones de Multiplicacion y Division
lista2 = [] 




# Se recorre la cadena por medio de un FOR, ignorando 
for c in completo:
    if c != " ":
        sin_espacios = sin_espacios + c

print(f"Operacion sin espacios: {sin_espacios}")

# Este FOR va agregando los numeros en la lista, donde contempla cuando acaba un numero si el siguiente caracter es un operador
for c in range(len(sin_espacios)):
    if sin_espacios[c] == sin_espacios[0]:
         numero = numero + sin_espacios[c]
        #  break
    elif (sin_espacios[c] != sin_espacios[0] ) and (sin_espacios[c] in numeros_cadena):
        numero = numero + sin_espacios[c]
    elif  sin_espacios[c] in operadores:
        lista.append(numero)
        lista.append(sin_espacios[c])
        numero = ''

lista.append(numero)

print(lista)

# Transforma los valores que numericos a tipo INTEGER
for i in range(0, len(lista),2):
    lista[i] = int(lista[i])

print(f'Elemento lista[0] {lista[0]} = {type(lista[0])}')


print("-" * 40)
print(f'Lista Completa: {lista}')

iterador = len(lista)
c = 0
contadorLista = 1

while(iterador > 0):

    if(lista[c] == "*"):
        lista[c+1] = lista[c-1] * lista[c+1]
        lista[c] = None
        lista[c-1] = None     
    elif lista[c] == "/":
        lista[c+1] = lista[c-1] / lista[c+1]
        lista[c] = None
        lista[c-1] = None

    c = c + 1
    iterador = iterador -1

print(f'Lista quitando operaciones de MULTIPLICACION y DIVISION: {lista}')
print("-" * 40)


for c in range(len(lista)):
    if lista[c] != None:
        lista2.append(lista[c])   


print(f"Lista2 quitando los elementos NONE {lista2}" )
 
j = 1
c= 0
print(lista2)
while c < len(lista2) and j < len(lista2):
    if lista2[j] == '+' or lista2[j] == '-':
        if lista2[j] == '+':
            lista2[c+2] = lista2[c+2] + lista2[c]
            j = j + 2 
            c = c + 2 
            print(lista2)
        elif lista2[j] == '-':
            lista2[c+2] = lista2[c] - lista2[c+2] 
            j = j + 2 
            c = c + 2 
  


print(f"Lista resolvierndo las operaciones de SUMA Y RESTA  {lista2}" )

print("-" * 40)
resultado = lista2[-1]
print(f"Resultado de {completo} = {resultado}")
print("-" * 40)