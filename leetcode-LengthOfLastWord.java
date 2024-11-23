class Main {
    static Solution s =  new Solution();
    static int i =  0;
    static void test(String str, int result){
        if(s.lengthOfLastWord(str) == result) System.out.println("Test " + (++i)+ ": \u001B[32mPassed\u001B[0m");
        else System.out.println("Test " + (++i)+ ": \u001B[31mFailed\u001B[0m");
    }
    public static void main(String[] args) {
        test("Hello World", 5);
        test("   fly me   to   the moon  ", 4);
        test("luffy is still joyboy", 6);
        test("    day", 3);
        
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(s.length() == 1) return 1;
        if(s.length() == 0) return 0;
        int position = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return s.length() - i - 1;
            }
        }
        return s.length();
    }
}
