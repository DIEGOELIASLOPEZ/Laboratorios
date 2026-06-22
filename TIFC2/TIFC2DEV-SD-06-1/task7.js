

class Automovil {
    constructor(marca, color, puertas, kilometraje, motor) {
        this.marca = marca
        this.color = color
        this.puertas = puertas
        this.kilometraje = kilometraje
        this.motor = motor
    }

    mostrarInformacion() {
        console.log(`Marca: ${this.marca}`)
        console.log(`Color: ${this.color}`)
        console.log(`Numero de Puertas: ${this.puertas}`)
        console.log(`Kilometraje: ${this.kilometraje}km`)
        console.log(`Tipo de Motor: ${this.motor}`)
    }
}


const mercedes = new Automovil("Mercedes", "Negro", 4, 10, "Hibrido")

mercedes.mostrarInformacion();
