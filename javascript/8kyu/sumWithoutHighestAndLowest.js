function sumNumbersWithoutHighestAndLowest(array) {
  if (array == null || array.length < 0) {
    return 0;
  }
  for (let i = 0; i < array.length; i++) {
    if (isNaN(array[i])) {
      return 0;
    }
  }
  array.sort((a, b) => a - b);
  let slicedArray = array.slice(1, array.length - 1);
  let sum = 0;
  for (let i = 0; i < slicedArray.length; i++) {
    sum += slicedArray[i];
  }
  return sum;
}

const sumNumbers = sumNumbersWithoutHighestAndLowest([2, 1, 4]);

console.log(sumNumbers);
