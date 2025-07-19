const fs = require('fs');
const word = fs.readFileSync('/dev/stdin').toString().trim();

const len = word.length;
const frame = Array.from({ length: 5 }, () => Array(4 * len + 1).fill('.'));

for (let i = 0; i < len; i++) {
  const isWendy = (i + 1) % 3 === 0;
  const sym = isWendy ? '*' : '#';
  const pos = 4 * i + 2;

  frame[0][pos] = sym;
  frame[1][pos - 1] = sym;
  frame[1][pos + 1] = sym;
  frame[2][pos - 2] = sym;
  frame[2][pos] = word[i];
  frame[2][pos + 2] = sym;
  frame[3][pos - 1] = sym;
  frame[3][pos + 1] = sym;
  frame[4][pos] = sym;
}

for (let i = 2; i < len; i += 3) {
  const pos = 4 * i + 2;
  const sym = '*';

  frame[0][pos] = sym;
  frame[1][pos - 1] = sym;
  frame[1][pos + 1] = sym;
  frame[2][pos - 2] = sym;
  frame[2][pos + 2] = sym;
  frame[3][pos - 1] = sym;
  frame[3][pos + 1] = sym;
  frame[4][pos] = sym;
}

console.log(frame.map(row => row.join('')).join('\n'));
