const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let idx = 0;
const T = parseInt(input[idx++]);

for (let t = 0; t < T; t++) {
  const k = parseInt(input[idx++]);
  const words = input.slice(idx, idx + k);
  idx += k;

  let found = false;

  for (let i = 0; i < k && !found; i++) {
    for (let j = 0; j < k && !found; j++) {
      if (i === j) continue;

      const combined = words[i] + words[j];
      const reversed = combined.split('').reverse().join('');
      if (combined === reversed) {
        console.log(combined);
        found = true;
      }
    }
  }

  if (!found) console.log(0);
}
