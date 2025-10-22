/**
* To Find Sum Zero For Un-Sorted Array
* @params Array Array<number>
* @description 
* Time Complexity: O(N^2) 
* Space Complexity: O(1)
**/
function findSumZero(arr: Array<number>): Array<number> | undefined {
    if (arr.length <= 0) return;
    for (let i = 0; i <= arr.length; i++)
        for (let j = arr.length; j >= i + 1; j--)
            if (arr[i] + arr[j] === 0) return [arr[i], arr[j]];
    return;
}

/**
* To Find Sum Zero For Sorted Array
* @params Array Array<number>
* @description 
* Time Complexity: O(N) 
* Space Complexity: O(1)
**/
function findSumZeroSorted(arr: Array<number>): Array<number> | undefined {
    if (arr.length <= 0) return;
    let head = 0, tail = arr.length - 1;
    while (head !== tail && head < tail) {
        const sum = arr[head] + arr[tail]
        if (sum === 0) return [arr[head], arr[tail]];
        else if (sum > 0)
            tail--;
        else
            head++;
    }
    return;
}

console.log(findSumZero([1, 0, -1]));
console.log(findSumZero([1, -1]));
console.log(findSumZero([1, 2, 3, 4, 7, -12, -32, -4]));
console.log(findSumZero([1, 2, 3, 4, 7, -12, -32]));
console.log(findSumZero([55, -55, 1, 2, 3, 4, 7, -12, -32, 213, -123]));
console.log("================================")

console.log(findSumZero([-3, -2, -1, 0, 1, 2, 3]));       // [ -3, 3 ]
console.log(findSumZero([-2, -1, 0, 1, 2]));              // [ -2, 2 ]
console.log(findSumZero([-5, -3, -2, 0, 2, 4, 6]));       // [ -2, 2 ]
console.log(findSumZero([-1, 0, 1]));                     // [ -1, 1 ]
console.log(findSumZero([-4, -2, 0, 1, 3]));              // undefined
console.log(findSumZero([-10, -5, -2, 0, 1, 3, 5, 10]));  // [ -10, 10 ]
console.log(findSumZero([-3, -2, -1, 0, 1]));             // [ -1, 1 ]
console.log(findSumZero([-2, -1, 0, 2, 3]));              // [ -2, 2 ]
console.log(findSumZero([-1, 1, 2, 3, 4]));               // [ -1, 1 ]
console.log(findSumZero([-5, -4, -3, -2, -1]));           // undefined
console.log(findSumZero([0, 0]));                         // [ 0, 0 ]
console.log(findSumZero([]));                            // undefined
console.log(findSumZero([1, 2, 3, 4]));                   // undefined

