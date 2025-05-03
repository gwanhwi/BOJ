const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let i = 0;
let scenarioNumber = 1;

while (i < input.length) {
  let [o, w] = input[i].split(' ').map(Number);
  if (o === 0 && w === 0) break;

  i++;
  let alive = true;

  while (i < input.length) {
    let [command, value] = input[i].split(' ');
    value = Number(value);

    if (command === '#' && value === 0) {
      break;
    }

    if (alive) {
      if (command === 'E') {
        w -= value;
      } else if (command === 'F') {
        w += value;
      }

      if (w <= 0) {
        alive = false;
      }
    }

    i++;
  }

  let result = '';
  if (!alive) {
    result = 'RIP';
  } else if (w > o / 2 && w < o * 2) {
    result = ':-)';
  } else {
    result = ':-(';
  }

  console.log(`${scenarioNumber} ${result}`);
  scenarioNumber++;
  i++;
}
