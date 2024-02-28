//iterate over the array of strings
//initialize a variable for the boolean and set its value to false
//if the first element is flick, then value will be false
//if there's more flicks after each other, then the boolean should switch

function flickSwitch(array) {
  let result = [];
  let toggle = true;

  for (let i = 0; i < array.length; i++) {
    if (array.length < 0) {
      return [];
    } else if (array[i].includes("flick")) {
      toggle = !toggle;
    }
    result.push(toggle);
  }
  console.log("this is the result", result);
  return result;
}
let array = [];

flickSwitch(array);
