const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

const N = Number(input[0]);
const words = input.slice(1);

const set = new Set(words);

for (let word of words) {
  const reversed = word.split("").reverse().join("");
  if (set.has(reversed)) {
    const length = word.length;
    const middleChar = word[Math.floor(length / 2)];
    console.log(length, middleChar);
    break;
  }
}
