import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Started");
        System.out.println(FindFirstNonRepeatingChar("TThHe gGoogle Pixel Love"));
        System.out.println(FindFirstRepeatingChar("The Google Pixel Love"));
    }

    public static char FindFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        var strCharArray = str.toLowerCase().toCharArray();
        for (char ch : strCharArray)
            map.put(ch, (map.getOrDefault(ch, 0)) + 1);
        for (char ch : strCharArray)
            if (map.get(ch) == 1) return ch;
        return Character.MIN_VALUE;
    }

    public static char FindFirstRepeatingChar(String str) {
        Set<Character> set = new HashSet<>();
        for (char ch : str.toLowerCase().toCharArray()) {
            if (set.contains(ch)) return ch;
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
