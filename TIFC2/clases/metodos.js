let cadena = "Generation México"



function Persona(nombre, edad, ciuad) {
    this.nombre = nombre;
    this.edad = edad;
    this.ciuad = ciuad;

    this.listaGustos = []
    this.contadorGustos = 0


    this.gustoCulposo = function (gusto) {
        this.listaGustos.push(gusto)
        this.contadorGustos = this.contadorGustos + 1;
    }

    this.datos = function () {
        console.log(`Nombre: ${this.nombre}
                    Edad: ${this.edad}
                    Ciudad: ${this.ciuad}
                    Gustos: ${this.listaGustos.join(", ") || "Ninguno todavía"}`);
    };


}

const persona1 = new Persona("Elías", 22, "Ciudad de México")

nombre = persona1.nombre

persona1.gustoCulposo("Escuchar música viejita");

// Mandamos a llamar tu método datos
persona1.datos();