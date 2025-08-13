const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

for (let line of input) {
    if (!line.trim()) continue;
    const [s, t] = line.split(' ');
    let i = 0, j = 0;

    while (i < s.length && j < t.length) {
        if (s[i] === t[j]) i++;
        j++;
    }

    console.log(i === s.length ? "Yes" : "No");
}
