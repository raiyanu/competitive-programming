import java.util.*;


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

class HashyMap {
    private LinkedList<Entry>[] HashTable;
    private Object e;

    public HashyMap(int capacity) {
        this.HashTable = new LinkedList[capacity];
    }

    public void put(int key, String value) {
        int index = hash(key);
        if (HashTable[index] == null)
            HashTable[index] = new LinkedList<>();
        Entry e = new Entry(key,value)

    }

    private int hash(int key) {
        return key % HashTable.length;
    }

    public int get(int key) {
        for (LinkedList L : HashTable)
            L.forEach(o -> System.out.println(o));
        return 0;
    }

    static class Entry {
        int  key;
        String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
