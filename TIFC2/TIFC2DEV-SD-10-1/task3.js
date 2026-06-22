// Tarea 3
// Exporta una función llamada ageCalculator.
// Debe recibir year, month y day, y devolver la edad actual.



export function ageCalculator(year, month, day) {
    const date = new Date();
    const dia = date.getDate();
    const mes = date.getMonth();
    const anio = date.getFullYear();

    let edad;


    // * LOGICA POR CUMPLEAÑOS
    if (anio == year) {
        return 'Tienes menor de un año'
    }
    // ? Si tu cumpleaños ya paso
    // ? O si hoy es tu cumpleaños
    else if (mes > month || (mes === month && dia >= day)) {
        edad = anio - year;
    } else {
        // ? Si aun no es tu cumpleaños
        edad = anio - year - 1;
    }



    return edad;
}

let amigo1 = ageCalculator(2000, 1, 12)
// let amigo2 = ageCalculator(2000, 6, 25)
// console.log(amigo1)
console.log(amigo1)