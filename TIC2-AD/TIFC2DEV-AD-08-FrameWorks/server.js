//Importamos express
const express = require('express');

//Creamos una instancia de la app
const app = express();

//Definir el puerti
const PORT = 7070;

//Definir la ruta
app.get('/', (req, res) => {
    res.send("Hola estamos usando Express");
});

app.get('/saludo', (req, res) => {
    res.json({
        mensaje: "Hola, ¿Como estas?",
        fecha: new Date().toLocaleDateString(), 
        hora: new Date().toLocaleTimeString()  
    });
});

//Inizializar Servidor

app.listen(PORT, ()=>{
    console.log(`Servdor corriendo http://localhost:${PORT}`);
    console.log('Probando Rutas');
    console.log(`Servdor corriendo http://localhost:${PORT}/`);
    console.log(`Servdor corriendo http://localhost:${PORT}/saludo`);
})