function same(arrA, arrB) {
  if (arrA.length !== arrB.length) return false;
  const mapA = {},
    mapB = {};
  arrA.forEach((key) => {
    if (mapA[key]) mapA[key]++;
    else mapA[key] = 1;
  });
  arrB.forEach((key) => {
    if (mapB[key]) mapB[key]++;
    else mapB[key] = 1;
  });

  if (Object.keys(arrA).length !== Object.keys(arrB).length) return false;

  for (const key in mapA) {
    if (mapA[key] !== mapB[key ** 2]) return false;
  }
  return true;
}

console.log(same([2, 3, 2], [4, 9, 4]));
console.log(same([1, 2, 3], [1, 4, 9]));
console.log(same([1, 2, 3], [1, 9]));
console.log(same([1, 2, 1], [4, 4, 1]));
