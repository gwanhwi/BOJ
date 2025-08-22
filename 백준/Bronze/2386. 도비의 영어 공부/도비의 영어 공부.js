const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

for (let line of input) {
  if (line === "#") break;

  const [ch, ...sentenceArr] = line.split(" ");
  const sentence = sentenceArr.join(" ");

  const target = ch.toLowerCase();
  let count = 0;

  for (let c of sentence.toLowerCase()) {
    if (c === target) count++;
  }

  console.log(ch, count);
}
