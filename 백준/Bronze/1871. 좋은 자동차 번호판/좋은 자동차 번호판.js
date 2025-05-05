const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split('\n');
const N = parseInt(input[0]);

for (let i = 1; i <= N; i++) {
  const [letters, numbers] = input[i].split('-');
  const numPart = parseInt(numbers);

  const letterValue =
    (letters.charCodeAt(0) - 65) * 26 * 26 +
    (letters.charCodeAt(1) - 65) * 26 +
    (letters.charCodeAt(2) - 65);

  const diff = Math.abs(letterValue - numPart);
  console.log(diff <= 100 ? 'nice' : 'not nice');
}
