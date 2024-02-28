function powersOfTwo(n) {
  let arrayOfNumbers = [];
  for (let i = 0; i <= n; i++) {
    const raisedNumber = Math.pow(2, i);
    arrayOfNumbers.push(raisedNumber);
  }
  return arrayOfNumbers;
}
const logNumber = powersOfTwo(0);
console.log(logNumber);

function powersOfTwo2(n) {
  let array = [];
  let i = 0;
  while (n >= i) {
    const raisedNumber = Math.pow(2, i);
    array.push(raisedNumber);
    i++;
  }
  return array;
}
const logNumber2 = powersOfTwo2(0);
console.log(logNumber2);

//functional
function powersOfTwo(n) {
  return Array.from({ length: n + 1 }, (v, k) => 2 ** k);
}
