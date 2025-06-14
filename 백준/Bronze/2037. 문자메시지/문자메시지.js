const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [p, w] = input[0].split(' ').map(Number);
const message = input[1];

const keypad = {
  '1': [' '],
  '2': ['A', 'B', 'C'],
  '3': ['D', 'E', 'F'],
  '4': ['G', 'H', 'I'],
  '5': ['J', 'K', 'L'],
  '6': ['M', 'N', 'O'],
  '7': ['P', 'Q', 'R', 'S'],
  '8': ['T', 'U', 'V'],
  '9': ['W', 'X', 'Y', 'Z']
};

const charToButton = {};
for (let key in keypad) {
  keypad[key].forEach((char, idx) => {
    charToButton[char] = { button: key, count: idx + 1 };
  });
}

let total = 0;
let prevButton = '';

for (let i = 0; i < message.length; i++) {
  const c = message[i];
  const { button, count } = charToButton[c];
  if (button === prevButton && c !== ' ') {
    total += w;
  }
  total += p * count;
  prevButton = button;
}

console.log(total);
