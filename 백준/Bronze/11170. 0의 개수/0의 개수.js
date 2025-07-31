const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = Number(input[0]);

for (let i = 1; i <= T; i++) {
  const [N, M] = input[i].split(' ').map(Number);
  let count = 0;

  for (let num = N; num <= M; num++) {
    const str = num.toString();
    for (const ch of str) {
      if (ch === '0') count++;
    }
  }

  console.log(count);
}
