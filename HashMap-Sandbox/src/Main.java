import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        System.out.println("Started");
//        System.out.println(FindFirstNonRepeatingChar("TThHe gGoogle Pixel Love"));
//        System.out.println(FindFirstRepeatingChar("The Google Pixel Love"));
        HashyMap map = new HashyMap(5);
        map.put(1, "One");
        map.put(1, "One++");
        map.put(1, "Another One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.printAll();
        System.out.println("========");

        map.remove(3);
        map.remove(2);
        map.printAll();
        System.out.println("========");
        System.out.println("Entry for key 5: " + map.get(5));
        System.out.println("Entry for key 6: " + map.get(6));
        System.out.println("Entry for key 12: " + map.get(12));
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


