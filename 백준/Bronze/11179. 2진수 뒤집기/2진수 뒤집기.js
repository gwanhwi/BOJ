const fs = require('fs');
const N = +fs.readFileSync('/dev/stdin').toString().trim();

const binary = N.toString(2);
const reversed = binary.split('').reverse().join('');
const result = parseInt(reversed, 2);

console.log(result);
