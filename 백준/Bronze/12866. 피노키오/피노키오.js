const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const MOD = BigInt(1000000007);
let input = [];

rl.on('line', function (line) {
  input.push(line.trim());
}).on('close', function () {
  const L = parseInt(input[0]);
  const S = input[1];

  const count = { A: 0n, C: 0n, G: 0n, T: 0n };

  for (let char of S) {
    count[char]++;
  }

  let result = (count.A * count.C) % MOD;
  result = (result * count.G) % MOD;
  result = (result * count.T) % MOD;

  console.log(result.toString());
});
