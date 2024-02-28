function consecutive2(arr, a, b) {
  const indexOfA = arr.indexOf(a);
  const indexOfB = arr.indexOf(b);
  const indexAMinusOne = indexOfA - 1;
  const indexAPlusOne = indexOfA + 1;
  return indexOfB == indexAMinusOne || indexOfB == indexAPlusOne ? true : false;
}

const log = consecutive2([1, 2, 8, 10, 11], 2, 8);
console.log(log);
