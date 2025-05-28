const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const n = parseInt(input[0]);
const code = input[1];

const patterns = {
  A: '000000',
  B: '001111',
  C: '010011',
  D: '011100',
  E: '100110',
  F: '101001',
  G: '110101',
  H: '111010',
};

const entries = Object.entries(patterns);

function hammingDistance(a, b) {
  let count = 0;
  for (let i = 0; i < 6; i++) {
    if (a[i] !== b[i]) count++;
  }
  return count;
}

let result = '';

for (let i = 0; i < n; i++) {
  const segment = code.slice(i * 6, i * 6 + 6);
  let found = false;

  for (const [char, pattern] of entries) {
    if (hammingDistance(segment, pattern) <= 1) {
      result += char;
      found = true;
      break;
    }
  }

  if (!found) {
    console.log(i + 1);
    return;
  }
}

console.log(result);
