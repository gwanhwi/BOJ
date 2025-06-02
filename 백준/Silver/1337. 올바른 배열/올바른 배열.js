const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const N = Number(input[0]);
const arr = input.slice(1).map(Number).sort((a, b) => a - b);

let maxCount = 0;

for (let i = 0; i < N; i++) {
  let count = 1;
  let current = arr[i];
  for (let j = i + 1; j < N; j++) {
    if (arr[j] <= current + 4) {
      count++;
    } else {
      break;
    }
  }
  if (count > maxCount) {
    maxCount = count;
  }
}

console.log(5 - maxCount);
