public class EndArrUtils {

    public static <T> void fill(T[] arr, T obj) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj;
        }
    }
}
