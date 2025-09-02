const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let T = Number(input[0]);
let idx = 1;
let output = [];

for (let t = 0; t < T; t++) {
  const n = Number(input[idx++]);
  const votes = [];
  for (let i = 0; i < n; i++) {
    votes.push(Number(input[idx++]));
  }

  const total = votes.reduce((a, b) => a + b, 0);
  const maxVote = Math.max(...votes);
  const winners = votes
    .map((v, i) => (v === maxVote ? i + 1 : -1))
    .filter(v => v !== -1);

  if (winners.length > 1) {
    output.push("no winner");
  } else {
    const winner = winners[0];
    if (maxVote > total / 2) {
      output.push(`majority winner ${winner}`);
    } else {
      output.push(`minority winner ${winner}`);
    }
  }
}

console.log(output.join("\n"));
