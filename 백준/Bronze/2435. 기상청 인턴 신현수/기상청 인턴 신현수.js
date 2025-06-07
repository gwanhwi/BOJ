const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [N, K] = input[0].split(' ').map(Number);
const temps = input[1].split(' ').map(Number);

let sum = 0;
for (let i = 0; i < K; i++) sum += temps[i];

let max = sum;

for (let i = K; i < N; i++) {
  sum = sum - temps[i - K] + temps[i];
  if (sum > max) max = sum;
}

console.log(max);
