function isAnagrams(s: string, t: string) {
    if (s.length !== t.length) return false;
    const sMap: Record<string, number> = {};
    for (let i: number = 0; i < s.length; i++) sMap[s[i]] = (sMap[s[i]] || 0) + 1;
    for (let i: number = 0; i < t.length; i++) {
        const key = t[i];
        if (!sMap[key]) return false;
        else sMap[key]--;
    }
    return true;
}

console.log(isAnagrams("zzz", "aaa"));
console.log(isAnagrams("qwerty", "ytrewq"));
console.log(isAnagrams("abcc", "abc"));
console.log(isAnagrams("jjjkjjkk", "jjjkkkjj"));
