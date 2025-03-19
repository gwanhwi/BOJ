const input = require('fs').readFileSync('/dev/stdin').toString().split(' ').map(Number);
const [A, B, C, D] = input;

const sides = [A, B, C, D];
sides.sort((a, b) => a - b);

console.log(sides[0] * sides[2]);
