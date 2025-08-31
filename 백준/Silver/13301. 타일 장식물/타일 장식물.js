const fs = require('fs');
const input = Number(fs.readFileSync('/dev/stdin').toString().trim());

const N = input;
const F = Array(N + 2).fill(0);

F[1] = 1;
F[2] = 1;

for (let i = 3; i <= N + 1; i++) {
  F[i] = F[i - 1] + F[i - 2];
}

const result = 2 * (F[N] + F[N + 1]);
console.log(result);
