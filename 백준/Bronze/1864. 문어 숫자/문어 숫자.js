const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const symbolMap = {
  '-': 0,
  '\\': 1,
  '(': 2,
  '@': 3,
  '?': 4,
  '>': 5,
  '&': 6,
  '%': 7,
  '/': -1
};
for (const line of input) {
  if (line === '#') break;

  let result = 0;
  const len = line.length;
  
  for (let i = 0; i < len; i++) {
    const char = line[i];
    const digit = symbolMap[char];
    result += digit * Math.pow(8, len - 1 - i);
  }

  console.log(result);
}
