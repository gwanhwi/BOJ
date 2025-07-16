const fs = require('fs');
const lines = fs.readFileSync('/dev/stdin').toString().split('\n');

let idx = 0;
const T = parseInt(lines[idx++]);

for (let tc = 0; tc < T; tc++) {
  while (idx < lines.length && lines[idx].trim() === '') idx++;
  if (idx >= lines.length) break;

  const [r, c] = lines[idx++].trim().split(' ').map(Number);
  const grid = [];
  for (let i = 0; i < r; i++) {
    grid.push(lines[idx++]);
  }

  let count = 0;

  for (let i = 0; i < r; i++) {
    for (let j = 0; j + 2 < c; j++) {
      if (grid[i][j] === '>' && grid[i][j+1] === 'o' && grid[i][j+2] === '<') {
        count++;
      }
    }
  }

  for (let i = 0; i + 2 < r; i++) {
    for (let j = 0; j < c; j++) {
      if (grid[i][j] === 'v' && grid[i+1][j] === 'o' && grid[i+2][j] === '^') {
        count++;
      }
    }
  }

  console.log(count);
}
