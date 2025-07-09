const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const n = +input[0];

function gcd(a, b) {
  if (b === 0) return a;
  return gcd(b, a % b);
}

for (let i = 1; i <= n; i++) {
  const [a, b] = input[i].trim().split(/\s+/).map(Number);
  const lcm = (a * b) / gcd(a, b);
  console.log(lcm);
}
