const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

function gcd(a, b) {
    while (b !== 0) {
        let temp = a % b;
        a = b;
        b = temp;
    }
    return Math.abs(a);
}

const T = Number(input[0]);

for (let t = 1; t <= T; t++) {
    const nums = input[t].trim().split(' ').map(Number);
    let maxGcd = 0;
    const len = nums.length;

    for (let i = 0; i < len; i++) {
        for (let j = i + 1; j < len; j++) {
            maxGcd = Math.max(maxGcd, gcd(nums[i], nums[j]));
        }
    }

    console.log(maxGcd);
}
