const arr = [
  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9],
  [10, 11, 12, 13, 14, 15, 16, 17, 18, 19],
  [20, 21, 22, 23, 24, 25, 26, 27, 28, 29]
]

// Type your code below this line!
const arr1 = [1, 2, 3, 4, 5, 6];
arr[0].push(12)

//eliminar primer 3
arr[0].splice(3,1)
arr.push(arr1);

arr[1].reverse()

console.log(arr);
// Type your code above this line!