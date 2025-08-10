const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const layout = "`1234567890-=" +
               " QWERTYUIOP[]\\" +
               " ASDFGHJKL;'" +
               " ZXCVBNM,./";

let map = {};
for (let i = 1; i < layout.length; i++) {
    map[layout[i]] = layout[i - 1];
}

for (let line of input) {
    let result = '';
    for (let ch of line) {
        if (ch === ' ') {
            result += ' ';
        } else {
            result += map[ch] || '';
        }
    }
    console.log(result);
}
