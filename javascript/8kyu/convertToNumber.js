//1. Number
function convertUsingNumber(string) {
  const converted = Number(string);
  return converted;
}
const numberOne = convertUsingNumber("23");
console.log(numberOne);

//2. parseInt
function convertUsingParseInt(string, base = 10) {
  const converted = parseInt(string, base);
  return converted;
}

const numberTwo = convertUsingParseInt("15");
console.log(numberTwo);
//3. parseFloat
function convertUsingParseFloat(string) {
  const converted = parseFloat(string);
  console.log(converted);
  return converted;
}
const numberThree = convertUsingParseFloat("12.3");
console.log(numberThree);

//4. unary plus operator
function convertUsingUnaryPlusOperator(string) {
  const converted = +string;
  return converted;
}
const numberFour = convertUsingUnaryPlusOperator("113");
console.log(numberFour);

// 5. multiply by 1
function convertUsingMultiplicationByOne(string) {
  const converted = string * 1;
  return converted;
}
const numberFive = convertUsingMultiplicationByOne("234561");
console.log(numberFive);

// 6. bitwise NOT operator
function convertUsingBitwiseNotOperator(string) {
  const converted = ~~string;
  return converted;
}
const numberSix = convertUsingBitwiseNotOperator("19");
console.log(numberSix);
