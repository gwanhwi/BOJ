const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

for (const line of input) {
  const nums = line.trim().split(' ').map(Number);
  const points = [];

  for (let i = 0; i < 4; i++) {
    const x = nums[i * 2];
    const y = nums[i * 2 + 1];
    points.push([x, y]);
  }

  let result = null;

  for (let i = 0; i < 4; i++) {
    for (let j = i + 1; j < 4; j++) {
      if (points[i][0] === points[j][0] && points[i][1] === points[j][1]) {
        let k = 0, l = 0;
        for (let m = 0; m < 4; m++) {
          if (m !== i && m !== j) {
            if (k === 0) {
              k = m;
            } else {
              l = m;
            }
          }
        }

        const x = points[k][0] + points[l][0] - points[i][0];
        const y = points[k][1] + points[l][1] - points[i][1];
        result = [x, y];
        break;
      }
    }
    if (result) break;
  }

  console.log(`${result[0].toFixed(3)} ${result[1].toFixed(3)}`);
}
