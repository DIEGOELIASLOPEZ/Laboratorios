import validator from 'validator' 

console.log("Validando correos: ")
console.log(validator.isEmail('die_elias@hotmail.com'))
console.log(validator.isEmail('die_elias.com'))