// ЧИСЛО В ДВОИЧНОМ ПРЕДСТАВЛЕНИИ И КОЛ-ВО ЕДИНИЦ В НЕМ
public class Lesson5{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int s = 0; // отвечает за перевод в двоичную систему
		int s1 = 0; // отвечает за кол-во единиц
		int a1 = 0; // отвечает за остаток

			while (a >= 1){
				a1 = a % 2;
				s = s*10 + a1;
				a = a / 2;
				if (a1 == 1){
					s1 = s1 + 1;
				}
			}
				

		System.out.println("Единиц в двоичном представлении числа " + s1);
		System.out.println("Число в двоичной системе " + s);
	}
}