const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
let idx = 0;
const T = parseInt(input[idx++]);

for (let t = 0; t < T; t++) {
    const [m, n] = input[idx++].split(' ').map(Number);
    const grid = [];

    for (let i = 0; i < m; i++) {
        grid.push(input[idx++].split(' ').map(Number));
    }

    let totalDistance = 0;

    for (let col = 0; col < n; col++) {
        let emptySpaces = 0;

        for (let row = m - 1; row >= 0; row--) {
            if (grid[row][col] === 0) {
                emptySpaces++;
            } else if (grid[row][col] === 1) {
                totalDistance += emptySpaces;
            }
        }
    }

    console.log(totalDistance);
}
