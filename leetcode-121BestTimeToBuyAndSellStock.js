/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
  let R = 1,
    L = 0,
    maxProfit = 0;
  while (R < prices.length) {
    if (prices[L] < prices[R]) {
      let attempt = prices[R] - prices[L];
      maxProfit = Math.max(maxProfit, attempt);
    } else {
      L = R;
    }
    R += 1;
  }
  return maxProfit;
};

// var maxProfit = function (prices) {
//   let pricesLength = prices.length;
//   let AttemptedPrice = 0;
//   for (let i = 0; i < pricesLength - 1; i++) {
//     let temp = prices.slice(i + 1);
//     let tempLargest = Math.max(...temp);
//     let cal = tempLargest - prices[i];
//     if (cal > AttemptedPrice) AttemptedPrice = cal;
//   }
//   console.log(`attempts: ${AttemptedPrice}`);
//   return AttemptedPrice;
// };

// var maxProfit = function (prices) {
//   let pricesLength = prices.length;
//   let AttemptedPrice = [];
//   for (let i = 0; i < pricesLength - 1; i++) {
//     let temp = prices.slice(i + 1);
//     let tempLargest = Math.max(...temp);
//     let cal = tempLargest - prices[i];
//     if (cal > 0) AttemptedPrice.push(cal);
//   }
//   console.log(`attempts: ${AttemptedPrice}`);
//   return AttemptedPrice.length != 0 ? Math.max(...AttemptedPrice) : 0;
// };

// var maxProfit = function (prices) {
//   let pricesLength = prices.length;
//   let AttemptedPrice = [];
//   for (let i = 0; i < pricesLength - 1; i++) {
//     let temp = prices.slice(i + 1);
//     temp.map((priceItem) => {
//       let cal = priceItem - prices[i];
//       if (cal > 0) AttemptedPrice.push(cal);
//     });
//   }
//   console.log(`attempts: ${AttemptedPrice}`);
//   return AttemptedPrice.length != 0 ? Math.max(...AttemptedPrice) : 0;
// };

[
  [[7, 1, 5, 3, 6, 4], 5],
  [[7, 6, 4, 3, 1], 0],
].map((test, index) => {
  let result = maxProfit(test[0]);
  if (result === test[1]) {
    console.log(`Test ${index} : ${test[0]} -> ${result} PASSED`);
  } else {
    console.log(`reult : ${result}`);
    console.log(
      `Test ${index} : ${test[0]} -> ${result} but expected ${test[1]} FAILED`,
    );
  }
});
