import java.util.Arrays;

import java.util.Random;

public class Task5 {

	public static void main(String[] args) {

		String a = args[0];
		String b = args[1];
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		
		//проверка на длину массива
		if (a == 0 || b == 0) {
			System.out.println("The array must be greater than zero");
			System.exit(0);
		}

		for (int i = 0; i < b1.length; i++) {
			boolean f = false;
			for (int j = 0; j < a1.length; j++) {
				if (a1[j] == b1[i]) {
					System.out.println("b["+i+"]"+" first appearance " + "a["+j+"]");
					f = true;
				}
			}
			if (!f) {
				System.out.println("b["+i+"]"+" doesn't appear");
			}
		}

	}

}
