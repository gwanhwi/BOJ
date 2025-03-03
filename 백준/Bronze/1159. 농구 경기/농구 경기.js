const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');
const N = parseInt(input[0]);
let names = input.slice(1, N + 1);
let firstLetterCount = {};

for (let name of names) {
    let firstLetter = name[0];
    if (firstLetterCount[firstLetter]) {
        firstLetterCount[firstLetter]++;
    } else {
        firstLetterCount[firstLetter] = 1;
    }
}

let result = [];

for (let letter in firstLetterCount) {
    if (firstLetterCount[letter] >= 5) {
        result.push(letter);
    }
}

if (result.length === 0) {
    console.log("PREDAJA");
} else {
    console.log(result.sort().join(''));
}