const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const [n, m] = input.split(':').map(Number);

function gcd(a, b) {
  while (b !== 0) {
    const temp = b;
    b = a % b;
    a = temp;
  }
  return a;
}

const divisor = gcd(n, m);
console.log(`${n / divisor}:${m / divisor}`);
