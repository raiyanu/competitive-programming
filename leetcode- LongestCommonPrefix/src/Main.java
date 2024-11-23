import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/*
* Solution 1
* Gotta solve this later with recursion, tree or Solution 1
* */
public class Main {
    static int i = 0;
    Solution s = new Solution();

    public static void Test(String[] strs, String output) {
        Solution s = new Solution();
        if (Objects.equals(s.longestCommonPrefix(strs), output)) {
            System.out.println("Test " + (++i) + ": Passed");
        } else {
            System.out.println("Test " + (++i) + ": Failed");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Test(new String[]{"flower", "flow", "flight"}, "fl");
        Test(new String[]{"dog", "racecar", "car"}, "");
        Test(new String[]{"disco", "direction", "zack"}, "di");
        Test(new String[]{"disco", "relation", "mining"}, "fl");
    }
}

class Solution {
    char LCPrefixString = Character.MIN_VALUE;
    int LCPrefixCount = Integer.MIN_VALUE;
    int LCPrefixDepth = Integer.MIN_VALUE;

    public String longestCommonPrefix(String[] strs) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<String> filteredSet = new ArrayList<>();
//                                                  below is wrong
        for (String str : strs) if(str.charAt(1)=='0') filteredSet.add(str);
        for (String str : strs) {
            map.put(str.charAt(0), map.getOrDefault(str.charAt(0), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > LCPrefixDepth) {
                LCPrefixDepth = entry.getValue();
                LCPrefixString = entry.getKey();
            }
        }

        return "";
    }
}
