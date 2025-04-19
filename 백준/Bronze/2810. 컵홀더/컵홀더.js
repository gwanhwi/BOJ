const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let input = [];

rl.on('line', function (line) {
  input.push(line.trim());
}).on('close', function () {
  const n = parseInt(input[0]);
  const seats = input[1];
  let count = 1;
  for (let i = 0; i < seats.length; i++) {
    if (seats[i] === 'S') {
      count += 1;
    } else if (seats[i] === 'L') {
      count += 1;
      i++; 
    }
  }

  // 실제 컵을 놓을 수 있는 사람 수는 컵홀더 수 또는 사람 수 중 작은 값
  console.log(Math.min(count, n));
});
