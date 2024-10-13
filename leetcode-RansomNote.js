/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function (ransomNote, magazine) {
	let ransomNoteArr = ransomNote.split("");
	let magazineArr = magazine.split("");
	for (let i = 0; i < ransomNoteArr.length; i++) {
		let index = magazineArr.indexOf(ransomNoteArr[i]);
		if (index === -1) {
			return false;
		}
		magazineArr.splice(index, 1);
	}
	return true;
};

if (!(canConstruct("aa", "b") == false)) {
	console.log("Failed");
}
if (!(canConstruct("aa", "ab") == false)) {
	console.log("Failed");
}
if (!(canConstruct("aa", "baa") == true)) {
	console.log("Faileds");
}
