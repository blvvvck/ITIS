//ВСЕ ДЕЛИТЕЛИ ЧИСЛА (ОПТИМАЛЬНО, НО ВЫВОДИТ ОТ БОЛЬШЕГО К МЕНЬШЕМУ)
public class Lesson9b {
	public static void main (String[] args){
		int a = Integer.parseInt(args[0]);
		int j = 1;
		int b = 1;
		String s = "";
		String s1 = "";

		for (int i = 1; i <= Math.sqrt(a); i++) {
			if (a % i == 0){
				if (a % i == 0 || a % i >= 10) {
					s1 = i + " ";
					StringBuilder sb1 = new StringBuilder(s1);
					s += sb1.reverse();
				}
				else {
					s += " " + i;
				}
			}
		}

		for (int i = 1; i <= Math.sqrt(a); i++) {
			if (a % i == 0){
				j = a / i;
				System.out.print(j + " ");
			}
		}

		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
	}
}
