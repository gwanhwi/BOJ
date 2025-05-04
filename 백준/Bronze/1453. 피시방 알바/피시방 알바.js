const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = parseInt(input[0]);
const seats = input[1].split(' ').map(Number);

const occupied = new Set();
let rejected = 0;

for (let seat of seats) {
    if (occupied.has(seat)) {
        rejected++;
    } else {
        occupied.add(seat);
    }
}

console.log(rejected);
