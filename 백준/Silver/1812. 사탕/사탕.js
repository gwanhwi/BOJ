const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = parseInt(input[0]);
const sums = input.slice(1).map(Number);

let a = Array(N).fill(0);

// a[0] 계산
let temp = 0;
for (let i = 0; i < N; i++) {
  temp += (i % 2 === 0 ? 1 : -1) * sums[i];
}
a[0] = temp / 2;

// 나머지 a[i] 계산
for (let i = 1; i < N; i++) {
  a[i] = sums[i - 1] - a[i - 1];
}

console.log(a.join('\n'));
