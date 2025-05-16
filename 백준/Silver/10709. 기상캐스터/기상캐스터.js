const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const [H, W] = input[0].split(' ').map(Number);
const sky = input.slice(1);

const result = Array.from({ length: H }, () => Array(W).fill(-1));

for (let i = 0; i < H; i++) {
    let time = -1;
    for (let j = 0; j < W; j++) {
        if (sky[i][j] === 'c') {
            time = 0;
        }
        if (time !== -1) {
            result[i][j] = time;
            time++;
        }
    }
}

const output = result.map(row => row.join(' ')).join('\n');
console.log(output);
