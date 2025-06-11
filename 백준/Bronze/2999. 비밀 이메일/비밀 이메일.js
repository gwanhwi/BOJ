const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const N = input.length;
let R = 0, C = 0;

// R * C = N, R <= C, R 최대
for (let i = 1; i <= N; i++) {
  if (N % i === 0) {
    const r = i;
    const c = N / i;
    if (r <= c) {
      R = r;
      C = c;
    }
  }
}

// 암호문을 세로로 잘라서 가로로 복원
const arr = Array.from({ length: R }, () => []);
let idx = 0;
for (let c = 0; c < C; c++) {
  for (let r = 0; r < R; r++) {
    arr[r][c] = input[idx++];
  }
}

let result = '';
for (let r = 0; r < R; r++) {
  result += arr[r].join('');
}

console.log(result);
