// НАХОЖДЕНИЕ К-ГО ЭЛЕМЕНТА ПРОГРЕССИИ
public class Lesson4{
	public static void main (String[] args){
		int a1 = Integer.parseInt(args[0]);
		int a2 = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]); //какой член нужно найти
		int ak = 1; //значение этого элемента
		ak = a1+(a2-a1)*(k-1);
		System.out.println("K-ый элемент равен " + ak);
	}
}