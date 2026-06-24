// Task 3: addUser(first_name, last_name, email)
// * METODO POST

import { getServerURL } from "./task1.js";

export async function addUser(first_name, last_name, email) {

    // Los argumentos seran guardados en este objeto para posteriormente ser inyectados en db.json
    // * Se debe agregar id, ya que es una calve de db.json. Si no se coloca arriba, 
    // *  lo inyectara de manera automatica hasta el final de las demas claves
    const newUser = {
        "id": 0,
        "first_name": first_name,
        "last_name": last_name,
        "email": email,
    }

    try {
        // url: Se proporicona la url pedida por el servidor, pero en la seccion de users
        const url = getServerURL() + '/users'

        // Se realiza la peticion al localHost, pero pide un segundo argumento (POST
        const response = await fetch(url, {

            // * Se pide el metodo POST como argumento
            method: 'POST',

            // * headers: metadatos del archivo
            // *    Le avisa al Json-Server que los datos que le estamos enviando están en formato JSON 
            headers: {
                'Content-Type': 'application/json'
            },
            // * body: Contenido que deseas guardar en el servidor
            // *    Se inyecta el nuevo usario que proporcionamos
            body: JSON.stringify(newUser)
        });

        // if (!response.ok) {
        //     console.log(`Error de tipo ${response.status}`)
        // }

        // Extraemos la respuesta del servidor para confirmar que se guardó con éxito
        const data = await response.json();
        console.log(data)


    } catch (error) {
        console.log(error)
    }
}

