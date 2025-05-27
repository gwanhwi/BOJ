const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [N, M] = input[0].split(' ').map(Number);
let index = 1;

const stacks = [];

for (let i = 0; i < M; i++) {
    const k = parseInt(input[index]);
    const books = input[index + 1].split(' ').map(Number);
    stacks.push(books);
    index += 2;
}

let possible = true;

for (let i = 0; i < stacks.length; i++) {
    const stack = stacks[i];
    for (let j = 0; j < stack.length - 1; j++) {
        if (stack[j] < stack[j + 1]) {
            possible = false;
            break;
        }
    }
    if (!possible) break;
}

console.log(possible ? 'Yes' : 'No');
