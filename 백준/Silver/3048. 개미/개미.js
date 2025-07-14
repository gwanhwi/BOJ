const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [N1, N2] = input[0].split(' ').map(Number);
const group1 = input[1].trim().split('').reverse().map(c => [c, 1]);
const group2 = input[2].trim().split('').map(c => [c, 2]);
const T = Number(input[3]);

let ants = [...group1, ...group2];

for (let time = 0; time < T; time++) {
    let i = 0;
    while (i < ants.length - 1) {
        if (ants[i][1] === 1 && ants[i + 1][1] === 2) {
            [ants[i], ants[i + 1]] = [ants[i + 1], ants[i]];
            i += 2;
        } else {
            i += 1;
        }
    }
}

console.log(ants.map(a => a[0]).join(''));
