//27

public class Task3 {
    public static void main(String[] args){

        int [] firstArr = {312, 412, 4, 3, 6, 8, 5, 3, 8, 9};
        int [] secondArr = {3, 6, 8};
        int firstLen = firstArr.length;
        int secondLen = secondArr.length;
        int count = 0;

        if (firstLen == 0 || secondLen == 0  ){
            System.out.println("Length must be > 0");
            System.exit(0);
        }

        if (firstLen < secondLen){
            System.out.println("Second array must be < first array");
            System.exit(0);
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
                    System.out.println("First entry: " + (i+1));// чтобы юзеру было понятно, так как считаем с 0
                    System.exit(0);
                }
                else {
                    count = 0;
                }

            }
        }
        System.out.println("Array doesn't entry!");
    }
}
