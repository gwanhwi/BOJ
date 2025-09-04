const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);

const [N, R, C] = input;

const startParity = (R + C) % 2;

let result = [];
for (let i = 1; i <= N; i++) {
  let row = '';
  for (let j = 1; j <= N; j++) {
    if ((i + j) % 2 === startParity) {
      row += 'v';
    } else {
      row += '.';
    }
  }
  result.push(row);
}

console.log(result.join('\n'));
