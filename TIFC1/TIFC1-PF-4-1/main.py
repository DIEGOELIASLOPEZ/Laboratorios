import json
import requests


NUMERO_PEDITIONES  = 11

personajes = []
nombres = []
id_personaje = []
especie = []
genero = []



def obtenerDatosApi(NUMERO_PEDITIONES ):
    for c in range(1,NUMERO_PEDITIONES):
        url = (f"https://rickandmortyapi.com/api/character/{c}?json")
        response = requests.get(url)
        trivia = json.loads(response.content)
        personajes.append()
        nombres.append(trivia["name"])
        id_personaje.append(trivia["name"])
        especie.append(trivia["name"])
        genero.append(trivia["name"])
        
# print(trivia)

print(nombres)