function nearestSq(n) {
  const array = [];
  let result;
  for (let i = 1; i <= n; i++) {
    result = i * i;
    array.push(result);
    if (result >= n) break;
  }
  console.log(array);
  if (array.length <= 1) {
    return array[0];
  }
  const number1 = array[array.length - 1] - n;
  const number2 = n - array[array.length - 2];
  if (number1 < number2) {
    return array[array.length - 1];
  }
  return array[array.length - 2];
}

const log = nearestSq(0);
console.log(log);
