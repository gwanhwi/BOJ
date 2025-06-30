const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = +input[0];
let maxPerson = 0;
let maxLastDigit = -1;

for (let i = 1; i <= N; i++) {
  const cards = input[i].split(' ').map(Number);
  let maxDigit = -1;

  for (let a = 0; a < 3; a++) {
    for (let b = a + 1; b < 4; b++) {
      for (let c = b + 1; c < 5; c++) {
        const sum = cards[a] + cards[b] + cards[c];
        const digit = sum % 10;
        if (digit >= maxDigit) {
          maxDigit = digit;
        }
      }
    }
  }
    
  if (maxDigit >= maxLastDigit) {
    maxLastDigit = maxDigit;
    maxPerson = i;
  }
}

console.log(maxPerson);
