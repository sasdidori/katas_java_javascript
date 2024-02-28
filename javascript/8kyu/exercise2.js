//exercises to practice functional programming

// 1.
//create a  function, that receives a number
// goal: return an array, that has numbers inside, that count from zero until the number i get from the the argument
//starts with zero

////////////////////////////////////////////////

//3.
//receive number & array of numbers
// return all numbers in the array only if they are bigger than number
// return empty array if numbers are smaller

function returnIfBigger(number, array) {
  return array.filter((element) => element > number);
}

const logNumbers = returnIfBigger(10, [8, 13, 31, 9, 40]);
console.log(logNumbers);

///////////////////////////////////////////////

//4.
//receive number
//return array, which contains only odd numbers that are smaller than this number

function oddNumbersOnly(array) {
  return array.filter((element) => element % 2 !== 0);
}

const logNumbers2 = oddNumbersOnly([13, 17, 18, 19, 149, 150]);
console.log(logNumbers2);

/////////////////////////////////////////////////

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

//ternary operator: instead of if

///////////////////////////////////////////////

//6.
//receives an array of strings
// return the average length of all the strings -> if they are longer than 2 character

//filter out the words -> condition: word > 2 character
//map over the array, count length
//divide it with number of words

function getAverageLength(words) {
  const filteredArray = words.filter((word) => word.length > 2);
  let sumOfAllLenghts = filteredArray
    .map((word) => word.length)
    .reduce((acc, currentValue) => acc + currentValue);
  return sumOfAllLenghts / filteredArray.length;
}

const logWords = getAverageLength(["Dora", "El", "Emu"]);
console.log(logWords);
