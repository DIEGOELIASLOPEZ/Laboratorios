// Task 3: addUser(first_name, last_name, email)
import { getServerURL } from '../test/task1'
// import { getServerURL } from '../sd-l6-1.0/task1.js'


export async function addUser(first_name, last_name, email) {
    const newUser= {
        "id": 0,
        "first_name": first_name,
        "last_name": last_name,
        "email": email
    }

    try {
        const url = getServerURL() + '/users'
        const respuesta = await fetch(url, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(newUser)
        });

        const datos = await respuesta.json();
        console.log(datos)
    }
    catch (error) {
        console.log(error)
    }

}
