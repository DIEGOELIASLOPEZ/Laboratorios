var { agregarProductosLista } = require("./functionsTask6");

const prompt = require("prompt-sync")();


function carritoCompras(listaCompras) {
    this.carritoCompras = listaCompras
    this.numeroProductos = this.carritoCompras.length;

    this.mostrarCarrito = function () {
        if (this.carritoCompras.length == 0) {
            console.log("Carrito Vacio")
        } else {
            this.carritoCompras.forEach(element => {

                console.log(`- ${element[1]} ${element[2]} de ${element[0]}`)
            });
        }

    }

    this.agregarProductos = function () {
        agregarProductosLista(this.carritoCompras)

    }
}





let lista = [["huevo", 20, "kilos"], ["leche", 1, "cajas"]]
const carrito1 = new carritoCompras(lista);
carrito1.agregarProductos();
carrito1.mostrarCarrito();




