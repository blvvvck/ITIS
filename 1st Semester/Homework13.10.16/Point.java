import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Point   {

    int x0;
    int y0;
    int x;
    int y;
    int array[] = new int[4];

    public void addPointValueScanner() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++){
            System.out.println("Enter coordinate number "+ (i+1));
            array[i] = scanner.nextInt();
        }

        x0 = array[0];
        y0 = array[1];
        x = array[2];
        y = array[3];

    }


    public void addPointValueFile() throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            x0 = scanner.nextInt();
            y0 = scanner.nextInt();
            x = scanner.nextInt();
            y = scanner.nextInt();
        }


    }


}
