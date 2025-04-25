const fs = require('fs');

// 입력 처리
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
const [a, b, c] = input;

if (a + b === c) {
    console.log(`${a}+${b}=${c}`);
} else if (a - b === c) {
    console.log(`${a}-${b}=${c}`);
} else if (a * b === c) {
    console.log(`${a}*${b}=${c}`);
} else if (a / b === c) {
    console.log(`${a}/${b}=${c}`);
} else if (b + c === a) {
    console.log(`${a}=${b}+${c}`);
} else if (b - c === a) {
    console.log(`${a}=${b}-${c}`);
} else if (b * c === a) {
    console.log(`${a}=${b}*${c}`);
} else if (b / c === a) {
    console.log(`${a}=${b}/${c}`);
}
