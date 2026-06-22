// console.log("Objetos")


// const mounstro = {
//     nombre: "Zombie",
//     ataque: "Cuerpo a cuerpo ",
//     drop: "Carne de Zombie "
// }
// const mounstro2 = {
//     nombre: "Araña",
//     ataque: "Cuerpo a cuerpo ",
//     drop: "Cuerdas "
// }


// console.log(mounstro)


class Mob {
    constructor(nombre, drop) {
        this.nombre = nombre;
        this.drop = drop;
    }

    mostrarInfo() {
        return `${this.nombre} dropea ${this.drop}`
    }

}

class Enemigo extends mob {
    constructor(nombre, drop, ataque, hora) {
        super(nombre, drop)
        this.ataque = ataque;
        this.hora = hora;
    }

    mostrarInfo() {
        return `${super.mostrarInfo()}, ataca ${this.ataque} y aparece por las ${this.hora}`
    }

}

const zombie = new enemigo("Zombie", "Carne de Zombie", "Cuerpo a Cuerpo", "Noche");
const cerdo = new mob("Cerdo", "Carne de cerdo");

console.log(cerdo.mostrarInfo())
console.log(zombie.mostrarInfo())