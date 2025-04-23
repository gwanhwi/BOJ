const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = parseInt(input[0]);

for (let i = 1; i <= T; i++) {
    const N = parseInt(input[i]);
    const square = N * N;
    const strN = N.toString();
    const strSquare = square.toString();

    if (strSquare.endsWith(strN)) {
        console.log("YES");
    } else {
        console.log("NO");
    }
}
