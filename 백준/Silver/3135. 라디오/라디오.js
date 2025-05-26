const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [A, B] = input[0].split(' ').map(Number);
const N = Number(input[1]);
const favorites = input.slice(2, 2 + N).map(Number);

let minPress = Math.abs(B - A);

for (let i = 0; i < N; i++) {
  const favFreq = favorites[i];
  const pressCount = 1 + Math.abs(B - favFreq);
  if (pressCount < minPress) {
    minPress = pressCount;
  }
}

console.log(minPress);
