const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const P = parseInt(input[0]);
for (let i = 1; i <= P; i++) {
  const [T, ...heights] = input[i].split(' ').map(Number);
  let line = [];
  let moves = 0;

  for (let h of heights) {
    let j = 0;
    while (j < line.length && line[j] < h) j++;
    line.splice(j, 0, h);
    moves += line.length - j - 1;
  }

  console.log(`${T} ${moves}`);
}
