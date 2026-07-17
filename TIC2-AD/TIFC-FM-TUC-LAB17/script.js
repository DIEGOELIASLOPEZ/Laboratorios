
let mensajes = [];

function dNoneOff() {
    const alerta = document.getElementById("miAlerta")
    alerta.classList.remove("d-none");
    // alerta.classList.add("d-none");
}

function dNoneOn() {
    const alerta = document.getElementById("miAlerta")
    alerta.classList.add("d-none");
    // alerta.classList.add("d-none");
}

function enviarDatosFormulario() {

    const InputEmail = document.getElementById("email")
    const InputTextarea = document.getElementById("textarea");
    const btnMensaje = document.getElementById("mensaje");

    const emailMensaje = InputEmail.value;
    const textareaMensaje = InputTextarea.value;


    if (emailMensaje != "" && textareaMensaje != "") {
        const mensaje = {
            email: emailMensaje,
            textarea: textareaMensaje
        }


        mensajes.push(mensaje)

        console.log(mensajes)

        InputEmail.value = ""
        InputTextarea.value = ""

        btnMensaje.style.color = "black"
        btnMensaje.textContent = "Mensaje Enviado Correctamente"
    }else{
        btnMensaje.style.color = "red"
        btnMensaje.textContent = "Tienes algun campo sin llenar"
    }

}


