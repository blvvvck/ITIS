public class Lesson3b{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		double fact1 = 1;
		double fact2 = 1;
		double fact3 = 1;
		int s1 = 1; // числитель
		int s2 = 1; // знаменатель

		for (int m = 1; m <= n; m++){
			if ( m-1 == 0) {
				fact1 = 1;
			}
			else{
				for (int i = m; i<=n; i++){
					fact1 *= i;
					fact1 = Math.pow(fact1, 2);
				}
			}

			for (int j = m; j <= n; j++){
				fact2 *= 2;
				fact2 *= j;

			}

			fact3 += fact1/fact2;

			System.out.println(fact3-1);

		}	

		
		
	}
}