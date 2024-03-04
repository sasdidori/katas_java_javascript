function rounders(number) {
  const splitted = number.toString().split("");
  const digits = [];
  for (let i = splitted.length - 1; i > 0; i--) {
    if (splitted[i] >= 5) {
      digits.unshift(0);
      splitted[i - 1] + 1;
    } else {
      digits.unshift(0);
    }
  }
  if (splitted[1] >= 5) {
    const firstDigit = parseInt(splitted[0]);
    digits.unshift(parseInt(firstDigit + 1, 10));
  } else {
    digits.unshift(parseInt(splitted[0], 10));
  }
  return digits.join("");
}

const log = rounders(145);
console.log(log);