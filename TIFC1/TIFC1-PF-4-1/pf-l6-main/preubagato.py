import requests
import json



def trivia_fetch(num, lista):
    
    NUMEROS = 10    
    c = 0
    while(c<NUMEROS): 
        url = f"https://catfact.ninja/fact"   
        response = requests.get(url)
        trivia = response.json()
        lista.append(trivia["fact"])
        c = c + 1
        
    return lista


def main():
    lista= []
    print("Hello learners!")
    numero = int(input("Escribe un número: "))
    if numero <= 10:
        lista2 = trivia_fetch(numero, lista)
        print(lista2[numero])
    

if __name__ == "__main__":
    main()


