/**
@description To find a element from a Sorted List using Binary search
@param List
@param ItemToFind
@returns Int
*/
function BinarySearch(List, Target) {
	let Begin = 0,
		Last = List.length - 1;
	while (Begin <= Last) {
		let mid = Number.parseInt(Begin + (Last - Begin) / 2);
		let MiddleElement = List[mid];
		console.log(`Middle element : ${MiddleElement}`);
		if (MiddleElement < Target) {
			Begin = mid + 1;
		} else if (MiddleElement > Target) {
			Last = mid - 1;
		} else {
			return mid;
		}
	}
	return -1;
}
let listy = [];

for (let index = 0; index < 10000000; index++) {
	listy.push(index);
}
const test = BinarySearch(listy, 676767);
if (test === 676767) {
	console.log(`Test result: ${test}`);
	console.log("Found!");
} else {
	console.log(`Test result: ${test}`);
	console.log("Failed!");
}
