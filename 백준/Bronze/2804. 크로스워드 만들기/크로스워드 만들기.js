const fs = require('fs');
const [A, B] = fs.readFileSync('/dev/stdin').toString().trim().split(' ');

let row = -1, col = -1;

outer: for (let i = 0; i < A.length; i++) {
    for (let j = 0; j < B.length; j++) {
        if (A[i] === B[j]) {
            col = i;
            row = j;
            break outer;
        }
    }
}

let grid = Array.from({ length: B.length }, () => Array(A.length).fill('.'));

for (let i = 0; i < A.length; i++) {
    grid[row][i] = A[i];
}

for (let j = 0; j < B.length; j++) {
    grid[j][col] = B[j];
}

console.log(grid.map(line => line.join('')).join('\n'));
