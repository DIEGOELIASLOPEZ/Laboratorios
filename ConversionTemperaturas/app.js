
// // const prompt = require('prompt-sync')();


// let celsius = parseInt(prompt("Ingresa la temperatura (°Celsius): "));

let fahrenheit = celsius * (9 / 5) + 32;
let kelvin = celsius + 273.15;

// console.log(fahrenheit)
// console.log(kelvin)


document.addEventListener('DOMContentLoaded', function () {
    convertir();
})


function convertir() {

    const btn = document.querySelector('button');
    const input = document.querySelector('input');

    const salidaF = document.querySelector('.salida-fahrenheit');
    const salidaK = document.querySelector('.salida-kelvin');


    btn.addEventListener('click', function () {

        if (input.value === "") {
            salidaF.textContent = "";
            salidaK.textContent = "";
            return;
        }

        salidaF.textContent = input.value * (9 / 5) + 32;
        salidaK.textContent = Number(input.value) + 273.15;
    })




}



