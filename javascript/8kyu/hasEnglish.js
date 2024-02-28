function spEng(string) {
  const lowerCaseString = string.toLowerCase();
  return lowerCaseString.includes("english") ? true : false;
}

const log = spEng("nonparlEnglishe");
console.log(log);
