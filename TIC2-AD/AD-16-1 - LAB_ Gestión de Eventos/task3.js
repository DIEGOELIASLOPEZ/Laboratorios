document.addEventListener('DOMContentLoaded', function () {
    tarea3();
})


function tarea3() {

    // * Tarea 3: Escribir una función para mostrar una alerta con información sobre enlaces.
    // * Al hacer clic en el botón debería aparecer el número de enlaces de la página, el primer enlace de la página y el último enlace de la página.

    const enlaces = document.querySelectorAll('li a')
    // const enlaces = document.querySelectorAll('a')
    const btn = document.querySelector('.btn');

    btn.addEventListener('click', function () {

        const totalEnlaces = enlaces.length
        let primerEnlace = enlaces[0]
        let ultimoEnlace = enlaces[3]
        const mensaje = (`Total de Enlaces: ${totalEnlaces}
                        \n${primerEnlace.textContent}:  ${primerEnlace.href}: 
                        \n${ultimoEnlace.textContent}:  ${ultimoEnlace.href}:`)
        alert(mensaje)
    })

}