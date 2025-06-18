const fs = require('fs');
const N = parseInt(fs.readFileSync('/dev/stdin').toString().trim());

let count = 0;

for (let k = 1; k * (k - 1) < 2 * N; k++) {
  const numerator = 2 * N - k * (k - 1);
  if (numerator % (2 * k) === 0) {
    count++;
  }
}

console.log(count);
