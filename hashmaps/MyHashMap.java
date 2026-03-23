package hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyHashMap {
    private static final int SIZE = 1000;
    private List<int[]>[] buckets;

    public MyHashMap() {
        buckets = new ArrayList[SIZE];

        for(int i = 0; i < SIZE; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        List<int[]> bucket = buckets[index];

        for(int[] pair:bucket) {
            if(pair[0] == key) {
                pair[1] = value;
                return;
            }
        }

        bucket.add(new int[] {key, value});
    }

    public int get (int key) {
        int index = hash(key);
        List<int[]> bucket = buckets[index];

        for(int[] pair: bucket) {
            if(pair[0] == key) {
                return pair[1];
            }
        }


        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        List<int[]> bucket = buckets[index];

        for(int i = 0; i < bucket.size(); i++) {
            if(bucket.get(i)[0] == key) {
                bucket.remove(i);
                return;
            }
        }
    }

    public void print() {
        for(int i = 0; i < SIZE; i++) {
            for(int[] pair: buckets[i]) {
                System.out.println(Arrays.toString(pair));
            }
        }
    }

    static void main() {
        MyHashMap hm = new MyHashMap();
        hm.put(5, 5);
        hm.put(10, 11);
        hm.put(1, 140);

        hm.print();
        System.out.println(hm.get(10));

        hm.remove(10);
        hm.print();
    }
}
