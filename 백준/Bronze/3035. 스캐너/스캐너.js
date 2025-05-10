const input = require('fs').readFileSync(0, 'utf-8').split('\n');

const [R, C, ZR, ZC] = input[0].split(' ').map(Number);
const article = input.slice(1, R + 1);

for (let i = 0; i < R; i++) {
  let expandedLine = '';
  
  for (let j = 0; j < C; j++) {
    expandedLine += article[i][j].repeat(ZC);
  }

  for (let z = 0; z < ZR; z++) {
    console.log(expandedLine);
  }
}
