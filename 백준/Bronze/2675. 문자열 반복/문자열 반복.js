const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

const T = parseInt(input[0], 10);

for (let i = 1; i <= T; i++) {
  const [R, S] = input[i].split(" ");
  const repeat = parseInt(R, 10);

  let result = "";
  for (let c of S) {
    result += c.repeat(repeat);
  }

  console.log(result);
}