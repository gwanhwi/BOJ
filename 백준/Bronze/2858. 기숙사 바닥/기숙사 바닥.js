const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim();
const [R, B] = input.split(' ').map(Number);

function solve(R, B) {
  const total = R + B;

  for (let height = 3; height <= Math.sqrt(total); height++) {
    if (total % height !== 0) continue;
    const width = total / height;

    const border = 2 * height + 2 * width - 4;

    if (border === R) {
      const L = Math.max(height, width);
      const W = Math.min(height, width);
      console.log(`${L} ${W}`);
      return;
    }
  }
}

solve(R, B);
