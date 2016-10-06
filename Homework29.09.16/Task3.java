import java.util.Arrays;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {

		int na = Integer.parseInt(args[0]);//длина первого массива
		int nb = Integer.parseInt(args[1]);//длина второго массива

		int [] a = new int [na];
		int [] b = new int [nb];
		
		if (na == 0 || nb == 0) {
			System.out.println("The array must be greater than zero");
			System.exit(0);
		}

		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}

		for (int i = 0; i < b.length; i++) {
			b[i] = random.nextInt(100);
		}

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		for (int i = 0; i < nb; i++) {
			boolean f = false;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == b[i]) {
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
