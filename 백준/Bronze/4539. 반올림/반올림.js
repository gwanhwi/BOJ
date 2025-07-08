const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const n = +input[0];
const nums = input.slice(1).map(Number);

for (let x of nums) {
  let place = 10;
  while (x >= place) {
    x = Math.round(x / place) * place;
    place *= 10;
  }
  console.log(x);
}
