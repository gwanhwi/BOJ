const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [R, C] = input[0].split(' ').map(Number);
const map = input.slice(1);

const result = [0, 0, 0, 0, 0]

for (let i = 0; i < R - 1; i++) {
  for (let j = 0; j < C - 1; j++) {
    const cells = [
      map[i][j],
      map[i][j + 1],
      map[i + 1][j],
      map[i + 1][j + 1]
    ];

    if (cells.includes('#')) {
      continue;
    }

    const crushed = cells.filter(cell => cell === 'X').length;
    result[crushed]++;
  }
}

result.forEach(count => console.log(count));
