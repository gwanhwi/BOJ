const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

input.forEach(line => {
  const play = line.split(' ').map(Number);
  const countZero = play.filter(x => x === 0).length;
  
  let result;
  switch (countZero) {
    case 1:
      result = 'A';
      break;
    case 2:
      result = 'B';
      break;
    case 3:
      result = 'C';
      break;
    case 4:
      result = 'D';
      break;
    case 0:
      result = 'E';
      break;
  }
  console.log(result);
});
