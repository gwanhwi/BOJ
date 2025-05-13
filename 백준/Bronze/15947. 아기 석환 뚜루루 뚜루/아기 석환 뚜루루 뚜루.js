const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

const N = parseInt(input);

const baseLyrics = [
  "baby", "sukhwan", "tururu", "turu",
  "very", "cute", "tururu", "turu",
  "in", "bed", "tururu", "turu",
  "baby", "sukhwan"
];

const cycleLength = 14;

const cycleIndex = Math.floor((N - 1) / cycleLength);
const wordIndex = (N - 1) % cycleLength;

let word = baseLyrics[wordIndex];

if (word === "tururu") {
    const ruCount = 2 + cycleIndex;
    word = ruCount >= 5 ? `tu+ru*${ruCount}` : "tu" + "ru".repeat(ruCount);
} else if (word === "turu") {
    const ruCount = 1 + cycleIndex;
    word = ruCount >= 5 ? `tu+ru*${ruCount}` : "tu" + "ru".repeat(ruCount);
}

console.log(word);
