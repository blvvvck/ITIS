import java.util.Arrays;

public class Task1a {
	public static void main(String[] args) {


        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }

        reverse(a);
    }

		public static void reverse (int[] arr) {
            System.out.println("original array : " + Arrays.toString(arr));

            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
            System.out.println("reversed array : " + Arrays.toString(arr));
        }


    }