const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = parseInt(input[0]);

for (let t = 1; t <= T; t++) {
  const encrypted = input[t];
  const n = encrypted.length;
  const size = Math.sqrt(n);
  const grid = Array.from({ length: size }, () => Array(size));

  let idx = 0;
  for (let i = 0; i < size; i++) {
    for (let j = 0; j < size; j++) {
      grid[i][j] = encrypted[idx++];
    }
  }

  let result = '';
  for (let j = size - 1; j >= 0; j--) {
    for (let i = 0; i < size; i++) {
      result += grid[i][j];
    }
  }

  console.log(result);
}
