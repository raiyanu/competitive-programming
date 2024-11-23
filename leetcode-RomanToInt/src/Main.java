import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.Test(s.romanToInt("III") == 3);
        s.Test(s.romanToInt("MCMXCIV") == 1994);
        s.Test(s.romanToInt("LVIII") == 58);
        System.out.println("------------ End ------------");
    }
}

class Solution {

    int i = 0;
    HashMap<Character, Integer> map = new HashMap<>();

    Solution() {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        System.out.println(map);
        System.out.println("---------- Started ----------");
    }

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.length() - 1 == i) {
                result += map.get(s.charAt(i));
            } else {
                if (s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    result += s.charAt(i + 1) == 'V' ? 4 : 9;
                    i++;
                } else if (s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    result += s.charAt(i + 1) == 'L' ? 40 : 90;
                    i++;
                } else if (s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    result += s.charAt(i + 1) == 'D' ? 400 : 900;
                    i++;
                } else {
                    result += map.get(s.charAt(i));
                }
            }
        }
        System.out.print("myInt: " + result + " \t");
        return result;
    }

    public void Test(boolean s) {
        if (s) {
            System.out.println("Test " + (++i) + ": Passed");
        } else {
            System.out.println("Test " + (++i) + ": Failed");
        }
    }
}
