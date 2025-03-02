const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const N = parseInt(input[0]);

let totalPlugs = 0;

for (let i = 1; i <= N; i++) {
    totalPlugs += parseInt(input[i]);
}

console.log(totalPlugs - (N - 1));
