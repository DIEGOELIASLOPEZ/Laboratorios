const prompt = require('prompt-sync')();
let listaNumeros = [];
let numero = 0;


const NUMEROS = prompt("Cuantos numeros deseas agregar: ")

for (let i = 0; i < NUMEROS; i++) {
  numero = prompt("Numero: ")
  listaNumeros.push(numero)

}

for (let i = 0; i < listaNumeros.length; i++) {
  let resultado = ''

  if (listaNumeros[i] % 3 == 0) {
    resultado = resultado + `${listaNumeros[i]}: Fizz`

  } if (listaNumeros[i] % 5 == 0) {
    resultado = resultado + `${listaNumeros[i]}: Buzz`

  } if (listaNumeros[i] % 7 == 0) {
    resultado = resultado + `${listaNumeros[i]}: Woof`

  } if (resultado == "") {

    console.log(listaNumeros[i])
  }
  else {
    console.log(resultado)
  }
};