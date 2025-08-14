const fs = require('fs');
let [A, B, N] = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);

let remainder = A % B;
let digit = 0;

for (let i = 0; i < N; i++) {
    remainder *= 10;
    digit = Math.floor(remainder / B);
    remainder %= B;
}

console.log(digit);
