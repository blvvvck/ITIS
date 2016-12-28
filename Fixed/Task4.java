//28

public class Task4 {

    public static void main(String[] args) {
        String firstStr = args[0];
        String secondStr = args[1];
        int firstLen = firstStr.length();
        int secondLen = secondStr.length();
        char[] firstArr = firstStr.toCharArray();
        char[] secondArr = secondStr.toCharArray();
        int minLength = 0;
        int count = 0;

        if (firstLen == 0 || secondLen == 0) {
            System.out.print("String length must be > 0");
            System.exit(0);

            if (secondStr.length() > firstStr.length()) {
                minLength = firstStr.length();
                count = 1;
            } else {
                minLength = secondStr.length();
                count = 2;
            }
        }    
            boolean flag = true;
            for (int i = 0; i < minLength; i++) {
                if (secondArr[i] < firstArr[i]) {
                    flag = false;
                    System.out.println("First string > second string");
                    break;
                } else if (secondArr[i] > firstArr[i]) {
                    flag = false;
                    System.out.println("First string < second string");
                    break;
                }
            }
            if (flag) {
                if (count == 1) {
                    System.out.println("First string > second string");
                } else {
                    System.out.println("First string < second string");
                }
            }
        
    }
}
