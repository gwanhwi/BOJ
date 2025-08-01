const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

const N = Number(input[0]);
const prices = input.slice(1, N + 1).map(Number);

let minPrice = prices[0];
let maxProfit = 0;

for (let i = 1; i < N; i++) {
  if (prices[i] < minPrice) {
    minPrice = prices[i];
  } else {
    maxProfit = Math.max(maxProfit, prices[i] - minPrice);
  }
}

console.log(maxProfit);
