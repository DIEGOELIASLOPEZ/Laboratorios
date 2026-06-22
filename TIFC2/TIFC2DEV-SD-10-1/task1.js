// Tarea 1
// Exporta una función llamada costCalculator.
// Debe recibir un monto y devolver: monto + 3 + monto * 0.01

export function costCalculator(amount) {
    console.log(amount)
    amount  = amount + 3 + amount * 0.01;
    return amount 

}

console.log(costCalculator(124))
