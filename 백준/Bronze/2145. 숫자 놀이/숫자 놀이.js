const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

function getSingleDigitSum(num) {
  while (num >= 10) {
    num = num.toString().split('').reduce((sum, digit) => sum + Number(digit), 0);
  }
  return num;
}

for (let i = 0; i < input.length; i++) {
  const n = Number(input[i]);
  if (n === 0) break;
  console.log(getSingleDigitSum(n));
}
