const prompt = require('prompt-sync')();
function esPrimo(numero) {
  if (numero == 1 || numero == 2) {
    return false;
  }
  for (let i = 3; i <= Math.sqrt(numero); i++) {
    if (numero % i === 0) {
      return false;
    }
  }
  return true;
}


let numerosUsuario = [];
let listaSalida = [];
let numero = 0
let buzzWords = [
  "Fizz",
  "Buzz",
  "Woof",
  "Bark",
  "Awoo",
  "Bang",
];


const NUMEROS = prompt("Cuantos numeros deseas agregar: ")
for (let i = 0; i < NUMEROS; i++) {
  numero = parseInt(prompt("Numero: "))
  numerosUsuario.push(numero)

}


for (let i = 0; i < numerosUsuario.length; i++) {
  let resultado = ''
  numero_primo = esPrimo(numerosUsuario[i])
  if (numero_primo) {
    if (numerosUsuario[i] === 3) {
      resultado = resultado + `Fizz`
      listaSalida.push(numerosUsuario[i])
      listaSalida.push(resultado)

    }
    else if (numerosUsuario[i] === 5) {
      resultado = resultado + `Buzz`
      listaSalida.push(numerosUsuario[i])
      listaSalida.push(resultado)

    }
    else if (numerosUsuario[i] === 7) {
      resultado = resultado + `Bark`
      listaSalida.push(numerosUsuario[i])
      listaSalida.push(resultado)

    }
    else if (numerosUsuario[i] === 11) {
      resultado = resultado + `Awoo`
      listaSalida.push(numerosUsuario[i])
      listaSalida.push(resultado)

    }
    else if (numerosUsuario[i] === 11) {
      resultado = resultado + `Bang`
      listaSalida.push(numerosUsuario[i])
      listaSalida.push(resultado)

    }
    else {
      resultado = prompt("Agrega que nombre le quieres poner a este numero: ")
      listaSalida.push(numerosUsuario[i])
      listaSalida.push(resultado)
    }

  }

}

console.log(listaSalida)
