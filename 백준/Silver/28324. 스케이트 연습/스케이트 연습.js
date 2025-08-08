const fs = require('fs');
const data = fs.readFileSync('/dev/stdin', 'utf8').trim().split(/\s+/);

let idx = 0;
const N = parseInt(data[idx++], 10);
const V = [];
for (let i = 0; i < N; i++) {
  V.push(parseInt(data[idx++], 10));
}

let cur = 0;
let total = 0;

for (let i = N - 1; i >= 0; i--) {
  if (cur + 1 <= V[i]) {
    cur = cur + 1;
  } else {
    cur = V[i];
  }
  total += cur;
}

console.log(total);
