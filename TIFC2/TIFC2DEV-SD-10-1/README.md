l# SD-10-1: Laboratorio individual - Exportación de funciones

## Objetivo
Practicar el uso de **módulos en JavaScript**: separar código en archivos, exportar funciones o clases con `export` e importarlas desde `index.js`.

> Importante: los nombres de funciones, clases, métodos y propiedades deben escribirse exactamente como se indican. Los tests dependen de esos nombres.

## Cómo ejecutar
Puedes probar una tarea con:

```bash
node index.js <numero_de_tarea> <argumentos>
```

Ejemplos:

```bash
node index.js 1 124
node index.js 2 Karim Uli Georgina
node index.js 3 2001 12 25
node index.js 4 Kimi 1998 11 5
```

Para correr los tests:

```bash
pytest test.py
```

---

## Tareas básicas

### Tarea 1: cálculo de costo mensual
María está calculando el costo de pagos mensuales. Por cada transacción hay:

- una tarifa fija de `$3`
- una tarifa de interés del `1%` (`0.01`)

En `task1.js`, exporta una función llamada:

```js
costCalculator
```

La función debe recibir **un número** y devolver **un número** con el total a pagar.

Fórmula esperada:

```text
monto + 3 + monto * 0.01
```

Ejemplo:

```js
costCalculator(124) // 128.24
```

---

### Tarea 2: nombres de tres amistades
En `task2.js`, exporta una clase llamada:

```js
FriendNames
```

La clase debe recibir **3 argumentos** en el constructor y crear un objeto con estas **3 propiedades exactas**:

```js
name1
name2
name3
```

Ejemplo esperado:

```js
new FriendNames("Karim", "Uli", "Georgina")
```

Debe producir un objeto similar a:

```js
FriendNames { name1: 'Karim', name2: 'Uli', name3: 'Georgina' }
```

---

### Tarea 3: calculadora de edad
En `task3.js`, exporta una función llamada:

```js
ageCalculator
```

La función debe recibir **3 argumentos**:

```text
year, month, day
```

y devolver la edad actual de la persona.

Ejemplo:

```js
ageCalculator(2001, 12, 25)
```

Nota técnica para este laboratorio: el proyecto usa `new Date(year, month, day)`, igual que los tests. En JavaScript, los meses en `Date` empiezan en `0`, pero para este laboratorio conserva la misma lógica del proyecto base para que coincida con los tests.

---

### Tarea 4: edad de una amistad
En `task4.js`, exporta una clase llamada:

```js
FriendAge
```

La clase debe:

1. Recibir **4 argumentos** en el constructor:

```text
name, year, month, day
```

2. Guardarlos como propiedades del objeto.
3. Tener un método público llamado:

```js
returnAge()
```

4. El método debe devolver una cadena con este formato exacto:

```text
<name> is <age> today!
```

Ejemplo de formato:

```text
Kimi is 27 today!
```

---

## Tareas adicionales / reto

Estas tareas son opcionales si terminaste las tareas básicas.

### Tarea 5: aprobar o reprobar
En `task5.js`, exporta una función llamada:

```js
rubricPassFail
```

La función recibe una puntuación de `0` a `11`.

Debe devolver:

- `"Pass"` si la puntuación es mayor o igual a `5`
- `"Fail"` si la puntuación es menor que `5`

---

### Tarea 6: puntuación excelente
En `task6.js`, exporta una función llamada:

```js
rubricExcellent
```

Debe devolver:

- `"Excellent"` si la puntuación es mayor que `8`
- Si no es excelente, debe conservar la lógica de aprobado/reprobado: `"Pass"` o `"Fail"`

---

### Tarea 7: puntuación perfecta
En `task7.js`, exporta una función llamada:

```js
rubricPerfect
```

Debe devolver:

- `"Perfect"` si la puntuación es exactamente `11`
- Si no es perfecta, debe conservar la lógica de la rúbrica: `"Excellent"`, `"Pass"` o `"Fail"`

---

## Sugerencias

- `return` no es lo mismo que `console.log`.
- Los tests revisan lo que la función **devuelve**, no solamente lo que se imprime en consola.
- `this` sirve para guardar valores dentro de un objeto creado por una clase.
- Revisa cuidadosamente mayúsculas y minúsculas: `FriendNames` no es lo mismo que `friendNames`.
