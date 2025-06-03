const fs = require('fs');
const input = parseInt(fs.readFileSync('/dev/stdin').toString().trim());

let maxLength = 0;
let answer = [];

for (let second = 1; second <= input; second++) {
    const sequence = [input, second];
    let a = input;
    let b = second;

    while (true) {
        const next = a - b;
        if (next < 0) break;
        sequence.push(next);
        a = b;
        b = next;
    }

    if (sequence.length > maxLength) {
        maxLength = sequence.length;
        answer = sequence;
    }
}

console.log(maxLength);
console.log(answer.join(' '));
