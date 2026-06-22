# # ==========================================
# # REPASO DE PYTHON
# # ==========================================
# print("=== LISTAS ===")
# frutas = ["manzana", "pera", "uva"]
# print(frutas)
# print("Primera fruta:")
# print(frutas[0])
# print("Segunda fruta:")
# print(frutas[1])

# print("\n=== DICCIONARIOS ===")
# persona = {
#     "nombre": "Jahel",
#     "edad": 28,
#     "ciudad": "Tlaxcala"
# }
# print(persona)
# print("Nombre:")
# print(persona["nombre"])
# print("Edad:")
# print(persona["edad"])

# print("\n=== FUNCIONES ===")
# def saludar(nombre):
#     return f"Hola {nombre}"
# mensaje = saludar("CH69")
# print(mensaje)

# print("\n=== FIN DEL REPASO PYTHON ===")

# usuario = {}

# datos_personales = {}

# clave1 = "id"
# clave2 = "nombre"
# clave3 = "apellido"
# clave4 = "edad"
# clave5 = "nacimiento"

# # Llenamos los datos
# datos_personales[clave1] = 1
# datos_personales[clave2] = "Elias"
# datos_personales[clave3] = "Lopez"
# datos_personales[clave4] = 23
# datos_personales[clave5] = 2003


# nombre_usuario = datos_personales[clave2] 

# usuario[nombre_usuario] = datos_personales

# print(usuario)



def diccionario_dinamico():
    diccionario = {}

    menu = True
    id = 0
    print("Formulario de Trabajadores")
    datos_usuario = int(input("¿Cuantos Datos del usuario requieres tener?: "))
    dato = ""
    opcion = 0

    while(menu):
        id =  input("Id del Usuario: ")
        diccionario[id] ={}

        for c in range(datos_usuario):
            dato = input(f"{c + 1}° Dato que requieres antotar: ")
            dato = dato.lower();
            diccionario[id][dato] = None

        for c in diccionario[id]:
            dato = input(f"{c} del usuario: ")
            diccionario[id][c] = dato
        
        opcion = input("¿Quieres agregar a otro usuario? (Si/No: ")
        opcion = opcion.upper();
    
        if(opcion == "NO"):
            menu =  False
        else:
            print("DATOS DE NUEVO USUARIO")

    return diccionario
        




print(diccionario_dinamico())
