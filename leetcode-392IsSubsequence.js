/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isSubsequence = function (s, t) {
	s = s.split("");
	t = t.split("");
	if (s.length == 0) {
		return true;
	}
	if (t.length == 0) {
		return false;
	}
	while (s.length > 0) {
		let letter = t.indexOf(s[0]);
		if (letter == -1) return false;
		t = t.slice(letter + 1, t.length);
		s.shift();
	}
	return true;
};

if (isSubsequence("abc", "ahbgdc")) {
	console.log("Test case 1 passed");
} else {
	console.log("Test case 1 failed");
}

if (!isSubsequence("axc", "ahbgdc")) {
	console.log("Test case 2 passed");
} else {
	console.log("Test case 2 failed");
}

if (!isSubsequence("", "")) {
	console.log("Test case 3 passed");
} else {
	console.log("test Case 3 failed ");
}
