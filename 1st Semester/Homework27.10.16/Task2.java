import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        long[] array = createArray();

        System.out.println("First two elements of original array : " + array[0] + ", " + array[1]);

        changingArray(array);

        System.out.println("Modified array : " + Arrays.toString(array));

    }

    public static long[] changingArray(long[] array) {

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-1] * array[i-2];
        }

        return array;

    }

    public static long[] createArray(){

        int capacity = (int) (3 + Math.random() * 10);
        long[] array = new long[capacity];
        for (int i = 0; i < 2; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(capacity);
        return array;

    }
}