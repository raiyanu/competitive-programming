/**
 * @param {string} s
 * @param {string} t
 * @return {character}
 */
var findTheDifference = function (s, t) {
	let sArr = s.split("");
	let tArr = t.split("");
	if (sArr.length === 0) {
		return tArr[0];
	}
	if (tArr.length === 0) {
		return sArr[0];
	}
	for (let i = 0; i < sArr.length; i++) {
		let index = tArr.indexOf(sArr[i]);
		if (index !== -1) {
			tArr.splice(index, 1);
		}
	}
	return tArr[0];
};

if (findTheDifference("abcd", "abcde") === "e") {
	console.log("Test passed");
} else {
	console.log("Test failed");
}
if (findTheDifference("a", "aa") === "a") {
	console.log("Test passed");
} else {
	console.log("Test failed");
}

console.log(findTheDifference("abcd", "abcde"));
