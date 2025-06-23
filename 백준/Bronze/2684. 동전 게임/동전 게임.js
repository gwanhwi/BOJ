const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const P = parseInt(input[0]);
const patterns = ['TTT', 'TTH', 'THT', 'THH', 'HTT', 'HTH', 'HHT', 'HHH'];

for (let i = 1; i <= P; i++) {
  const line = input[i];
  const count = {
    TTT: 0, TTH: 0, THT: 0, THH: 0,
    HTT: 0, HTH: 0, HHT: 0, HHH: 0,
  };

  for (let j = 0; j <= 37; j++) {
    const sub = line.substring(j, j + 3);
    if (count.hasOwnProperty(sub)) {
      count[sub]++;
    }
  }

  const result = patterns.map(p => count[p]).join(' ');
  console.log(result);
}
