const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const [N, K] = input[0].split(' ').map(Number);

const countries = input.slice(1).map(line => {
  const [id, gold, silver, bronze] = line.split(' ').map(Number);
  return { id, gold, silver, bronze };
});

countries.sort((a, b) => {
  if (b.gold !== a.gold) return b.gold - a.gold;
  if (b.silver !== a.silver) return b.silver - a.silver;
  return b.bronze - a.bronze;
});

let rank = 1;
let sameRank = 1;
let prev = countries[0];
if (prev.id === K) {
  console.log(rank);
  return;
}

for (let i = 1; i < countries.length; i++) {
  const curr = countries[i];

  if (
    curr.gold === prev.gold &&
    curr.silver === prev.silver &&
    curr.bronze === prev.bronze
  ) {
  } else {
    rank = i + 1;
    prev = curr;
  }

  if (curr.id === K) {
    console.log(rank);
    break;
  }
}
