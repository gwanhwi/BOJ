const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = +input[0];
const logs = input.slice(1).map(line => line.split(' ').map(Number));

const position = Array(11).fill(null);
let count = 0;

for (let [cow, side] of logs) {
  if (position[cow] === null) {
    position[cow] = side;
  } else if (position[cow] !== side) {
    count++;
    position[cow] = side;
  }
}

console.log(count);
