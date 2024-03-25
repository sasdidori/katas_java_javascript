function reverseMiddle(array){
    let numbers = []
    if(array.length % 2 == 0){
        const firstNumber = array.length/2
        numbers.push(array[firstNumber], array[firstNumber - 1])
    } else {
        const firstNumber = Math.ceil(array.length/2)
        numbers.push(array[firstNumber], array[firstNumber - 1], array[firstNumber - 2] )
    }
    console.log(numbers);
    return numbers
}

const log = reverseMiddle([1, 2, 3, 4, 5, 6, 7, 8, 9])