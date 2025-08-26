const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

const N = Number(input[0]);
const A = input[1].split(" ").map(Number);

let arr = A.map((val, idx) => [val, idx]);

arr.sort((a, b) => {
  if (a[0] === b[0]) return a[1] - b[1];
  return a[0] - b[0];
});

let P = new Array(N);

for (let i = 0; i < N; i++) {
  P[arr[i][1]] = i;
}

console.log(P.join(" "));
