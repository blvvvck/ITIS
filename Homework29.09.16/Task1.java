import java.util.Arrays;

import java.util.Random;

public class Task1 {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		int [] a = new int [n];
		boolean swapped = true;
		int temp = 0;

		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}

		System.out.println(Arrays.toString(a));

		while (swapped == true) {

			for (int i = 0; i < a.length - 1; i++){

				for (int j = 0; j < a.length-i-1; j++) {

					if (a[j] > a[j+1]) {

						temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
						swapped = true;

					}
					else {
						swapped = false;
					}

				}

			}

		}

		System.out.println(Arrays.toString(a));


	}

}