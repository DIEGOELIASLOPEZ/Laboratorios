document.addEventListener("DOMContentLoaded", function(){
    tarea1();
})


function tarea1(){
// * Tarea 1: Modificar el estilo del texto del párrafo mediante código JavaScript.
//    Al hacer clic en el botón, la fuente, el tamaño de fuente y el color del texto del párrafo deberían cambiar.

const p = document.querySelector('p');
const btn = document.querySelector('button');

btn.addEventListener("click", function(){
    p.style.fontFamily = "cursive";
    p.style.fontWeight = 900;
    p.style.fontSize = '10rem';
    p.style.color = 'blue';
})

}