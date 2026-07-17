const calculator = require('./calculator');

test('adds 1 + 2 to equal 3', () => {
  expect(calculator.add(1, 2)).toBe(3);
});

test('adds -4 + 8 to equal 4', () => {
  expect(calculator.add(-4, 8)).toBe(4);
});

test('subtract 5 - 4 to equal 1', () => {
  expect(calculator.subtract(5, 4)).toBe(1);
});

test('subtract -5 - -10 to equal 5', () => {
  expect(calculator.subtract(-5, -10)).toBe(5);
});


// * Tarea 1: 
// Implementar 2 pruebas unitarias para la función divide().
test('divide 10 / 2 to equals 5', () => {
  expect(calculator.divide(10, 2)).toBe(5);
});

test('divide 99.42 / 3 to equals to be close 33.14', () => {
  expect(calculator.divide(99.42, 3)).toBeCloseTo(33.14);
});

// Implementar 2 pruebas unitarias para la función divide().
test('multiply 7 * 8 to equals 56', () => {
  expect(calculator.multiply(7, 8)).toBe(56);
});

test('multiply 3123 * 134 to equals 418482', () => {
  expect(calculator.multiply(3123, 134)).toBe(418482);
});



// TODO: Tarea 3
test('divide 10 by 0 ', () => {
  expect(() => calculator.divide(10, 0)).toThrow("Cannot divide by zero");
});