let values = {}
let numbers = [20,10,6,5,4,3,2,12]
let numbersCopy = [...numbers]
let sorted = numbersCopy.sort((a, b) => a - b)

function alphabet(sorted) { 
    values.A = sorted[0]
    sorted.shift()
    values.B = sorted[0]
    
    if(sorted[1] > sorted[0]){
        values.C = sorted[1]
        sorted.shift()
        sorted.shift()
    } else {
        values.C = sorted[2]
        sorted.shift()
        sorted.splice(1, 1)
    }
    
    getAxBAndBxC()
    getCxDAndDxA(values.C)
    getCxDAndDxA(values.A)
    console.log(sorted[0]);
    return sorted[sorted.length-1]
  }

  function multiplyValues(value1, value2){
    const multiplication = value1 * value2
    return multiplication
  }

  function getAxBAndBxC(){
    const value1 = multiplyValues(values.A, values.B)
    const index1 = sorted.indexOf(value1)
    sorted.splice(index1, 1)
    const value2 = multiplyValues(values.B, values.C)
    const index2 = sorted.indexOf(value2)
    sorted.splice(index2, 1)
    values.AxB = value1
    values.BxC = value2
  }

  function getCxDAndDxA(key){
    let value = 0 
    for(let i = 0; i < sorted.length; i++){
        if(sorted[i] % key == 0){
            value = sorted[i]
            break 
        }
    }
    values.CxD = value
    const index = sorted.indexOf(value)
    sorted.splice(index, 1)
    return value 
  }

  alphabet(sorted)
