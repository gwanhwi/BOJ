const fs = require('fs');
const input = Number(fs.readFileSync('/dev/stdin').toString().trim());

const N = input;
const F = Array(N + 2).fill(0n);

F[1] = 1n;
F[2] = 1n;

for (let i = 3; i <= N + 1; i++) {
  F[i] = F[i - 1] + F[i - 2];
}

const result = 2n * (F[N] + F[N + 1]);
console.log(result.toString());
