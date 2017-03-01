package Task2;

public interface Map<K, V> {

    void add(K key, V value);

    Object remove(K key);

    Object get(K key);

    void set(K key, V value);

    void removeAll();

    K[] getKeys();

    V[] getValues();

    int size();
}
