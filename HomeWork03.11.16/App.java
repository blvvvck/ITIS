import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class App {

    public static void main(String[] args) {

        welcome();
        App();


    }

    public static void welcome() {
        User u = new User();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        u.setName(sc.nextLine());
        System.out.println("Hello " + u.getName() + "!");

        Calendar c1 = new GregorianCalendar();
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Today is: " + format1.format(c1.getTime()));
        System.out.println("Write command");
    }

    public static void App() {
        ConsoleInterface ci = new ConsoleInterface(System.in, System.out);
        ListOfEvents list = new ListOfEvents();
        Scanner sc = new Scanner(System.in);

        while (!ci.askedForExit()) {

            switch (ci.getLastInput()) {
                case "help":
                    showHelp(ci);
                    break;
                case "new":
                    list.add();
                    break;
                case "read_all":
                    list.printAll();
                    break;
                case "read_byDay":
                    System.out.println("print date:");

                    String date = sc.next();
                    Scanner delimiter = new Scanner(date).useDelimiter("/");
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(delimiter.nextInt(),
                            delimiter.nextInt(),delimiter.nextInt());
                    list.printByDay(gregorianCalendar);
                    break;
                case "read_byName":
                    System.out.println("print name of meet up:");
                    list.print1MeetUp(sc.nextLine());
                    break;
                case "delete":
                    System.out.println("print name of meet up:");
                    list.del(sc.nextLine());
                    break;
                default:
                    System.out.println("Unknown command");
                    showHelp(ci);
            }
        }
    }

    public static void showHelp(ConsoleInterface ci) {
        System.out.println("Available commands: help, new, read_all, read_byName, read_byDay, delete. For exit type " + ci.getExitCommand() + ".");
    }

}