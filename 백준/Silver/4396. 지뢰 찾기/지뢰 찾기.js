const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = Number(input[0]);
const mineMap = input.slice(1, N + 1).map(line => line.split(''));
const openMap = input.slice(N + 1, N * 2 + 1).map(line => line.split(''));

const dx = [-1, -1, -1, 0, 0, 1, 1, 1];
const dy = [-1, 0, 1, -1, 1, -1, 0, 1];

let exploded = false;

let result = Array.from({ length: N }, () => Array(N).fill('.'));

for (let i = 0; i < N; i++) {
  for (let j = 0; j < N; j++) {
    if (openMap[i][j] === 'x') {
      if (mineMap[i][j] === '*') {
        exploded = true;
      } else {
        let count = 0;
        for (let d = 0; d < 8; d++) {
          const ni = i + dx[d];
          const nj = j + dy[d];
          if (ni >= 0 && ni < N && nj >= 0 && nj < N) {
            if (mineMap[ni][nj] === '*') count++;
          }
        }
        result[i][j] = count.toString();
      }
    }
  }
}

if (exploded) {
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < N; j++) {
      if (mineMap[i][j] === '*') {
        result[i][j] = '*';
      }
    }
  }
}

console.log(result.map(row => row.join('')).join('\n'));
