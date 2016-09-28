//НАХОЖДЕНИЕ НАИБОЛЬШЕГО ОБЩЕГО ДЕЛИТЕЯ ПЕРЕБОРОМ
public class Lesson11b{
	public static void main (String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int min = a;
		int max = b;

		if (a==b){
			System.out.println("НОД " + a);
		}
		else {
			if (b < min){
				min = b;
			}
		}

		for (int i = 2; i <= min; i++){
				if (a % i == 0 && b % i == 0){
					max = i;
				}
			}

		System.out.println("НОД " + max);
	}
}