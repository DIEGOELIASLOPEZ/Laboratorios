// Task 2: listUsers()
import { getServerURL } from '../sd-l6-1.0/task1.js'

export async function listUsers() {
    try {
        const url = getServerURL() + '/users'
        const respuesta = await fetch(url)

        if (!respuesta.ok) {
            throw new Error(`Error en la red ${respuesta.status}`)
        }
        const dato = await respuesta.json();
        const dato_sin4 = dato.slice(0, 4);

        console.log("[");

        dato_sin4.forEach((usuario, indice) => {
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




    }
    catch (error) {
        console.log(error)
    }

}

export async function listUsersFull() {
    try {
        const url = getServerURL() + '/users'
        const respuesta = await fetch(url)

        if (!respuesta.ok) {
            throw new Error(`Error en la red ${respuesta.status}`)
        }
        const dato = await respuesta.json();
        console.log(dato);

    }
    catch (error) {
        console.log(error)
    }

}

listUsersFull();
