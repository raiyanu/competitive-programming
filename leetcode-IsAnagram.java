import java.util.HashMap;

class Main {
    static int i =  0;
    static void test(String s, String t, boolean result){
        Solution solution =  new Solution();
        if(solution.isAnagram(s,t) == result) System.out.println("Test " + (++i)+ ": \u001B[32mPassed\u001B[0m");
        else System.out.println("Test " + (++i)+ ": \u001B[31mFailed\u001B[0m");
    }
    public static void main(String[] args) {
        System.out.println(('c'-'a'));
        test("anagram", "nagaram", true);
        test("rat", "car", false);
        test("anagram", "nagaram", true);
        test("a", "ab", false);
    }
}


class Solution {
    HashMap<Integer, Integer> Smap = new HashMap<>();
    HashMap<Integer, Integer> Tmap = new HashMap<>();

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        fill(s, Smap);
        fill(t, Tmap);
        for (Integer key : Smap.keySet())
            if (Tmap.get(key) != Smap.get(key))
                return false;
        for (Integer key : Tmap.keySet())
            if (Tmap.get(key) != Smap.get(key))
                return false;
        return true;
    }

    private void fill(String s, HashMap<Integer, Integer> map) {
        for (Character ch : s.toCharArray())
            if (ch >= 'a' && ch <= 'z')
                map.put(ch - 'a', map.getOrDefault(ch - 'a', 0) + 1);
    }
}
