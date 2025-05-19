const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = parseInt(input[0]);
const fileSizes = input[1].split(' ').map(Number);
const clusterSize = parseInt(input[2]);

let totalDiskUsage = 0;

for (let i = 0; i < N; i++) {
    const fileSize = fileSizes[i];
    const clustersNeeded = Math.ceil(fileSize / clusterSize);
    totalDiskUsage += clustersNeeded * clusterSize;
}

console.log(totalDiskUsage);
