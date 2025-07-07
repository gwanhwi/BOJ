const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [N, M] = input[0].split(' ').map(Number);
const board = input.slice(1).map(line => line.split(''));

const visited = Array.from({ length: N }, () => Array(M).fill(false));
let count = 0;

for (let i = 0; i < N; i++) {
  for (let j = 0; j < M; j++) {
    if (visited[i][j]) continue;
    visited[i][j] = true;
    count++;

    if (board[i][j] === '-') {
      let nj = j + 1;
      while (nj < M && board[i][nj] === '-' && !visited[i][nj]) {
        visited[i][nj] = true;
        nj++;
      }
    } else if (board[i][j] === '|') {
      let ni = i + 1;
      while (ni < N && board[ni][j] === '|' && !visited[ni][j]) {
        visited[ni][j] = true;
        ni++;
      }
    }
  }
}

console.log(count);
