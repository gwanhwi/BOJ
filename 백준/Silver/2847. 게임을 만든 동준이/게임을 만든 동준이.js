const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);

const N = input[0];
let scores = input.slice(1);

let answer = 0;

for (let i = N - 2; i >= 0; i--) {
    if (scores[i] >= scores[i + 1]) {
        let newScore = scores[i + 1] - 1;
        answer += scores[i] - newScore;
        scores[i] = newScore;
    }
}

console.log(answer);
