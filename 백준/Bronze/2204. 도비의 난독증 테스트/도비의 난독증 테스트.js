const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let i = 0;
while (i < input.length) {
  const n = parseInt(input[i]);
  if (n === 0) break;

  const words = input.slice(i + 1, i + 1 + n);
  words.sort((a, b) => a.toLowerCase().localeCompare(b.toLowerCase()));

  console.log(words[0]);
  i += n + 1;
}
