const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const n = +input[0];
const testCases = input.slice(1);

for (let i = 0; i < n; i++) {
  const line = testCases[i];
  const count = Array(26).fill(0);

  for (let char of line.toLowerCase()) {
    const code = char.charCodeAt(0);
    if (code >= 97 && code <= 122) {
      count[code - 97]++;
    }
  }

  const min = Math.min(...count);

  let result;
  if (min >= 3) result = "Triple pangram!!!";
  else if (min >= 2) result = "Double pangram!!";
  else if (min >= 1) result = "Pangram!";
  else result = "Not a pangram";

  console.log(`Case ${i + 1}: ${result}`);
}
