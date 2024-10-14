const regex = /^\d+$/;

/**
 * @param {string} s
 * @return {string}
 */
var reformat = function (s) {
  s = s.split("");
  let numerics = [],
    alphabets = [];
  s.forEach((char, index) => {
    if (char.match(regex)) {
      numerics.push(char);
    } else {
      alphabets.push(char);
    }
  });

  // let numerics = s.filter((char) => char.match(regex));
  // let alphabets = s.filter((char) => !char.match(regex));
  let result = Math.abs(numerics.length - alphabets.length);
  if (!(result === 1 || result === 0 || numerics.length === -1)) {
    return "";
  }
  if (numerics.length >= alphabets.length) {
    result = "";
    for (let i = 0; i < alphabets.length; i++) {
      result += numerics[i] + alphabets[i];
    }
    if (numerics.length > alphabets.length) {
      result += numerics[numerics.length - 1];
    }
  } else {
    result = "";
    for (let i = 0; i < numerics.length; i++) {
      result += alphabets[i] + numerics[i];
    }
    result += alphabets[alphabets.length - 1];
  }
  return result;
};

// Test case
if (reformat("a0b1c2") === "0a1b2c") {
  console.log("Test case 1 is correct");
} else {
  console.log("Test case 1 is incorrect");
}
if (reformat("leetcode") === "") {
  console.log("Test case 2 is correct");
} else {
  console.log("Test case 2 is incorrect");
}
if (reformat("1229857369") === "") {
  console.log("Test case 3 is correct");
} else {
  console.log("Test case 3 is incorrect");
}
if (reformat("covid2019") === "c2o0v1i9d") {
  console.log("Test case 4 is correct");
} else {
  console.log("Test case 4 is incorrect");
}
if (reformat("ab123") === "1a2b3") {
  console.log("Test case 5 is correct");
} else {
  console.log("Test case 5 is incorrect");
}
