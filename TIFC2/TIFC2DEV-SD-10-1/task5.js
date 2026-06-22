// Tarea 5 - reto
// Exporta una función llamada rubricPassFail.
// Debe devolver "Pass" o "Fail".


// 0,1,2,3,4,5,6,7,8,9,10.11
//           Ʌ_____________Ʌ
//             El alumno pasa
// Ʌ________Ʌ
//             El NO alumno pasa

export function rubricPassFail(score) {

    if(score >= 5){
        return "Pass"
    }else{
        return "Fail"
    }

}
