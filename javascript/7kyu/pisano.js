
  function pisano(n){
    let pisano = "01"
    let currentNumber = 1;
    while(pisano.indexOf("01", 1) == -1){
      let number = (pisano[currentNumber] + pisano[currentNumber - 1]) % n
      console.log("number is: ", number);
      pisano += number
      currentNumber++
      console.log("building a pisano period :", pisano);
    }
    const result = pisano.indexOf("01", 1)
    return result
  }

  const log = pisano(2)
  console.log(log)

  



  //before generating the new number, parseint it and then convert it back to string again
  //parsing the string "01" will be 1
