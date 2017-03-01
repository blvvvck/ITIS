public class Task4 {

	public static void main(String[] args){

		String a = args[0];
		String b = args[1];
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		boolean equal = false;
		
		//проверка на длину массива
		if (a == 0 || b == 0) {
			System.out.println("The array must be greater than zero");
			System.exit(0);
		}

		for (int i = 0; i < a1.length; i++) {

			if (a1[i] == b1[i]) {
				equal = true;
			}
			else {
				equal = false;
				break;
			}

		}

		if (equal) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("strings are not equal");
		}

	}

}
