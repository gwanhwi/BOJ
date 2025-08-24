const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

const [N, K] = input[0].split(" ").map(Number);
let arr = input[1].split(",").map(Number);

for (let k = 0; k < K; k++) {
  const next = [];
  for (let i = 0; i < arr.length - 1; i++) {
    next.push(arr[i + 1] - arr[i]);
  }
  arr = next;
}

console.log(arr.join(","));
