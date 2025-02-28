function isEugeneNumber(N) {
  let numStr = N.toString();
  let len = numStr.length;
  
  for (let i = 1; i < len; i++) {
    let left = numStr.slice(0, i);
    let right = numStr.slice(i);
    let leftProduct = left.split('').reduce((acc, cur) => acc * parseInt(cur), 1);
    let rightProduct = right.split('').reduce((acc, cur) => acc * parseInt(cur), 1);
   
    if (leftProduct === rightProduct) {
      return 'YES';
    }
  }
  return 'NO';
}
const N = parseInt(require('fs').readFileSync('/dev/stdin').toString().trim(), 10);
console.log(isEugeneNumber(N));
