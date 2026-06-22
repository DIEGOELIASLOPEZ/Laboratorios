// Tarea 4
// Exporta una clase llamada FriendAge.
// Debe incluir un método returnAge() que devuelva:
// <name> is <age> today!


// * Se crea el objeto FriendAge 
export class FriendAge {

/**
 @param name - Nombre del amigo
 @param year - edad del amigo 
 @param month - Mes del amigo
 @param year - Año del amigo
**/
    constructor(name, year, month, day) {
        this.name = name
        this.year = year
        this.month = month
        this.day = day
    }

// * Funcion que te devuelve la EDAD EXACTA del amigo 
    returnAge() {
        const date = new Date();
        const dia = date.getDate();
        const mes = date.getMonth() + 1;
        const anio = date.getFullYear();

        let edad = anio - this.year;

    // ? Si el año que naciste es le mismo que el actual
        if (anio == this.year) {
            return 'Tienes menor de un año'
        }

    // ? Si tu cumpleaños ya paso
    // ? O si hoy es tu cumpleaños
        else if (mes > this.month || (mes === this.monthmonth && dia >= this.day)) {
            edad = anio - this.year;
        }

    // ? Si aun no es tu cumpleaños      
        else {

            edad = anio - this.year - 1;
        }

        return `${this.name} is ${edad} today!`


    }

}

const prueba = new FriendAge('Kimi', '2026', '7', '7');
console.log(prueba.returnAge());
