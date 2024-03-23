function getYears(catYears, dogYears){
    let humanYears = []
    const firstYear = 15
    const secondYear = 9
    const fromThirdYear = 4
    let catAge = 0
    let dogAge = 0
        if(catYears >= firstYear){
            catYears = catYears - firstYear
            catAge++
            if(catYears >= secondYear){
                catYears = catYears - secondYear
                catAge++
                while(catYears >= 0 && catYears >= fromThirdYear){
                    catYears = catYears - fromThirdYear
                    catAge++
            }
        }
    }
    if(dogYears >= firstYear){
        dogYears = dogYears - firstYear
        dogAge++
        if(dogYears >= secondYear){
            dogYears = dogYears - secondYear
            dogAge++
            while(dogYears >= 0 && dogYears >= fromThirdYear + 1){
                dogYears = dogYears - fromThirdYear - 1
                dogAge++
        }
    }
}
    humanYears.push(catAge, dogAge)
    return humanYears
}

const log = getYears(32, 32)
console.log(log);
