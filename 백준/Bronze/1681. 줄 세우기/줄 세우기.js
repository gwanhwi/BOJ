const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');

const N = parseInt(input[0], 10);
const L = input[1];

let count = 0;
let num = 0;

while (count < N) {
    num++;
    if (!num.toString().includes(L)) {
        count++;
    }
}

console.log(num);
