
import math

def formularGeneral(a,b,c):
    raiz = (b*b) - (4*(a*c))

    if raiz < 0:
        return "No hay solucion"
    else:
        raiz = math.sqrt(raiz)
        x1 = (-b + raiz) / (2*a)
        x2 = (-b - raiz) / (2*a)

        return x1, x2




def facctorial (n):
    resultado = 1
    while(n>0):
        resultado = resultado * n
        n = n-1

    return resultado  
    


if __name__ == '__main__':
    print(formularGeneral(1, 20, 5))
    print(facctorial(4))