import java.util.Scanner;

public class ConsoleInteractor implements UserInteractor {
    
    public ConsoleInteractor() throws UserInteractorException {
    }
    
    @Override
    public String readCommand() throws UserInteractorReadException {
        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();
        return cmd;
    }

    @Override
    public void print(String output) throws UserInteractorWriteException {
        System.out.println(">> " + output);
    }
}
