// Tarea 7 - reto
// Exporta una función llamada rubricPerfect.
// Debe devolver "Perfect", "Excellent", "Pass" o "Fail".

export function rubricPerfect(score) {

    return score === 11 ? "Perfect" :
            score >= 9 && score <= 10 ? "Excellent" :
            score >= 5? "Pass"
            : "Fail";
}
