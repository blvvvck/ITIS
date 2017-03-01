package Task1;

import java.util.Scanner;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк");
        final int SIZE = Integer.parseInt(sc.nextLine());
        String arr[] = new String[SIZE];

        for(int i = 0; i < SIZE; i++){
            System.out.print("Введите строку: ");
            arr[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
