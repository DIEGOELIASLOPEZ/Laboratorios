document.addEventListener('DOMContentLoaded', function () {
    tarea4()
})

function tarea4() {
    // Seleccione la sección con un id de contenedor
    const container = document.querySelector('#container');

    // Seleccione todos los elementos de la lista con una clase de "segundo".
    const second = document.querySelectorAll('.second');
    console.log(`Elementos de la lista con una clase de "segundo" \n
        second[0]: ${second[0].innerText}\n
        second[1]: ${second[1].innerText}`)

    // Seleccione un elemento de la lista con una clase de tercero, pero sólo el elemento de la lista dentro de la etiqueta ol.
    const thirdOl = document.querySelector('ol .third');
        console.log(`Elemento de la lista con una clase de tercero, pero sólo el elemento de la lista dentro de la etiqueta ol \n
        ${thirdOl.innerText}\n`)

    // Dar el texto "¡Hola!" a la sección con un id de contenedor.
    const texto = document.createElement('P');
    texto.innerText = "Hello!"
    container.append(texto)
    // container.innerHTML = "Hello!"

    //Añade la clase principal al div con una clase de pie de página.
    const footer = document.querySelector('.footer');
    footer.classList.add('main')
    //Eliminar la clase principal en el div con una clase de pie de página.
    footer.classList.remove('.main')

    // Crea un nuevo elemento li.
    const li = document.createElement('LI');
    //Dale al li el texto "cuatro".
    li.innerText = "four"

    // Añade el li al elemento ul.
    const ul = document.querySelector('ul');
    ul.append(li)


}