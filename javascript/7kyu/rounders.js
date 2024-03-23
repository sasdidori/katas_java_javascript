function rounders(number){
  const digits = []
  const numberArray = number.toString().split("").map(Number)
  let carry = 0
  for(let i = numberArray.length - 1; i > 0; i--) {
    const number = numberArray[i] + carry
    carry = number >= 5 ? 1 : 0 
    digits.unshift(0)
  }
  digits.unshift(numberArray[0] + carry)
  const result = Number(digits.join(''))
  return result
}
const log = rounders(1438)
console.log(log)