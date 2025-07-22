const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [na, nb] = input[0].split(' ').map(Number);
const A = input[1].split(' ').map(Number);
const B = new Set(input[2].split(' ').map(Number));

const result = A.filter(x => !B.has(x)).sort((a, b) => a - b);

console.log(result.length);
if (result.length > 0) {
  console.log(result.join(' '));
}
