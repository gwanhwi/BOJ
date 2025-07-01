const fs = require('fs');
const K = +fs.readFileSync('/dev/stdin').toString().trim();

const fib = [0, 1];

for (let i = 2; i <= K; i++) {
  fib[i] = fib[i - 1] + fib[i - 2];
}

console.log(`${fib[K - 1]} ${fib[K]}`);
