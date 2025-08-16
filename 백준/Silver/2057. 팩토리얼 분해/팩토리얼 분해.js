const fs = require('fs');
const s = fs.readFileSync(0, 'utf8').trim();
let N = BigInt(s);

if (N === 0n) {
  console.log('NO');
  process.exit(0);
}

const facts = [];
let f = 1n;
facts.push(f);
for (let i = 1n; i <= 20n; i++) {
  f *= i;
  facts.push(f);
}

let used = 0;
for (let i = facts.length - 1; i >= 0; i--) {
  if (facts[i] <= N) {
    N -= facts[i];
    used++;
    if (N === 0n) break;
  }
}

console.log(N === 0n && used > 0 ? 'YES' : 'NO');
