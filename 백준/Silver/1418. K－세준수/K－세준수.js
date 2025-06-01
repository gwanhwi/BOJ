const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const N = parseInt(input[0]);
const K = parseInt(input[1]);

const maxPrimeFactor = Array(N + 1).fill(0);

for (let i = 2; i <= N; i++) {
    if (maxPrimeFactor[i] === 0) {
        for (let j = i; j <= N; j += i) {
            maxPrimeFactor[j] = i;
        }
    }
}

let count = 0;
for (let i = 1; i <= N; i++) {
    if (maxPrimeFactor[i] <= K) count++;
}

console.log(count);
