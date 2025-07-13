const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const N = parseInt(input);

const deque = [];

for (let num = N; num >= 1; num--) {
  deque.unshift(num);

  for (let i = 0; i < num; i++) {
    const last = deque.pop();
    deque.unshift(last);
  }
}

console.log(deque.join('\n'));
