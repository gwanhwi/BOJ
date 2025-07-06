const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [_, N] = input[0].split(' ').map(Number);
const bids = input.slice(1);

const priceMap = new Map();
const freqMap = new Map();

for (let i = 0; i < N; i++) {
  const [name, priceStr] = bids[i].split(' ');
  const price = +priceStr;

  if (!priceMap.has(price)) priceMap.set(price, []);
  priceMap.get(price).push({ name, index: i });

  freqMap.set(price, (freqMap.get(price) || 0) + 1);
}

let minFreq = Infinity;
for (const count of freqMap.values()) {
  if (count < minFreq) minFreq = count;
}

let minPrice = Infinity;
for (const [price, count] of freqMap.entries()) {
  if (count === minFreq && price < minPrice) {
    minPrice = price;
  }
}

const winner = priceMap.get(minPrice).sort((a, b) => a.index - b.index)[0];

console.log(`${winner.name} ${minPrice}`);
