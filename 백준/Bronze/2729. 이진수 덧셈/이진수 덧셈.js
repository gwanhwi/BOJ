const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const T = parseInt(input[0]);

for (let i = 1; i <= T; i++) {
    let [a, b] = input[i].split(' ');
    let result = '';
    let carry = 0;
    let maxLength = Math.max(a.length, b.length);
    a = a.padStart(maxLength, '0');
    b = b.padStart(maxLength, '0');
    for (let j = maxLength - 1; j >= 0; j--) {
        let sum = parseInt(a[j]) + parseInt(b[j]) + carry;
        result = (sum % 2) + result;
        carry = Math.floor(sum / 2);
    }
    if (carry) result = '1' + result;
    console.log(result.replace(/^0+/, '') || '0');
}
