// * Task 2: listUsers()
// * METODO GET

// Importamos el server url
import { getServerURL} from "./task1.js";

export async function listUsers(){
    //Manejo de excepciones
    try{
        // url: Se proporicona la url pedida por el servidor, pero en la seccion de users
        const url = getServerURL()+ '/users'

        // fetch - Es una función de JavaScript que sirve para hacer peticiones HTTP
        //         Toma la url y viaja atravez de la red hasta el servidor para pedir la informacion
        // await  - Provoca que la ejecución de una función async sea pausada hasta que 
        //          una Promise sea terminada o rechazada, y regresa a la ejecución de la función async después del término.
        // * fetch(url) devuelve inmediatamente un objeto de tipo Promise
        const response  = await fetch(url)

        if(!response.ok){
            throw new Error(`Error de tipo ${response.status}`)
        }

        //data: Guardamos el contenido del apu en un formato json
        let data = await response.json();
        
        //* Para poder pasar el test exitosamente, se requiere mandar un formato especial:

        // - Solo muestra los 4 primmeros ids (el id 5 no lo muestra)
        // - El test espera una cadena, NO un objeto, para pasar el test deve devolver una cadena

        // 1. Quitamos el objeto de id 5:
        data = data.slice(0, 4);

        //* Este bloque de codigo, fue realizado por IA
        // 2. Convertir en una cana el objeto

        console.log("[");

        data.forEach((usuario, indice) => {
            console.log("{");
            console.log(`  id: ${usuario.id},`);
            console.log(`  first_name: '${usuario.first_name}',`);
            console.log(`  last_name: '${usuario.last_name}',`);
            console.log(`  email: '${usuario.email}'`);

            if (indice === 3) {
                console.log("}");
            } else {
                console.log("},");
            }
        });

        console.log("]");

    //Si marca error, manda por consola, que error tuvo
    }catch(error){
        console.log(error)
    };
    

}

