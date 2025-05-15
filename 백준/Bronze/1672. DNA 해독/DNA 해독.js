const fs = require('fs');
const [n, str] = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const decode = {
    A: { A: 'A', G: 'C', C: 'A', T: 'G' },
    G: { A: 'C', G: 'G', C: 'T', T: 'A' },
    C: { A: 'A', G: 'T', C: 'C', T: 'G' },
    T: { A: 'G', G: 'A', C: 'G', T: 'T' },
};

let result = str[str.length - 1];

for (let i = str.length - 2; i >= 0; i--) {
    result = decode[str[i]][result];
}

console.log(result);
