import java.util.ArrayList;
import java.util.LinkedList;

public class HashyMap {
    private final LinkedList<Entry>[] HashTable;
    private Object e;

    public HashyMap(int capacity) {
        HashTable = new LinkedList[capacity];
    }

    public void put(int key, String value) {
        int index = hash(key);
        if (HashTable[index] == null)
            HashTable[index] = new LinkedList<>();

        var entry = getEntry(key);
        if (entry != null) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        HashTable[index].add(new Entry(key, value));
    }

    public String get(int key) {
        var entry = getEntry(key);
        if (entry == null) return null;
        else return entry.value;
    }

    public void remove(int key) {
        var entry = getEntry(key);
        if (entry == null) throw new IllegalStateException();
        getBucket(key).remove(entry);
    }

    public void printAll() {
        ArrayList<Entry> e = new ArrayList<>();
        for (LinkedList<Entry> L : HashTable)
            L.forEach(entry -> e.add((Entry) entry));
        e.sort((entry, t1) -> entry.key - t1.key);
        e.forEach(System.out::println);
    }

    private int hash(int key) {
        return key % HashTable.length;
    }

    private Entry getEntry(int key) {
        var bucket = getBucket(key);
        if (bucket != null)
            for (Entry entry : bucket)
                if (entry.key == key) {
                    return entry;
                }
        return null;
    }

    private LinkedList<Entry> getBucket(int key) {
        return HashTable[hash(key)];
    }

    static class Entry {
        int key;
        String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry { " +
                    "key:" + key +
                    ", value:'" + value + '\'' +
                    " }";
        }
    }
}
