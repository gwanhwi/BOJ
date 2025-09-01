const fs = require('fs');
const N = Number(fs.readFileSync('/dev/stdin').toString().trim());

let count = 0;

for (let a = 1; a <= N; a++) {
  for (let b = a; b <= N; b++) {
    const c = N - a - b;
    if (c < b) continue;
    if (c < 1) continue;
    if (a + b > c) count++;
  }
}

console.log(count);
