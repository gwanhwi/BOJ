const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let caseNum = 1;

for (let i = 0; i < input.length; i += 2) {
  const original = input[i];
  const recovered = input[i + 1];

  if (original === 'END' && recovered === 'END') break;

  const sort = str => str.split('').sort().join('');
  const result = sort(original) === sort(recovered) ? 'same' : 'different';

  console.log(`Case ${caseNum}: ${result}`);
  caseNum++;
}
