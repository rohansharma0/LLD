package HashMap;

public class HashMap<K,V> {
    private static int INITAL_SIZE = 1 << 4; // 16
    private static int MAXIMUM_CAPACITY = 1 << 30;

    public Entry[] hashTable;

    public HashMap(){
        hashTable = new Entry[INITAL_SIZE];
    }

    public HashMap(int capacity){
        int tableSize = tableSizeFor(capacity);
        hashTable = new Entry[tableSize];
    }

    private int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public void put(K key, V value) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        if(node == null){
            Entry newNode = new Entry(key, value);
            hashTable[hashCode] = newNode;
        }else{
            Entry pevNode = node;
            while (node != null){
                if(node.key == key){
                    node.value = value;
                    return;
                }
                pevNode = node;
                node = node.next;
            }
            pevNode.next = new Entry(key, value);
        }
    }

    public V get(K key) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        while (node != null){
            if(node.key.equals(key)){
                return (V) node.value;
            }
            node = node.next;
        }
        return  null;
    }

     static class Entry<K,V>{
        public K key;
        public V value;
        public Entry next;

        public Entry(K k, V v){
            this.key = k;
            this.value = v;
        }
    }
}

