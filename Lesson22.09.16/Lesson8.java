// ПОДРЯД ИДУЩИЕ НУЛИ
public class Lesson8 {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int s1 = 0; // отвечает за подряд идущие нули, встретив 1 обнуляется
		int a1 = 0; // отвечает за остаток
		int s1max = 0; // отвечает за кол-во подряд идущих нулей()

			while (a >= 1){
				a1 = a % 2;
				if (a1 == 0){
					s1 = s1 + 1;
					if (s1 > s1max){
						s1max = s1;
					}
				}
				else {
					s1 = 0;
				}
				a /= 2;
					
			}
	System.out.println("Число подряд идущих нулей " + s1max);
}
}