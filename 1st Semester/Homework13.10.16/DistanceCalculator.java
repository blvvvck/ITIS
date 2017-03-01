import java.io.FileNotFoundException;
import java.util.Scanner;

public class DistanceCalculator {


     static double getResult() throws FileNotFoundException {
        Point point = new Point();

        int choice = 0;

    	Scanner scanner = new Scanner(System.in);

    	System.out.println("Select 1 of 2 variants: from file(0) or from scanner(1)");

    	choice = scanner.nextInt();

    	if (choice == 0) {
    		point.addPointValueFile();
    	}

    	if (choice == 1) {
    		point.addPointValueScanner();
    	}

        double result = Math.sqrt((Math.pow(point.x0 - point.y0, 2)) + (Math.pow(point.x - point.y,2)));

        return result;
    }
}