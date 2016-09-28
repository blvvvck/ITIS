// ЕЩЕ ОДНА ФОРМУЛА С ФАКТОРИАЛОМ
public class Lesson3{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int m = 1;
		double fact1 = 1;
		double fact2 = 1;
		double sum = 0;

		for (int i = 1; i<= n; i++){
			if (m - 1 == 0) {

			}
			else {
				for (int j = 1; j<= m-1; j++){
					fact1 *= j;
				}
				Math.pow(fact1, 2);

				for (int j = 1; j<=m; j++){
					fact2 *= 2*j;
				}

				sum += fact1/fact2;

			}
			System.out.println(sum);

		}
	}	
}	