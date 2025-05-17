const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();
const N = BigInt(input);

const result = (N + 1n) * (N - 1n) * N / 2n;

console.log(result.toString());
