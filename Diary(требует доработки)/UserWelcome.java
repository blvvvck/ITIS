import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class UserWelcome {
    String name;

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public static void welcome(){
        UserWelcome u = new UserWelcome();
        Scanner sc = new Scanner(System.in);

        System.out.print("Пожалуйста, введите свое имя: ");
        u.setName(sc.nextLine());

        Calendar c1 = new GregorianCalendar();
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("+-----------------------------------------------------------------------------------+");
        System.out.println();

        System.out.println("|                                    Привет " + u.getName()  + "                                   |");
        System.out.println("|                                 Сегодня: " + format1.format(c1.getTime()) + "                               |");

        Interface.showHelp();;
        System.out.println("+-----------------------------------------------------------------------------------+");
        System.out.print("Ваша команда: ");
    }
}