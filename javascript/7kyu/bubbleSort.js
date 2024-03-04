function bubble(arr) {
    let sortedNumbers = []
    let currentNumber
    let swapped
    for(let i = 0; i < arr.length - 1; i++){
        swapped = false 
        for(let j = 0; j < arr.length - i - 1; j++){
            if(arr[j] > arr[j + 1]) {
                currentNumber = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = currentNumber
                swapped = true
                sortedNumbers.push(arr.slice(0))
            }
        }
        if(swapped == false)
        break
    }
    return sortedNumbers
}

const log = bubble([2, 5, 0, 4])
console.log(log)