// Refer to Task 4 in your Instructions to complete this task

const MAX = 105

for (let i = 1; i <= MAX; i++) {
  let resultado = ''

  if (i % 3 == 0) {
    resultado = resultado + `Fizz`

  } if (i % 5 == 0) {
    resultado = resultado + `Buzz`

  } if (i % 7 == 0) {
    resultado = resultado + `Woof`
  }

  if (resultado == "") {

    console.log(i)
  }
  else {
    console.log(resultado)
  }
};