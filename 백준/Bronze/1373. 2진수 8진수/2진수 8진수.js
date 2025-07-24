const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const padLength = 3 - (input.length % 3);
const binary = (padLength === 3 ? '' : '0'.repeat(padLength)) + input;

let result = '';
for (let i = 0; i < binary.length; i += 3) {
  const chunk = binary.slice(i, i + 3);
  const octalDigit = parseInt(chunk, 2);
  result += octalDigit.toString();
}

console.log(result);
