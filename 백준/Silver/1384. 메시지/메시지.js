const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let idx = 0;
let groupNum = 1;

while (input[idx] !== '0') {
  const n = +input[idx++];
  const papers = [];
  for (let i = 0; i < n; i++) {
    const [name, ...messages] = input[idx++].trim().split(' ');
    papers.push({ name, messages });
  }

  const result = [];

  for (let i = 0; i < n; i++) {
    const { messages } = papers[i];
    for (let j = 0; j < messages.length; j++) {
      if (messages[j] === 'N') {
        const senderIndex = (i - 1 - j + n) % n;
        const sender = papers[senderIndex].name;
        const receiver = papers[i].name;
        result.push(`${sender} was nasty about ${receiver}`);
      }
    }
  }

  console.log(`Group ${groupNum}`);
  if (result.length === 0) {
    console.log("Nobody was nasty");
  } else {
    for (const line of result) {
      console.log(line);
    }
  }
  console.log();
  groupNum++;
}
