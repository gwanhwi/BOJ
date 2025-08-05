const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [N, K] = input[0].split(' ').map(Number);
const arr = input[1].split(' ').map(Number);

let indexed = arr.map((value, idx) => [value, idx]);
indexed.sort((a, b) => (b[0] + b[1]) - (a[0] + a[1]));

let selected = indexed.slice(0, K);

selected.sort((a, b) => a[1] - b[1]);

let totalScore = 0;
for (let i = 0; i < K; i++) {
  const [value, idx] = selected[i];
  totalScore += value - i;
}

console.log(totalScore);
