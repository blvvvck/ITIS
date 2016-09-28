//НАХОЖДЕНИЕ НАИБОЛЬШЕГО ОБЩЕГО ДЕЛИТЕЛЯ С ПОМОЩЬЮ АЛГОРИТМА ЕВКЛИДА
public class Lesson11a{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		// Euclid's algorithm
		while (a!=0 && b!=0){
			if (a>b){
				a = a % b;
			}
			else{
				b = b % a;
			}
		}
		System.out.println("НОД " + (a+b));
	}
}	