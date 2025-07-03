const fs = require('fs');
const N = +fs.readFileSync('/dev/stdin').toString().trim();

const dp = Array(N + 1).fill(false);

dp[1] = true;
if (N >= 2) dp[2] = false;
if (N >= 3) dp[3] = true;

for (let i = 4; i <= N; i++) {
  dp[i] = !dp[i - 1] || !dp[i - 3];
}

console.log(dp[N] ? 'SK' : 'CY');
