const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);

const [D, H, W] = input;

const ratio = Math.sqrt(H * H + W * W);
const unit = D / ratio;

const height = Math.floor(unit * H);
const width = Math.floor(unit * W);

console.log(`${height} ${width}`);
