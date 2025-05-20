const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [N_str, kLenStr] = input[0].split(' ');
const N = Number(N_str);
const K = input[1].split(' ').map(Number).sort((a, b) => b - a);

let maxNum = 0;

function dfs(current) {
  const currentNum = Number(current);
  if (current.length > N_str.length || currentNum > N) return;

  if (currentNum <= N) {
    maxNum = Math.max(maxNum, currentNum);
  }

  for (let i = 0; i < K.length; i++) {
    dfs(current + K[i]);
  }
}

for (let i = 0; i < K.length; i++) {
  dfs(K[i].toString());
}

console.log(maxNum);
