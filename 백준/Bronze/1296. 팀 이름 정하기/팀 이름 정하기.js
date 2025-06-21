const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const yeondu = input[0];
const N = parseInt(input[1]);
const candidates = input.slice(2, 2 + N);

const getScore = (name) => {
  const total = yeondu + name;
  const count = { L: 0, O: 0, V: 0, E: 0 };
  for (let c of total) {
    if (count.hasOwnProperty(c)) count[c]++;
  }

  const L = count.L, O = count.O, V = count.V, E = count.E;
  return ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;
};

let bestScore = -1;
let bestTeam = '';

candidates.sort(); // 사전 순 정렬

for (let team of candidates) {
  const score = getScore(team);
  if (score > bestScore) {
    bestScore = score;
    bestTeam = team;
  }
}

console.log(bestTeam);
