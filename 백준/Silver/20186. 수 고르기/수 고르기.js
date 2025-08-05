const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);
const N = Number(input[0]);
const K = Number(input[1]);
const A = input.slice(2).map(Number);

let dp = Array.from({ length: N + 1 }, () => Array(K + 1).fill(-Infinity));
dp[0][0] = 0;

for (let i = 0; i < N; i++) {
  for (let k = 0; k <= K; k++) {
    if (dp[i][k] === -Infinity) continue;

    if (dp[i + 1][k] < dp[i][k]) {
      dp[i + 1][k] = dp[i][k];
    }

    if (k + 1 <= K) {
      const score = A[i] - k;
      const newScore = dp[i][k] + score;
      if (dp[i + 1][k + 1] < newScore) {
        dp[i + 1][k + 1] = newScore;
      }
    }
  }
}

console.log(dp[N][K]);
