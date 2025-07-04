const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = +input[0];
const skills = input[1];

let count = 0;
let lCount = 0;
let sCount = 0;

for (let i = 0; i < N; i++) {
  const skill = skills[i];

  if (skill >= '1' && skill <= '9') {
    count++;
  } else if (skill === 'L') {
    lCount++;
  } else if (skill === 'S') {
    sCount++;
  } else if (skill === 'R') {
    if (lCount > 0) {
      lCount--;
      count++;
    } else {
      break;
    }
  } else if (skill === 'K') {
    if (sCount > 0) {
      sCount--;
      count++;
    } else {
      break;
    }
  }
}

console.log(count);
