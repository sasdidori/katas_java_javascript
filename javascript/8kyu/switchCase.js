function getDrinkByProfession(param) {
  const lowerCaseString = param.toLowerCase();
  switch (lowerCaseString) {
    case "jabroni":
      return "Patron Tequila";
    case "school counselor":
      return "Anything with Alcohol";
    case "programmer":
      return "Hipster Craft Beer";
    case "bike gang member":
      return "Moonshine";
    case "politician":
      return "Your tax dollars";
    case "rapper":
      return "Cristal";
    default:
      return "Beer";
  }
}

const log = getDrinkByProfession("Something else");
console.log(log);
