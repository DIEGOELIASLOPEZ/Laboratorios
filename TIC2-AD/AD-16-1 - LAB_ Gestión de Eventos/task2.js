document.addEventListener("DOMContentLoaded", function () {
    tarea2();
})

function tarea2() {

    // * Tarea 2: Escribir una función JavaScript para obtener los valores de Nombre y Apellidos del formulario.
    // Al pulsar el botón, los nombres se imprimirán en la consola.

    const inputName = document.querySelector('.name')
    const inputLastName = document.querySelector('.last-name')
    const inputBtn = document.querySelector('.btn')

    inputBtn.addEventListener('click', function(e){
        e.preventDefault();
        console.log(inputName.value)
        console.log(inputLastName.value)
    })
    

}