NUMERO_MAXIMO = 1001;

for i in range(1,NUMERO_MAXIMO):
        print("Fizzbuzz" if i %5 == 0 and i%3 ==0 
              else "Fizz" if i%3 ==0 
              else "Buzz" if i %5 == 0 else f"{i}")

   
    
    
    
    # if c %3 ==0 and c %5 ==0:
    #     print("Fizzbuzz")
    # elif c %3 ==0:
    #     print("Fizz")
    # elif c %5 ==0:
    #     print("Buzz")
    # else:
    #     print(c)



