// Tarea 6 - reto
// Exporta una función llamada rubricExcellent.
// Debe devolver "Excellent", "Pass" o "Fail".

// 0,1,2,3,4,5,6,7,8,9,10.11
//                   Ʌ_____Ʌ
//                   El alumno con calificaciaon notable
//           Ʌ______Ʌ
//             El alumno pasa
// Ʌ________Ʌ
//             El NO alumno pasa

export function rubricExcellent(score) {

    return score >= 9 && score <= 11 ?
     "Excellent" : score >= 5 ?
      "Pass" : "Fail"

}
