
public class EndlessArray<T> implements EndArrInterface<T> {
    private T[] valueArray;
    private int size = 0;

    private static final int INIT_CAPACITY = 10;
    private static final float RESIZE_FACTOR = 1.5f;


    public EndlessArray(T[] o) {
    this.valueArray =(T[]) new Object[INIT_CAPACITY];
    }

    public EndlessArray(int size){
        this.valueArray = (T[]) new Object[size];
    }

    @Override
    public void add(T obj){
        // Check if this.data is full
        if(this.size >= this.valueArray.length){
            int newCapacity = new Double(Math.floor(this.valueArray.length*RESIZE_FACTOR)).intValue();
            Object[] temp = new Object[newCapacity];
            System.arraycopy(this.valueArray, 0, temp, 0, this.valueArray.length);
            this.valueArray = (T[]) temp;
        }
        this.valueArray[this.size] = (T) obj;
        this.size++;
    }

    @Override
    public  T get(int i){
        if(size < i){
            return null;
        }
        return this.valueArray[i];
    }

}
