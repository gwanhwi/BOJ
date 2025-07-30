const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

for (const line of input) {
  if (!line) continue;
  const [N, M] = line.split(' ').map(Number);

  let count = 0;

  for (let i = N; i <= M; i++) {
    const str = i.toString();
    const set = new Set(str);
    if (set.size === str.length) {
      count++;
    }
  }

  console.log(count);
}
