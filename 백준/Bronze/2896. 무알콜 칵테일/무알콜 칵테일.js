const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [A, B, C] = input[0].split(' ').map(Number);
const [I, J, K] = input[1].split(' ').map(Number);

const minRatio = Math.min(A / I, B / J, C / K);

const leftA = A - I * minRatio;
const leftB = B - J * minRatio;
const leftC = C - K * minRatio;

console.log(`${leftA.toFixed(10)} ${leftB.toFixed(10)} ${leftC.toFixed(10)}`);
