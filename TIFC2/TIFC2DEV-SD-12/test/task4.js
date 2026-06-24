// Task 4: delUser(number)
import { getServerURL } from '../test/task1'

export async function delUser(userId) {

    try {
        const url = getServerURL() + `/users/${userId}`
        const response = await fetch(url, {
            method: 'DELETE'
        })

        if (!response.ok) {
            throw new Error(`HTTP error! Status: ${response.status}`);

        }
        const data = await response.json();
    }
    catch (error){
        console.log(error)
    }

}


