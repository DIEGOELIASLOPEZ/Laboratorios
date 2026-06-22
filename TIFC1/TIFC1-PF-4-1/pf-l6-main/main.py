import requests

def trivia_fetch(num):
    lista= []
    NUMEROS = 1000
    # url = f"https://jsonplaceholder.typicode.com/users/{num}"
    

    while(c<NUMEROS): 
      url = f"https://catfact.ninja/fact"   
      response = requests.get(url)
      trivia = response.json()
      lista.append(trivia["fact"])
      c = c + 1

    return lista


    # if trivia == {}:
    #     return f"No encontró nada en el id: {num}"

    # return f"El nombre es {trivia["name"]}"

def main():
    print("Hello learners!")
    numero = input("Escribe un número: ")
    print(trivia_fetch(numero))

if __name__ == "__main__":
    main()