public class Task6 {

	public static void main(String[] args) {

		String a = args[0];
		char[] a1 = a.toCharArray();
		boolean equal = false;

		for (int i = 0; i < a1.length/2; i++) {

			if (a1[i] == a1[a1.length-i-1]) {
				equal = true;
			}
			else {
				equal = false;
				break;
			}

		}

		if (equal) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}

	}

}