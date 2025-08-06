const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = parseInt(input[0]);

for (let t = 1; t <= T; t++) {
  const [N, M] = input[t].trim().split(' ');

  let countA = 0;
  let countB = 0;

  for (let i = 0; i < N.length; i++) {
    if (N[i] === '1' && M[i] === '0') countA++;
    else if (N[i] === '0' && M[i] === '1') countB++;
  }

  console.log(Math.max(countA, countB));
}
