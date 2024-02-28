// 1.
//create a  function, that receives a number
// goal: return an array, that has numbers inside, that count from zero until the number i get from the the argument
//starts with zero

function countNumbers(number) {
  let array = [];
  for (let i = 0; i <= number; i++) {
    array.push(i);
  }
  return array;
}
const log = countNumbers(30);
console.log(log);

//2.
//receive number
//return array
// array starts with the number
// counts to zero

//initialize empty array
// loop over the array
//decrease value of number in every iteration
//push value to the array

function decreaseNumbers(number) {
  let array = [];
  for (; 0 <= number; number--) {
    array.push(number);
  }
  return array;
}

const logNumbers = decreaseNumbers(17);
//console.log(logNumbers);

function decreaseNumbers2(number) {
  let array = [];
  for (let counter = number; counter >= 0; counter--) {
    array.push(counter);
  }
  return array;
}

const logNumbers2 = decreaseNumbers(17);
//console.log(logNumbers2);

//3.
//receive number & array of numbers
// return all numbers in the array only if they are bigger than number
// return empty array if numbers are smaller

//create empty array
//iterate over the array -> if array[i] > number, push [i]
//if all the numbers are smaller than number -> return []

function returnIfBigger(number, array) {
  let resultArray = [];
  for (let i = 0; i < array.length; i++) {
    if (array[i] > number) {
      resultArray.push(array[i]);
    }
  }
  return resultArray;
}

const logArray = returnIfBigger(12, [9, 2, 12, 13, 18, 10]);
const logArray2 = returnIfBigger(3, [0, 2, 200]);
//console.log(logArray)
//console.log(logArray2)

//4.
//receive number
//return array, which contains only odd numbers that are smaller than this number

//initialize empty array
//count down from this number
// if number % 2 !== 0 -> push to array
//return array

function oddNumbersOnly(number) {
  let array = [];
  for (let i = number; i >= 0; i--) {
    if (i % 2 !== 0) {
      array.push(i);
    }
  }
  return array;
}

const oddNumbers = oddNumbersOnly(19);
//console.log(oddNumbers);

//5.
//receive 2 numbers
// number1 < number2
//return an array, starting from number1 -> until number2
//if number is odd return number
// if number is even -> multiple with 2
// number1 = 3; numbr2 = 8; [3, 8, 5, 12, 7, 16]

//create epmty array
// iterate over the numbers: number1 <= number2, push number
//if number % 2 == 0 -> number *2

function returnArray(number1, number2) {
  const array = [];
  for (let i = number1; i <= number2; i++) {
    if (i % 2 == 0) {
      const multiplied = i * 2;
      array.push(multiplied);
    } else {
      array.push(i);
    }
  }
  return array;
}

const logArray3 = returnArray(3, 7);
//console.log(logArray3)

function returnArray2(number1, number2) {
  const array = [];
  for (let i = number1; i <= number2; i++) {
    const result = i % 2 == 0 ? i * 2 : i;
    array.push(result);
  }
  return array;
}

const logArray4 = returnArray2(3, 7);
//console.log(logArray4)

//6.
//receives an array of strings
// return the average length of all the strings -> if they are longer than 2 character

function getAverageIfLongerThanTwoCharacters(words) {
  const array = [];
  let sum = 0;
  for (let i = 0; i < words.length; i++) {
    if (words[i].length > 2) {
      array.push(words[i]);
      sum += words[i].length;
    }
  }
  console.log("pushed words", array);
  console.log("sum is", sum);
  const average = sum / array.length;
  return average;
}

const logArray5 = getAverageIfLongerThanTwoCharacters(["El", "Emu", "Dora"]);
console.log(logArray5);
const logArray6 = getAverageIfLongerThanTwoCharacters([
  "o",
  "five",
  "four",
  "seven",
]);
console.log(logArray6);
