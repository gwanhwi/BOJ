const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = parseInt(input[0]);

for (let i = 1; i <= T; i++) {
  const [a, b] = input[i].split(' ');

  const sortedA = a.split('').sort().join('');
  const sortedB = b.split('').sort().join('');

  const result = sortedA === sortedB ? 'are anagrams.' : 'are NOT anagrams.';
  console.log(`${a} & ${b} ${result}`);
}
