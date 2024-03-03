function mostFrequentItemCount(numbers) {
  if (numbers.length == 0) {
    return 0;
  }
  const sortedNumbers = numbers.sort((a, b) => a - b);
    let map = new Map();
    let frequency = 1;

    for (let i = 1; i <= sortedNumbers.length; i++) {
      if (sortedNumbers[i] == sortedNumbers[i - 1]) {
        frequency = frequency + 1;
      } else {
        map.set(sortedNumbers[i - 1], frequency);
        frequency = 1;
      }
    }
    const values = Array.from(map.values());
    const max = Math.max(...values);
    return max;
  }
const log = mostFrequentItemCount([1,6,3,3]);
console.log(log);

