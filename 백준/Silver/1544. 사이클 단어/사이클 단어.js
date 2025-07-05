const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = +input[0];
const words = input.slice(1);

const set = new Set();

for (const word of words) {
  let minForm = word;
  for (let i = 1; i < word.length; i++) {
    const rotated = word.slice(i) + word.slice(0, i);
    if (rotated < minForm) minForm = rotated;
  }
  set.add(minForm);
}

console.log(set.size);
