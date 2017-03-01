package Task2;

public class Queue<T> implements Sequance<T> {

    private static final int INIT_CAPACITY = 10;
    private static final float RESIZE_FACTOR = 1.5f;

    private Object[] data;
    private int size = 0;

    public Queue(){
        this.data =(T[]) new Object[INIT_CAPACITY];
    }
    public Queue(int initCapacity){
        this.data = (T[]) new Object[initCapacity];
    }


    @Override
    public void add(T obj) {
        if(this.size >= this.data.length){
            int newCapacity = new Double(Math.floor(this.data.length*RESIZE_FACTOR)).intValue();
            Object[] temp = new Object[newCapacity];
            System.arraycopy(this.data, 0, temp, 0, this.data.length);
            this.data = (T[]) temp;
        }
        this.data[this.size] = (T) obj;
        this.size++;
    }

    @Override
    public T pop() {
        size--;
        Object obj = data[0];

        Object[] newArr = new Object[size];
        System.arraycopy(data, 1, newArr, 0, size);
        return (T) obj;
    }

    @Override
    public int size() {
        return size;
    }

}