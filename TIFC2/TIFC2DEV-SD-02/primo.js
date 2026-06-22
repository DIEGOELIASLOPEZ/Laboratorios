const prompt = require('prompt-sync')();
function esPrimo(numero) {
  if (numero == 1 || numero == 2) {
    return false;
  }
  for (let i = 2; i <= Math.sqrt(numero); i++) {
    if (numero % i === 0) {
        console.log(i)
      return false;
    }
  }
  return true;
}


console.log(esPrimo(10))
console.log(Math.sqrt(10))