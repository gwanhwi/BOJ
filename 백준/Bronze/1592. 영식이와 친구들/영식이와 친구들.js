const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);

const [N, M, L] = input;

const counts = new Array(N).fill(0);
let current = 0;
let throws = 0;

counts[current] = 1;

while (counts[current] < M) {
    throws++;
    if (counts[current] % 2 === 1) {
        current = (current + L) % N;
    } else {
        current = (current - L + N) % N;
    }
    counts[current]++;
}

console.log(throws);
