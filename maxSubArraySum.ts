/**
 * To Find Largest Sum For Given Window Size For Consecutive element in A Array
 * @param arr Array<Number>
 * @param subSize Number
 * @returns Number
 * Time Complexity: O(n * k) --> [n = arr.length, k = subSize]
 * Space Complexity: O(1)
*/
function maxSubArraySum(arr: Array<number>, subSize: number): number | void {
    if (arr.length < subSize) return;
    if (arr.length === subSize) return arr.reduce((p, c) => p + c);
    let result: number = 0;
    for (let i = subSize; i <= arr.length; i++) {
        let sum: number = 0;
        for (let j = i - subSize; j < i; j++) sum += arr[j];
        if (sum > result) result = sum;
    }
    return result;
}

console.log(maxSubArraySum([1, 0, -1], 2));
console.log(maxSubArraySum([1, -1], 2));
console.log(maxSubArraySum([1, 2, 3, 4, 7, -12, -32, -4], 3));
console.log(maxSubArraySum([1, 2, 3, 4, 7, -12, -32], 3));
console.log(maxSubArraySum([55, -55, 1, 2, 3, 4, 7, -12, -32, 213, -123], 4));
console.log("================================")

console.log(maxSubArraySum([-3, -2, -1, 0, 1, 2, 3], 2), 2);
console.log(maxSubArraySum([-2, -1, 0, 1, 2], 2));
console.log(maxSubArraySum([-5, -3, -2, 0, 2, 4, 6], 2));
console.log(maxSubArraySum([-1, 0, 1], 2));
console.log(maxSubArraySum([-4, -2, 0, 1, 3], 2));
console.log(maxSubArraySum([-10, -5, -2, 0, 1, 3, 5, 10], 2));
console.log(maxSubArraySum([-3, -2, -1, 0, 1], 2));
console.log(maxSubArraySum([-2, -1, 0, 2, 3], 2));
console.log(maxSubArraySum([-1, 1, 2, 3, 4], 2));
console.log(maxSubArraySum([-5, -4, -3, -2, -1], 2));
console.log(maxSubArraySum([0, 0], 2));
console.log(maxSubArraySum([2, 2], 2));
console.log(maxSubArraySum([], 2));
console.log(maxSubArraySum([1, 2, 3, 4], 5));                   
