numero1 = int(input('n: '))
operacion1 = input('o: ')
numero2 = int(input('n: '))
operacion2 = input('o: ')
numero3 = int(input('n: '))


if operacion2 == '*' or operacion2 == '/':
    if operacion2 == '*':
        resultado = (numero1 * numero2) 
        if(operacion1 == '+'):
            resultado = resultado + numero3
        elif(operacion1 == '-'):
            resultado = resultado + numero3

    elif operacion2 == '/':
        resultado = (numero1 / numero2)    
        if(operacion1 == '+'):
            resultado = resultado + numero3
        elif(operacion1 == '-'):
            resultado = resultado + numero3

if operacion1 == '*' or operacion1 == '/':
    if operacion1 == '*':
        resultado = (numero1 * numero2) 
        if(operacion2 == '+'):
            resultado = resultado + numero3
        elif(operacion2 == '-'):
            resultado = resultado + numero3

    elif operacion1 == '/':
        resultado = (numero1 / numero2)    
        if(operacion2 == '+'):
            resultado = resultado + numero3
        elif(operacion2 == '-'):
            resultado = resultado + numero3

            
print(resultado)

