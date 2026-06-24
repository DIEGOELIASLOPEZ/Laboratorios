// Task 4: delUser(number)
// * Metodo DELETE

import { getServerURL } from "./task1.js";

export async function delUser(id_number){

    try{

        // Se pide la url del localhost. 
        // * pero esta vez inclutyendo al id
        // * del usuario que desear eliminar
        const url = getServerURL() + `/users/${id_number}`

        // Se hace la llamada al servidor y se llama el metodo DELETE
        // Por lo que elimina el contendio que esta en la url
        const response = await fetch(url,{
            method: 'DELETE'
        })

        if(!response.ok){
            console.log(`Error de tipo ${response.status}`)
        }

        // Extraemos la respuesta del servidor para confirmar que se eliminó con éxito
        const data = await response.json();

    }
    catch(error){
        console.log(error)
    }

}




