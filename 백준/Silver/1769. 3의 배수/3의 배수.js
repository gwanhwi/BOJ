const fs = require('fs');
let num = fs.readFileSync('/dev/stdin').toString().trim();

let count = 0;

while (num.length > 1) {
  num = [...num].reduce((sum, digit) => sum + Number(digit), 0).toString();
  count++;
}

console.log(count);
console.log(+num % 3 === 0 ? 'YES' : 'NO');
