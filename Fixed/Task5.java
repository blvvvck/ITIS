//29 

public class Task5 {
    public static void main(String[] args){

        String firstStr = args[0];
        String secondStr = args[1];
        int firstLen = firstStr.length();
        int secondLen = secondStr.length();
        char [] firstArr = firstStr.toCharArray();
        char [] secondArr = secondStr.toCharArray();
        int count = 0;

        if (firstLen == 0 || secondLen == 0  ){
            System.out.println("Length must be > 0");
        }

        if (firstLen < secondLen){
            System.out.println("Second array must be < first array");
        }

        for (int i = 0; i < firstLen; i++){
            if (firstArr[i] == secondArr[0]){
                for (int j = 0; j < secondLen; j++) {
                    if (firstArr[i + j] == secondArr[j]) {
                        count++;
                    } else {
                        break;
                    }

                }

                if (count == secondLen){
                    System.out.println("First entry: " + (i+1)); //чтобы было понятно юзеру, так как считает с нуля
                    System.exit(0);
                }
                else {
                    count = 0;
                }

            }
        }
        System.out.println("First string doesn't entry!");
    }
}
