import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Task1b {
    public static void main(String[] args) {
        ArrayList<Integer>[] a = new ArrayList[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = new ArrayList<>();
            Collections.addAll(a[i], ((int) (Math.random() * 45)));
        }

        System.out.println("Original array:" + Arrays.toString(a));

        Collections.reverse(Arrays.asList(a));

        System.out.println("Reversed array: " + Arrays.toString(a));


    }
}