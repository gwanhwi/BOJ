const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const T = parseInt(input[0]);
const cases = input.slice(1).map(Number);

function kaprekarSteps(num) {
  let steps = 0;

  while (num !== 6174) {
    const digits = num.toString().padStart(4, '0').split('').map(Number);
    const desc = parseInt([...digits].sort((a, b) => b - a).join(''));
    const asc = parseInt([...digits].sort((a, b) => a - b).join(''));
    num = desc - asc;
    steps++;
  }

  return steps;
}

for (let i = 0; i < T; i++) {
  console.log(kaprekarSteps(cases[i]));
}
