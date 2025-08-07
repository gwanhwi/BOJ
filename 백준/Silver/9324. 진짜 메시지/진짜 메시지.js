const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = parseInt(input[0]);
const tests = input.slice(1);

for (const M of tests) {
  const count = {};
  let i = 0;
  let isFake = false;

  while (i < M.length) {
    const ch = M[i];
    count[ch] = (count[ch] || 0) + 1;

    if (count[ch] % 3 === 0) {
      if (i + 1 >= M.length || M[i + 1] !== ch) {
        isFake = true;
        break;
      }
      i += 1;
    }

    i += 1;
  }

  console.log(isFake ? "FAKE" : "OK");
}
