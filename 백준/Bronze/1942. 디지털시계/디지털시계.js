const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

function timeToSeconds(hms) {
  const [hh, mm, ss] = hms.split(':').map(Number);
  return hh * 3600 + mm * 60 + ss;
}

function secondsToClockInt(sec) {
  const hh = String(Math.floor(sec / 3600)).padStart(2, '0');
  sec %= 3600;
  const mm = String(Math.floor(sec / 60)).padStart(2, '0');
  const ss = String(sec % 60).padStart(2, '0');
  return Number(hh + mm + ss);
}

function countDivisibleBy3(startTime, endTime) {
  const startSec = timeToSeconds(startTime);
  const endSec = timeToSeconds(endTime);
  const result = [];

  const total = [];
  if (startSec <= endSec) {
    for (let t = startSec; t <= endSec; t++) {
      const clockInt = secondsToClockInt(t);
      if (clockInt % 3 === 0) total.push(clockInt);
    }
  } else {
    for (let t = startSec; t < 86400; t++) {
      const clockInt = secondsToClockInt(t);
      if (clockInt % 3 === 0) total.push(clockInt);
    }
    for (let t = 0; t <= endSec; t++) {
      const clockInt = secondsToClockInt(t);
      if (clockInt % 3 === 0) total.push(clockInt);
    }
  }

  return total.length;
}

for (let i = 0; i < 3; i++) {
  const [start, end] = input[i].split(' ');
  console.log(countDivisibleBy3(start, end));
}
