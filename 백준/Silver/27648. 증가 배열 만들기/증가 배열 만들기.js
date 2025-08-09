const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
const [N, M, K] = input;

if (K < N + M - 1) {
    console.log("NO");
} else {
    console.log("YES");
    let output = [];
    for (let i = 1; i <= N; i++) {
        let row = [];
        for (let j = 1; j <= M; j++) {
            row.push(i + j - 1);
        }
        output.push(row.join(' '));
    }
    console.log(output.join('\n'));
}
