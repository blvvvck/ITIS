//НАХОЖДЕНИЕ НАИМЕНЬШЕГО ОБЩЕГО КРАТНОГО
public class Lesson10{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int a1 = a; // memorize the entered numbers
		int b1 = b;
		// Euclid's algorithm
		while (a!=0 && b!=0){
			if (a>b){
				a = a % b;
			}
			else{
				b = b % a;
			}
		}
		System.out.println("НОК " + (( a1*b1 )/(a+b)));
	}
}	