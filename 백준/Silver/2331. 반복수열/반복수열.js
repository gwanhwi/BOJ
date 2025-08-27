const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split(" ");
let [A, P] = input.map(Number);

function nextNum(num, P) {
  return num
    .toString()
    .split("")
    .map(d => Math.pow(Number(d), P))
    .reduce((a, b) => a + b, 0);
}

function solve(A, P) {
  const seen = new Map();
  let num = A;
  let idx = 0;

  while (true) {
    if (seen.has(num)) {
      return seen.get(num);
    }
    seen.set(num, idx++);
    num = nextNum(num, P);
  }
}

console.log(solve(A, P));
