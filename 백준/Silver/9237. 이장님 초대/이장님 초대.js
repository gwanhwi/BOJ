const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const n = Number(input[0]);
const times = input[1].split(' ').map(Number);

times.sort((a, b) => b - a);

let maxDay = 0;
for (let i = 0; i < n; i++) {
  maxDay = Math.max(maxDay, times[i] + i + 1);
}

console.log(maxDay + 1);
