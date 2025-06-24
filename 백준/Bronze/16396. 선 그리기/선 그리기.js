const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = +input[0];
const segments = input.slice(1, N + 1).map(line => {
  const [x, y] = line.split(' ').map(Number);
  return [Math.min(x, y), Math.max(x, y)];
});

segments.sort((a, b) => a[0] - b[0]);

let total = 0;
let [curStart, curEnd] = segments[0];

for (let i = 1; i < N; i++) {
  const [nextStart, nextEnd] = segments[i];

  if (nextStart <= curEnd) {
    curEnd = Math.max(curEnd, nextEnd);
  } else {
    total += curEnd - curStart;
    curStart = nextStart;
    curEnd = nextEnd;
  }
}
total += curEnd - curStart;

console.log(total);
