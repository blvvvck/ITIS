public class Lesson1 {
	public static void main(String[] args){

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);

	}
}