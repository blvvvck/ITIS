//ФОРМУЛА С ФАКТОРИАЛОМ
public class Lesson2{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int fact = 1;
		if (n == 0) {
			System.out.println("1");
		}
		else{
			for (int i = 1; i<=n; i++){
			fact = fact*i;
			System.out.println(fact);
		}
		}
	}
}