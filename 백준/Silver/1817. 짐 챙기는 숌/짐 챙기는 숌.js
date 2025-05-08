const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [N, M] = input[0].split(' ').map(Number);

if (N === 0) {
    console.log(0);
    return;
}

const weights = input[1].split(' ').map(Number);

let boxCount = 1;
let currentBoxWeight = 0;
for (let i = 0; i < N; i++) {
    if (currentBoxWeight + weights[i] <= M) {
        currentBoxWeight += weights[i];
    } else {
        boxCount++;
        currentBoxWeight = weights[i];
    }
}

console.log(boxCount);
