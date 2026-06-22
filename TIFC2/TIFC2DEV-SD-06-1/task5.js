const prompt = require("prompt-sync")();

function FriendsList(lista){
    this.numeroAmigos = lista[0];
    this.nombreAmigos = lista.slice(1)

    this.mostrarAmigos = function(){
        console.log(this.nombreAmigos)
    }
    

    
}

// Type your code below this line!
const listaAmigos = []
    
let numeroAmigos = 0
let contador = 0

numeroAmigos = parseInt(prompt("¿Cuántos nombres deseas agregar?: "))
listaAmigos.push(numeroAmigos)

while(contador<numeroAmigos){
    let cantidad = (prompt(`Nombre del ${contador+1}° amigo: `));
    listaAmigos.push(cantidad)
    contador = contador + 1
}


const lista = new FriendsList(listaAmigos) 

console.log(lista.nombreAmigos)


