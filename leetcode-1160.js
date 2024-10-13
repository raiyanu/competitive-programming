// 1160. Find Words That Can Be Formed by Characters

/**
 * @param {string[]} words
 * @param {string} chars
 * @return {number}
 */
var countCharacters = function (words, chars) {
	let totalLetters = 0;
	words.forEach((word) => {
		let characters = chars;
		let availableLetters = word.length;
		console.log("letters:", availableLetters);
		[...word].forEach((letter) => {
			let index = characters.indexOf(letter);
			if (!(index === -1)) {
				availableLetters--;
				characters.slice(index, 1);
			}
		});
		if (availableLetters >= 0) {
			console.log("availableLettersnow:", availableLetters);
			console.log(word);
			totalLetters += word.length;
			console.log(totalLetters);
		}
	});
	return totalLetters;
};

const test1 = countCharacters(["cat", "bt", "hat", "tree"], "atach");
if (test1 === 6) {
	console.log("output:", test1);
	console.log("failed");
} else {
	console.log(test1);
}

const test2 = countCharacters(["hello", "world", "leetcode"], "welldonehoneyr");
if (test2 === 10) {
	console.log("output:", test2);
	console.log("failed");
} else {
	console.log(test2);
}
