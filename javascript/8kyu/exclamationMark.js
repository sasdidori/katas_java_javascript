function remove(s, n) {
  const splittedString = s.split("");
  let newWord = "";
  for (let i = 0; i < splittedString.length; i++) {
    splittedString[i] === "!" && n > 0 ? n-- : (newWord += splittedString[i]);
  }
  return newWord;
}

const log2 = remove("!!Hi!!", 4);
console.log(log2);
