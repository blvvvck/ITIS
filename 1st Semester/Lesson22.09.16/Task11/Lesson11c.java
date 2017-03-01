// Determines the difference between Euclid's algorithm and brute force method
public class Lesson11c{
	public static void main (String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int a1 = a;
		int b1 = b;
		int min = a;
		int max = b;

		//Brute force mehtod

		long start = System.nanoTime();

		if (a==b){
			System.out.println("НОД " + a);
		}
		else {
			if (b < min) {
				min = b;
			}

			for (int i = 2; i <= min; i++){
				if (a % i == 0 && b % i == 0){
					max = i;
				}
			}
		

		System.out.println("Brute force method: " + max);

		}

		long end = System.nanoTime();
		long microseconds = (end - start) / 1000;

		
		// Euclid's algorithm

		long start1 = System.nanoTime();

		while (a1!=0 && b1!=0){
			if (a1 > b1){
				a1 = a1 % b1;
			}
			else{
				b1 = b1 % a1;
			}
		}
		System.out.println("Euclid's algorithm: " + (a1+b1));

		long end1 = System.nanoTime();
		long microseconds1 = (end1 - start1) / 1000;

		if (microseconds > microseconds1) {
			System.out.println ("Euclid's algorithm is faster on " + (microseconds - microseconds1) + " microseconds");
		}

		if (microseconds1 > microseconds) {
			System.out.println ("Brute force method is faster at" + (microseconds1 - microseconds) + " microseconds");
		}


	}
}
