const fs = require('fs');
const [H, Y] = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);

const dp = Array(Y + 1).fill(0);
dp[0] = H;

for (let i = 1; i <= Y; i++) {
  dp[i] = Math.max(dp[i], Math.floor(dp[i - 1] * 1.05));
  if (i >= 3) {
    dp[i] = Math.max(dp[i], Math.floor(dp[i - 3] * 1.2));
  }
  if (i >= 5) {
    dp[i] = Math.max(dp[i], Math.floor(dp[i - 5] * 1.35));
  }
}

console.log(dp[Y]);