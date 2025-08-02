const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();
const N = BigInt(input);

if (N === 0n) {
  console.log(0);
} else {
  let cat = 1n;
  let actions = 1;
  while (cat < N) {
    cat *= 2n;
    actions++;
  }
  console.log(actions);
}
