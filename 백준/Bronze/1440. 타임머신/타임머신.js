const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on("line", function (line) {
  const [a, b, c] = line.trim().split(":");

  const isValidHour = (val) => {
    const n = Number(val);
    return n >= 1 && n <= 12;
  };

  const isValidMinSec = (val) => {
    const n = Number(val);
    return n >= 0 && n <= 59;
  };

  const perms = [
    [a, b, c],
    [a, c, b],
    [b, a, c],
    [b, c, a],
    [c, a, b],
    [c, b, a]
  ];

  let count = 0;
  for (const [h, m, s] of perms) {
    if (isValidHour(h) && isValidMinSec(m) && isValidMinSec(s)) {
      count++;
    }
  }

  console.log(count);
  rl.close();
});
