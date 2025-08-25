const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

const [B, C, D] = input[0].split(" ").map(Number);
let burgers = input[1].split(" ").map(Number);
let sides = input[2].split(" ").map(Number);
let drinks = input[3].split(" ").map(Number);

const totalPrice = [...burgers, ...sides, ...drinks].reduce((a, b) => a + b, 0);

burgers.sort((a, b) => b - a);
sides.sort((a, b) => b - a);
drinks.sort((a, b) => b - a);

const setCount = Math.min(B, C, D);

let discountPrice = 0;

for (let i = 0; i < setCount; i++) {
  const setSum = burgers[i] + sides[i] + drinks[i];
  discountPrice += setSum * 0.9;
}

for (let i = setCount; i < burgers.length; i++) 
    discountPrice += burgers[i];
for (let i = setCount; i < sides.length; i++) 
    discountPrice += sides[i];
for (let i = setCount; i < drinks.length; i++) 
    discountPrice += drinks[i];

console.log(totalPrice);
console.log(Math.floor(discountPrice));
