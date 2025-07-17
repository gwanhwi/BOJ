const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = parseInt(input[0]);

for (let i = 1; i <= T; i++) {
  const arr = input[i].trim().split(' ').map(Number);
  arr.sort((a, b) => b - a);
  console.log(arr[2]);
}
