const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const n = +input[0];
const queue = [];

let maxLen = 0;
let lastStudent = -1;

for (let i = 1; i <= n; i++) {
  const line = input[i];
  const [type, num] = line.split(' ');

  if (type === '1') {
    const student = +num;
    queue.push(student);

    if (queue.length > maxLen) {
      maxLen = queue.length;
      lastStudent = student;
    } else if (queue.length === maxLen) {
      lastStudent = Math.min(lastStudent, student);
    }
  } else if (type === '2') {
    queue.shift();
  }
}

console.log(`${maxLen} ${lastStudent}`);
