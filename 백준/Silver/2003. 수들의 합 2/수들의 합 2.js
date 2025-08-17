const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [N, M] = input[0].split(' ').map(Number);
const arr = input[1].split(' ').map(Number);

let left = 0, right = 0, sum = arr[0], count = 0;

while (left < N && right < N) {
    if (sum === M) {
        count++;
        sum -= arr[left++];
    } else if (sum < M) {
        right++;
        if (right < N) sum += arr[right];
    } else { // sum > M
        sum -= arr[left++];
    }
}

console.log(count);
