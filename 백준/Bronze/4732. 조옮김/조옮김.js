const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const chromaticScale = [
  "A", "A#", "B", "C", "C#", "D",
  "D#", "E", "F", "F#", "G", "G#"
];

const enharmonicMap = {
  "A": "A", "A#": "A#", "Bb": "A#",
  "B": "B", "Cb": "B", "B#": "C",
  "C": "C", "C#": "C#", "Db": "C#",
  "D": "D", "D#": "D#", "Eb": "D#",
  "E": "E", "Fb": "E", "E#": "F",
  "F": "F", "F#": "F#", "Gb": "F#",
  "G": "G", "G#": "G#", "Ab": "G#"
};

let i = 0;
while (i < input.length) {
  const line = input[i].trim();
  if (line === "***") break;

  const notes = line.split(/\s+/);
  const shift = parseInt(input[i + 1]);

  const transposed = notes.map(note => {
    const standard = enharmonicMap[note];
    const index = chromaticScale.indexOf(standard);
    const newIndex = (index + shift + 12) % 12;
    return chromaticScale[newIndex];
  });

  console.log(transposed.join(" "));
  i += 2;
}
