
const prompt = require("prompt-sync")();

function agregarProductosLista(carrito) {
    let menu = true
    let opcion;
    let listaProducto;
    while (menu) {
        listaProducto = [];
        let producto;
        let cantidad;
        let descripcion;
        let productoEncontrado = false;
        console.log(`Producto ${carrito.length + 1} a agregar`)
        producto = (prompt("Producto: ")).toLowerCase();

        productoEncontrado = comprobarRepetidos(carrito, producto);

        if (productoEncontrado == false) {
            listaProducto.push(producto);

            cantidad = parseInt(prompt("Cantidad de producto: "));
            listaProducto.push(cantidad);
            console.log("Descripcion del producto:")
            console.log("(caja, kilos, litros)")
            descripcion = (prompt(": "));
            listaProducto.push(descripcion);

            carrito.push(listaProducto)
        }

        console.log(("¿Deseas agregar otro producto?"));
        console.log(("Escribe Si o No"));
        opcion = prompt("- ")
        opcion = opcion.toUpperCase();

        if (opcion == "NO") {
            menu = false
        }

    };
};

function comprobarRepetidos(carrito, producto) {
    let productoEncontrado = false;
    for (let i = 0; i < carrito.length; i++) {
        if (carrito[i][0] === (producto)) {
            console.log(`${carrito[i][0]} ya esta en la lista con una cantidad de ${carrito[i][1]}, quieres agregar mas cantidad?"`)
            let opcionRepetidas = (prompt("- ")).toUpperCase();
            productoEncontrado = true


            if (opcionRepetidas == "SI") {
                let cantidad = parseFloat(prompt("cantidad extra: "))
                carrito[i][1] = carrito[i][1] + cantidad
                console.log(`Se ha actualizado la cantidad de ${carrito[i][0]} a ${carrito[i][1]}`)

            }

        }

    }
    return productoEncontrado;

}

module.exports = {
    agregarProductosLista
};

