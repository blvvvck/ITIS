import java.util.Scanner;

public class Task4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line: ");
        String str = sc.nextLine();
        checkString(str);
        
    }

    public static void checkString(String str) {
        int k = 0;
        for (char symbol : str.toCharArray()){
            if (symbol=='(') k++;
            if (symbol==')') k--;
            if (k<0) break;

        }
        if (k!=0){
            System.out.println(str+ "  placed incorrectly ");
        } else {
            System.out.println(str+"  placed correctly");
        }
    }

}