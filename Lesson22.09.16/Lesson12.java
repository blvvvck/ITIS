public class Lesson12{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int n1 = n - 1;

		if (n1 < 0){
			System.out.println("The number must be positive");
		}

		for (int i = 1; i <= n; i++){
			for (int j = n1; j >= 1; j--){
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++){
				System.out.print("* ");
			}

			n1--;

			System.out.println();

		}
	}
}
