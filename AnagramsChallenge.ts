function isAnagrams(s: string, t: string) {
    const sMap: Record<string, number> = {},
        tMap: Record<string, number> = {};
    for (let i: number = 0; i < s.length; i++) sMap[s[i]] = (sMap[s[i]] || 0) + 1;
    for (let i: number = 0; i < t.length; i++) tMap[t[i]] = (tMap[t[i]] || 0) + 1;
    if (Object.keys(sMap).length !== Object.keys(tMap).length) return false;
    for (const key of Object.keys(sMap))
        if (sMap[key] !== tMap[key]) return false;
    return true;
}

console.log(isAnagrams("zzz", "aaa"));
console.log(isAnagrams("qwerty", "ytrewq"));
console.log(isAnagrams("abcc", "abc"));
console.log(isAnagrams("jjjkjjkk", "jjjkkkjj"));
