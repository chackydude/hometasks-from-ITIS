import java.util.*;

public class MyMap<K,V> extends AbstractMap<K, V> {
    private ArrayList<K> keys;
    private ArrayList<V> values;

    // constructors
    public MyMap() {
        this.keys = new ArrayList<K>(100);
        this.values = new ArrayList<V>(100);
    }

    public MyMap(MyMap inMap) {
        this.keys = inMap.keys;
        this.values = inMap.values;
    }

    @Override
    public int size() {
        return keys.size();
    }

    @Override
    public boolean isEmpty() {
        return this.keys.size() == 0;
    }

    @Override
    public boolean containsValue(Object value) {
        return this.values.contains(value);
    }

    @Override
    public boolean containsKey(Object key) {
        return this.keys.contains(key);
    }

    // returns value by key
    @Override
    public V get(Object key) {
        if (this.keys.contains(key)) {
            return this.values.get(this.keys.indexOf(key));
        } else return null;
    }

    // adds value in the map by key (returns - value what already was before for input key-mapping or null else
    @Override
    public V put(K key, V value) {
        if (this.keys.contains(key)) {
            V val = this.values.get(this.keys.indexOf(key));
            this.values.add(this.keys.indexOf(key), value);
            return val;
        } else {
            this.keys.add(this.keys.size(), key);
            this.values.add(this.values.size(),value);
            return null;
        }
    }

    // removes mapping key-value (returns - value what was before removing, - null if where was no such value)
    @Override
    public V remove(Object key) {
        if (this.keys.contains(key)) {
            int index = this.keys.indexOf(key);
            V val = this.values.get(index);
            this.keys.remove(index);
            this.values.remove(index);
            return val;
        } else {
            return null;
        }
    }

    // adds all mappings from inMap to this map
    public void putAll(MyMap<K, V> inMap) {
        for (int i = 0; i < inMap.keys.size(); i++) {
            this.put(inMap.keys.get(i), inMap.values.get(i));
        }
    }

    // removes all mappings from map
    @Override
    public void clear() {
        this.keys.clear();
        this.values.clear();
    }

    public Collection<K> keys() {
        return this.keys;
    }

    @Override
    public Collection<V> values() {
        return this.values;
    }

    // returns set of Map's Entries
    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> result = new HashSet<>();
        for (int i = 0; i < this.keys.size(); i++) {
            Entry entry = new Entry(this.keys.get(i), this.values.get(i));
            result.add((Map.Entry<K, V>) entry);
        }
        return result;
    }

    // replaces oldValue to the newValue if in mapping key-value value == oldValue
    @Override
    public boolean replace(K key, V oldValue, V newValue) {
        if (this.get(key) == oldValue) {
            int index = this.keys.indexOf(key);
            this.keys.remove(index);
            this.values.remove(index);
            this.keys.add(index, key);
            this.values.add(index, newValue);
            return true;
        } else return false;
    }

    // replaces value in the old mapping key-value
    @Override
    public V replace(K key, V value) {
        if (this.containsKey(key)) {
            int index = this.keys.indexOf(key);
            V val = this.values.get(index);
            this.keys.remove(index);
            this.values.remove(index);
            this.keys.add(index, key);
            this.values.add(index, value);
            return val;
        } else return null;
    }

    public String toString() {
        String result = "{";
        for (int i = 0; i < this.keys.size()-1; i++) {
            result += this.keys.get(i) + " : " + this.values.get(i) + ", ";
        }
        result = result + this.keys.get(this.keys.size()-1) + " : " + this.values.get(this.values.size()-1) + "}";
        return result;
    }

    // private Entry class
    private class Entry<K,V> implements Map.Entry {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public Object getKey() {
            return this.key;
        }

        @Override
        public Object getValue() {
            return this.value;
        }

        @Override
        public Object setValue(Object value) {
            V val = this.value;
            this.value = (V) value;
            return val;
        }

        @Override
        public String toString() {
            return "{" + this.key + " : " + this.value + "}";
        }
    }
}
