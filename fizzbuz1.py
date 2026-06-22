NUMBER = 1001;
i = 1

for i in range(NUMBER):
    if i %3 == 0 and i %5 == 0:
        print('Fizz-Buzz')
    elif  i %3 == 0:
        print('Fizz')
    elif  i %5 == 0:
        print('Buzz')
    else:
        print(i)

