const fourSquares = function (n) {
    for (let i = 0; i >= n; i++) {
        for (let j = 0; j >= n; j++) {
            for (let k = 0; k >= n; k++) {
                for (let l = 0; l >= n; l++) {
                    if ((i * i + j * j + k * k + l * l) === n) {
                        console.log("Found");
                        return [i, j, k, l];
                    } else {
                        console.log(i * i + j * j + k * k + l * l);
                    }
                }
            }
            console.log("J: " + j);
        }
        console.log("I: " + i);
    }
    return [0n, 0n, 0n, 0n];
}

for (let n of [0n, 1n, 17n, 33n, 215n, 333n, 2n ** 12n - 3n]) {
    let [a, b, c, d] = fourSquares(n);
    let result = (n);
    console.log(`a: ${a}, b: ${b}, c: ${c}, d: ${d}`);
    console.log(`sqrt(a): ${a * a}, sqrt(b): ${b * b}, sqrt(c): ${c * c}, sqrt(d): ${d * d}`);
    if ((a * a + b * b + c * c + d * d) === n) {
        console.log("success!");
    }
    else {
        console.log(failed);
    }
} 
