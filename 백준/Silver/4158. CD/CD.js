const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let idx = 0;
let result = [];

while (true) {
  let [N, M] = input[idx++].split(' ').map(Number);
  if (N === 0 && M === 0) break;

  let i = idx;
  let j = idx + N;

  let p1 = 0, p2 = 0, count = 0;

  while (p1 < N && p2 < M) {
    const a = Number(input[i + p1]);
    const b = Number(input[j + p2]);

    if (a === b) {
      count++;
      p1++;
      p2++;
    } else if (a < b) {
      p1++;
    } else {
      p2++;
    }
  }

  result.push(count);
  idx += N + M;
}

console.log(result.join('\n'));
