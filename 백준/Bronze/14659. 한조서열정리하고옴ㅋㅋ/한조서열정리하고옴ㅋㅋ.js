const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const N = +input[0];
const heights = input[1].split(' ').map(Number);

let maxKill = 0;
let count = 0;

for (let i = 0; i < N; i++) {
  count = 0;
  for (let j = i + 1; j < N; j++) {
    if (heights[j] < heights[i]) {
      count++;
    } else {
      break;
    }
  }
  maxKill = Math.max(maxKill, count);
}

console.log(maxKill);
