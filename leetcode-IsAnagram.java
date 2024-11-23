import java.util.HashMap;

class Main {
    static int i =  0;
    static void test(String s, String t, boolean result){
        Solution solution =  new Solution();
        if(solution.isAnagram(s,t) == result) System.out.println("Test " + (++i)+ ": \u001B[32mPassed\u001B[0m");
        else System.out.println("Test " + (++i)+ ": \u001B[31mFailed\u001B[0m");
    }
    public static void main(String[] args) {
        test("anagram", "nagaram", true);
        test("rat", "car", false);
        test("anagram", "nagaram", true);
        test("a", "ab", false);
    }
}


class Solution {
    HashMap<Character, Integer> Smap = new HashMap<>();
    HashMap<Character, Integer> Tmap = new HashMap<>();

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        for (Character ch : s.toCharArray()) Smap.put(ch, Smap.getOrDefault(ch, 0) + 1);
        for (Character ch : t.toCharArray()) Tmap.put(ch, Tmap.getOrDefault(ch, 0) + 1);
        for (char key : Smap.keySet()) if (Tmap.get(key) != Smap.get(key)) return false;
        for (char key : Tmap.keySet()) if (Tmap.get(key) != Smap.get(key)) return false;
        return true;
    }
}
