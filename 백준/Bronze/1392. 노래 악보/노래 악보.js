const fs = require('fs');

const input = fs.readFileSync(0, 'utf-8').split('\n');

const [N, Q] = input[0].split(' ').map(Number);

const B = [];
for (let i = 1; i <= N; i++) {
    B.push(Number(input[i]));
}

const queries = [];
for (let i = N + 1; i < N + 1 + Q; i++) {
    queries.push(Number(input[i]));
}

let endTime = [];
let currentTime = 0;

for (let i = 0; i < N; i++) {
    currentTime += B[i];
    endTime.push(currentTime);
}

let result = [];
for (let t of queries) {
    for (let i = 0; i < N; i++) {
        if (t < endTime[i]) {
            result.push(i + 1);
            break;
        }
    }
}
fs.writeFileSync(1, result.join('\n') + '\n');
