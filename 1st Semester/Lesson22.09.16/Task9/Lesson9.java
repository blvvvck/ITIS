//ВСЕ ДЕЛИТЕЛИ ЧИСЛА (ОПТИМАЛЬНО, НО ВЫВОДИТ В НЕПРАВИЛЬНОМ ПОРЯДКЕ)
public class Lesson9{
	public static void main (String[] args){
		int a = Integer.parseInt(args[0]);
		int j = 1;
		int b = 1;

		for (int i = 1; i <= Math.sqrt(a); i++) {
			if (a % i == 0){
				System.out.println(i);
			}
		}

		for (int i = 1; i <= Math.sqrt(a); i++) {
			if (a % i == 0){
				j = a / i;
				System.out.println(j);
			}
		}
	}
}