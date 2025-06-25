const fs = require('fs');
const [N, P] = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);

let current = N;
const seen = new Map();
let index = 0;

while (!seen.has(current)) {
  seen.set(current, index);
  current = (current * N) % P;
  index++;
}

const cycleStartIndex = seen.get(current);
const result = index - cycleStartIndex;

console.log(result);
