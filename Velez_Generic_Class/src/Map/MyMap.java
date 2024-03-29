package Map;

import java.util.ArrayList;
import java.util.List;

public class MyMap<K, V> {
    private List<K> keys;
    private List<V> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(K key, V value) {
        int index = keys.indexOf(key);
        if (index != -1) {
            values.set(index, value); // Update value if key exists
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public V get(K key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            return values.get(index);
        }
        return null;
    }

    public V remove(K key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            K removedKey = keys.remove(index);
            return values.remove(index);
        }
        return null;
    }
}
