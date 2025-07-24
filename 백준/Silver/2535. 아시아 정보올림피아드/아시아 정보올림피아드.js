const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = Number(input[0]);

const students = input.slice(1).map(line => {
  const [country, student, score] = line.trim().split(' ').map(Number);
  return { country, student, score };
});

students.sort((a, b) => b.score - a.score);

const medalCount = {};
const result = [];

for (let i = 0; i < students.length && result.length < 3; i++) {
  const { country, student } = students[i];

  if (medalCount[country] === 2) continue;

  medalCount[country] = (medalCount[country] || 0) + 1;

  result.push(`${country} ${student}`);
}

console.log(result.join('\n'));
