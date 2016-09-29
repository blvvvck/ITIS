public class HomeWork4 {
	public static void main (String[] args){
		double x = Double.parseDouble(args[0]); // координата введенной точки
		double y = Double.parseDouble(args[1]); // координата введенной точки
		double x0 = Double.parseDouble(args[2]);  //координата окружности
		double y0 = Double.parseDouble(args[3]);  // координата окружности
		double r = Double.parseDouble(args[4]);  //радиус
		double l; // длинна отрезка между центром окружности и точкой
		l = Math.sqrt(Math.pow(x-x0, 2) + Math.pow(y-y0, 2));
		if (l <= r) {
			System.out.println("Point lies in the circle");
		}
		else {
			System.out.println("Point doesn't lie in the circle");
		}

	}
}