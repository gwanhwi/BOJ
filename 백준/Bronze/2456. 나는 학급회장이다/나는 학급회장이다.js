const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = +input[0];
const votes = input.slice(1).map(line => line.split(' ').map(Number));

const scores = [0, 0, 0];
const count3 = [0, 0, 0];
const count2 = [0, 0, 0];

for (let vote of votes) {
  for (let i = 0; i < 3; i++) {
    const point = vote[i];
    scores[i] += point;
    if (point === 3) count3[i]++;
    if (point === 2) count2[i]++;
  }
}

let maxScore = Math.max(...scores);
let candidates = [];

for (let i = 0; i < 3; i++) {
  if (scores[i] === maxScore) candidates.push(i);
}

if (candidates.length === 1) {
  console.log(candidates[0] + 1, maxScore);
} else {
  let best = candidates[0];
  let tie = false;

  for (let i = 1; i < candidates.length; i++) {
    const cur = candidates[i];
    if (count3[cur] > count3[best]) {
      best = cur;
      tie = false;
    } else if (count3[cur] === count3[best]) {
      if (count2[cur] > count2[best]) {
        best = cur;
        tie = false;
      } else if (count2[cur] === count2[best]) {
        tie = true;
      }
    }
  }

  if (tie) {
    console.log(0, maxScore);
  } else {
    console.log(best + 1, maxScore);
  }
}
