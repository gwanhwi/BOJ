const fs = require('fs');
const input = fs.readFileSync('/dev/stdin', 'utf8').split('\n');
const str = input[1];
let sum = 0;
let num = '';

for (let i = 0; i < str.length; i++) {
  const ch = str[i];
  if (ch >= '0' && ch <= '9') {
    num += ch;
    if (num.length > 6) num = num.slice(-6);
  } else {
    if (num) {
      sum += parseInt(num);
      num = '';
    }
  }
}

if (num) sum += parseInt(num);
console.log(sum);
