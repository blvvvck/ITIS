package Task2;

import java.util.ArrayList;

public class ArrayListMap<K, V> implements Map<K, V> {

    private ArrayList<K> keys;
    private ArrayList<V> values;

    public ArrayListMap() {
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public ArrayListMap(int size) {
        this.keys = new ArrayList<>(size);
        this.values = new ArrayList<>(size);
    }

    @Override
    public void add(K key, V value) {
        checkKey(key);
        keys.add(key);
        values.add(value);
    }

    @Override
    public Object get(K key) {
        checkKey(key);
        int num = keys.indexOf(key);
        return values.get(num);
    }

    @Override
    public void set(K key, V value) {
        if (keys.contains(key)){
            throw new KeyException("Ключ не найден");
        }

        int num = keys.indexOf(key);
        values.set(num, value);
    }

    @Override
    public Object remove(K key) {
        checkKey(key);
        int index = keys.indexOf(key);
        Object obj = values.get(index);
        keys.remove(index);
        values.remove(index);
        return obj;
    }

    @Override
    public void removeAll() {
        keys.clear();
        values.clear();
    }

    @Override
    public K[] getKeys() {
        return (K[]) keys.toArray();
    }

    @Override
    public V[] getValues() {
        return (V[]) values.toArray();
    }

    @Override
    public int size() {
        return keys.size();
    }

    private void checkKey(K key) throws KeyException {
        if (keys.contains(key)) throw new KeyException("Такой ключ уже использован");
    }
}
