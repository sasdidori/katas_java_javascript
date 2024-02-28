function htmlspecialchars(formData) {
  let result = "";
  for (let i = 0; i < formData.length; i++) {
    switch (formData[i]) {
      case "<":
        result = result + "&lt;";
        break;
      case ">":
        result = result + "&gt;";
        break;
      case '"':
        result = result + "&quot;";
        break;
      case "&":
        result = result + "&amp;";
        break;
      default:
        result = result + formData[i];
    }
  }
  return result;
}

const logData = htmlspecialchars("<&d");
console.log(logData);
