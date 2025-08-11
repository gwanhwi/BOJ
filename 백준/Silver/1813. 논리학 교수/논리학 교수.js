const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = Number(input[0]);
const arr = input[1].split(' ').map(Number);

let answer = -1;

for (let t = 0; t <= N; t++) {
    let count = arr.filter(x => x === t).length;
    if (count === t) {
        answer = Math.max(answer, t);
    }
}

console.log(answer);
