const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = parseInt(input[0], 10);
let result = [];

for (let i = 1; i <= T; i++) {
    const words = input[i].split(' ');
    const reversedWords = words.map(word => word.split('').reverse().join(''));
    result.push(reversedWords.join(' '));
}

console.log(result.join('\n'));
