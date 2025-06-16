const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = parseInt(input[0]);
const board = input.slice(1).map(line => line.split(''));

const dx = [-1, -1, -1, 0, 0, 1, 1, 1];
const dy = [-1, 0, 1, -1, 1, -1, 0, 1];

const result = Array.from({ length: N }, () => Array(N).fill(0));

for (let i = 0; i < N; i++) {
  for (let j = 0; j < N; j++) {
    if (board[i][j] !== '.') {
      result[i][j] = '*';
      continue;
    }

    let count = 0;
    for (let d = 0; d < 8; d++) {
      const ni = i + dx[d];
      const nj = j + dy[d];
      if (ni >= 0 && ni < N && nj >= 0 && nj < N) {
        const cell = board[ni][nj];
        if (cell !== '.') {
          count += parseInt(cell);
        }
      }
    }

    result[i][j] = count >= 10 ? 'M' : count.toString();
  }
}

for (let i = 0; i < N; i++) {
  console.log(result[i].join(''));
}
