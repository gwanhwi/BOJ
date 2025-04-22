let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');

const n = Number(input[0]);
const x = input[1].trim().split(' ').map(BigInt);

x.sort((a, b) => (a < b ? -1 : a > b ? 1 : 0));

let total = 0n;
let prefixSum = 0n;

for (let i = 0; i < n; i++) {
    const bi = BigInt(i);
    total += x[i] * bi - prefixSum;
    prefixSum += x[i];
}
total*=2n;
console.log(total.toString());
process.exit();

