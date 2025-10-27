function quickSort(arr: Array<number>): Array<number> {
    if (arr.length < 2) return arr;
    let pivot = arr[arr.length - 1], left = [], right = [];
    for (let i = 0; i < arr.length - 1; i++) {
        if (arr[i] > pivot) {
            right.push(arr[i])
        } else {
            left.push(arr[i])
        }
    }
    return [quickSort(left), pivot, quickSort(right)].flat();
}

console.log(quickSort([5, 4, 3, 6, 7, 8, 1, 2]));
console.log(quickSort([1, 0, -1]));
console.log(quickSort([1, -1]));
console.log(quickSort([1, 2, 3, 4, 7, -12, -32, -4]));
console.log(quickSort([1, 2, 3, 4, 7, -12, -32]));
console.log(quickSort([55, -55, 1, 2, 3, 4, 7, -12, -32, 213, -123]));
console.log(quickSort([0, 0]));
console.log(quickSort([]));
console.log(quickSort([4, 1, 2, 3,]));
