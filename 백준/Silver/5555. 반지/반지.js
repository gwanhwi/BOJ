const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const keyword = input[0];
const N = +input[1];
const rings = input.slice(2);

let count = 0;

for (let ring of rings) {
  const doubled = ring + ring;
  if (doubled.includes(keyword)) {
    count++;
  }
}

console.log(count);
