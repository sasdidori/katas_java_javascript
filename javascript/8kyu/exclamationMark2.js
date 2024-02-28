function remove(string) {
  return string[string.length - 1] === "!"
    ? string.slice(0, string.length - 1)
    : string;
}
const log = remove("Hi!!");
console.log(log);
