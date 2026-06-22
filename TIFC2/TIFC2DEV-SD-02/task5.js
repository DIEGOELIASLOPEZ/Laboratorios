const prompt = require('prompt-sync')();

const numeroUsuario = parseInt(prompt("Numero de Lineas: "));


for (let i = 1; i <= numeroUsuario; i++) {
  let resultado = ''

  if (i % 3 == 0) {
    resultado = resultado + `Fizz`

  } if (i % 5 == 0) {
    resultado = resultado + `Buzz`

  } if (i % 7 == 0) {
    resultado = resultado + `Woof`

  } if (resultado == "") {

    console.log(i)
  }
  else {
    console.log(resultado)
  }
};