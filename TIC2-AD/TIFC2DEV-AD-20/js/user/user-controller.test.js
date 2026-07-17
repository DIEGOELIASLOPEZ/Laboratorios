const UserController = require("./user-controller");
const User = require("./user");

const userController = new UserController();

test('add user to userController', () => {
  let user = new User(1234, "Santiago", "santiago@generation.org");
  userController.add(user);
  expect(userController.getUsers()).toContain(user);
});

test('remove user to userController', () => {
  let user = new User(1234, "Santiago", "santiago@generation.org");
  userController.add(user);
  userController.remove(user);
  expect(userController.users).not.toContain(user);
});


// TODO TAREA 2

//* Implementar 1 prueba para la función add() que verifica un usuario que no está en la lista de usuarios.
test('verify user does not exist in array using add() method', () => {
// Create a new User Instance
  let user = new User(1234, "Santiago", "santiago@generation.org");

  // * expect1
  // Use .getUsers() to check the users in the array contructor
  // includes .not.toContain(user) to verify  the constructor NOT exist in the array yet
  expect(userController.getUsers()).not.toContain(user);

  // *Call  userController.add method to push the nre user into the array 
  userController.add(user)

    // * expect2
  // Use .getUsers() to check the users in the array contructor
  // includes .toContain(user) to verify the constructor exist in the array 
  expect(userController.getUsers()).toContain(user);

});


// * Implementar 1 prueba para la función remove() que verifica un usuario que no está en la lista de usuarios.
test('verify user does not exist in array using remove() method', () =>{
  // Create a new User Instance
  let user = new User(1234, "Santiago", "santiago@generation.org");

  // * expect1
  // Use .getUsers() to check the users in the array contructor
  // includes .not.toContain(user) to verify  the constructor doesn't exist in the array yet
  expect(userController.getUsers()).not.toContain(user);

  // *Call  userController.remove method to push the nre user into the array 
  userController.remove(user)

    // * expect2
  // Use .getUsers() to check the users in the array contructor
  // includes .not.toContain(user) to verify the constructor still doesn't exist in the array yet
  expect(userController.getUsers()).not.toContain(user);
})


// * Implementar 2 pruebas unitarias para la función findByEmail().
test('Find email', () =>{
  // Create a new User Instance
  let user = new User(1234, "Santiago", "santiago@generation.org");
  userController.add(user);

 expect(userController.findByEmail("santiago@generation.org")).toBe(user);
})
test('Doesnt Find email', () =>{
  // Create a new User Instance
  let user = new User(1234, "Santiago", "santiago@generation.org");
  userController.add(user);

 expect(userController.findByEmail("santi@gen.net")).toBeUndefined();
})




// * Implementar 2 pruebas unitarias para la función findByEmail().
test('Find id', () =>{
  // Create a new User Instance
  let user = new User(1234, "Santiago", "santiago@generation.org");
  userController.add(user);

 expect(userController.findById(1234)).toBe(user);
})
test('Doesnt Find id', () =>{
  // Create a new User Instance
  let user = new User(1234, "Santiago", "santiago@generation.org");
  userController.add(user);

 expect(userController.findById(712)).toBeUndefined();
})

