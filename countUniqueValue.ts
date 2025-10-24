/**
 * To Filter Out Duplicate Number From Sorted Array
 * Time Complexity: O(N)   
 * Space Complexity: O(1)
 * 
 * @param arr Array<number>
 * @returns Array<number>
 */
function filterDuplicateNumber(arr: Array<number>): Array<number> {
    if ([0, 1].includes(arr.length)) return arr;
    let pivotLeft = 0,
        pivotRight = 1;
    while (pivotLeft <= pivotRight)
        if (arr[pivotLeft] !== arr[pivotRight]) arr[++pivotLeft] = arr[pivotRight];
        else if (pivotRight >= arr.length - 1) break;
        else if (arr[pivotLeft] === arr[pivotRight]) pivotRight++;
        else pivotLeft++;
    return arr.splice(0, pivotLeft + 1);
}

console.log(filterDuplicateNumber([1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 7, 7]).length);
console.log(
    filterDuplicateNumber([1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 7]).length
);
console.log(
    filterDuplicateNumber([
        1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 7, 12, 13, 14, 15, 15, 15,
    ]).length
);
console.log(
    filterDuplicateNumber([1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 7, 999, 123, 12312])
        .length
);
console.log(filterDuplicateNumber([1, 1, 1, 1, 1, 1, 1, 1, 1, 1]).length);
console.log(filterDuplicateNumber([]).length);
console.log(filterDuplicateNumber([1232123321]).length);
