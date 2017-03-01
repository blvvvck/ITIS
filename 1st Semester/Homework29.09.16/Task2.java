public class Task2 {

	public static void main(String[] args) {

		int n = 10;
		int spaces = n;


		for (int i = 0; i < n; i++) {


			for (int c = 0; c <= spaces - 1; c++){ 
				System.out.print("   ");
			}

			spaces--;

			for (int c = 0; c <= i; c++){


				if (fact(i) / (fact(c)*fact(i-c)) / 100 != 0) {
					System.out.print("   ");
				}
				else if (fact(i) / (fact(c)*fact(i-c)) / 10 != 0) {
					System.out.print("   ");
				}		
				else {
					System.out.print("   ");
				}

				System.out.print(fact(i) / (fact(c)*fact(i-c))); //Само число


				if (fact(i) / (fact(c)*fact(i-c)) / 100 != 0) {
					System.out.print("");
				}
				else if (fact(i) / (fact(c)*fact(i-c)) / 10 != 0) {
					System.out.print(" ");
				}		
				else {
					System.out.print("  ");
				}
				

			}

			System.out.println();
		}
		
	}			

		public static int fact(int n) {
			int x = 1;
			for (int i = 1; i <= n; i++) {
				x *= i;
			}
			return x;
		}


}