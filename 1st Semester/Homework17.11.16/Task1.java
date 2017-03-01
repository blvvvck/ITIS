import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int firstGeneration = 1;
        int amountChildInGeneration = 1;
        int childOfEachPerson = 10;
        int childSum = 0;

        System.out.print("Enter number of generation:");
        Scanner sc = new Scanner(System.in);
        int generation = sc.nextInt();
        if (generation < 0) {
            System.out.println("Generation must be greater than 0");
        }

        System.out.println("Children in generation " + generation + " : "  + amountOfChildren(firstGeneration,
                generation, amountChildInGeneration, childOfEachPerson, childSum));

    }

    static int amountOfChildren(int currentGen, int generation, int amountChildInGeneration, int childOfEachPerson
            , int childSum) {
        if (currentGen > generation) return childSum;
        if (childOfEachPerson < 2) childOfEachPerson = 2;
        amountChildInGeneration *= childOfEachPerson;

        if (currentGen % 2 == 0) {
            childOfEachPerson += 1;
        }
        else{
            childOfEachPerson -= 2;
        }
        
        childSum += amountChildInGeneration;
        return amountOfChildren(currentGen + 1, generation, amountChildInGeneration, childOfEachPerson, childSum);
    }

}
