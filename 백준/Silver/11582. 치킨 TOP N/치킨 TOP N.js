const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = Number(input[0]);
const arr = input[1].split(' ').map(Number);
const K = Number(input[2]);

const groupSize = N / K;
let result = [];

for (let i = 0; i < N; i += groupSize) {
  const segment = arr.slice(i, i + groupSize).sort((a, b) => a - b);
  result.push(...segment);
}

console.log(result.join(' '));
