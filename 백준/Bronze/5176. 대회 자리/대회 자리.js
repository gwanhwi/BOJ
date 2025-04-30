const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let index = 0;
const K = parseInt(input[index++], 10);

for (let t = 0; t < K; t++) {
    const [P, M] = input[index++].split(' ').map(Number);
    const seatSet = new Set();
    let rejected = 0;

    for (let i = 0; i < P; i++) {
        const seat = parseInt(input[index++], 10);
        if (seatSet.has(seat)) {
            rejected++;
        } else {
            seatSet.add(seat);
        }
    }

    console.log(rejected);
}
