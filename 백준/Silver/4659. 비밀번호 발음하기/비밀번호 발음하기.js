const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const isAcceptable = (word) => {
  const vowels = ['a', 'e', 'i', 'o', 'u'];
  let hasVowel = false;
  let vowelStreak = 0;
  let consonantStreak = 0;
  let prevChar = '';

  for (let i = 0; i < word.length; i++) {
    const c = word[i];
    const isVowel = vowels.includes(c);

    if (isVowel) {
      hasVowel = true;
      vowelStreak++;
      consonantStreak = 0;
    } else {
      consonantStreak++;
      vowelStreak = 0;
    }

    if (vowelStreak === 3 || consonantStreak === 3) return false;
    if (i > 0 && c === prevChar && !(c === 'e' || c === 'o')) return false;

    prevChar = c;
  }

  return hasVowel;
};

for (const word of input) {
  if (word === 'end') break;
  const result = isAcceptable(word)
    ? `<${word}> is acceptable.`
    : `<${word}> is not acceptable.`;
  console.log(result);
}
