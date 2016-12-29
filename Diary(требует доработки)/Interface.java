
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Interface {
    /*public static void controler(){
        Scanner sc = new Scanner(System.in);
        String op = " ";
        ListOfEvents list = new ListOfEvents();
        Event e = new Event();
        while (!op.equals("0")){
            op = sc.nextLine();
            switch (op) {
                //case "help":
                  //  showHelp();
                    //break;
                case "1":
                    e.setHour(00);
                    e.setMinute(00);
                    e.setLasting(0);
                    System.out.println("Введите имя события");
                    e.setName(sc.nextLine());
                    System.out.println("Введите описание вашего событя");
                    e.setInfo(sc.nextLine());
                    System.out.println("Введите год");
                    e.setYear(sc.nextInt());
                    System.out.println("Введите номер месяца");
                    e.setMonth(sc.nextInt()-1);
                    System.out.println("Введите число");
                    e.setDay(sc.nextInt());
                    e.date = new GregorianCalendar(e.getYear(), e.getMonth(), e.getDay());
                    Event ev = new Event(e.getName(),e.getInfo(), e.getDate(), e.getLasting());
                    list.addNewEvent(ev);
                    break;
                case "2":
                    System.out.println("Введите имя события");
                    e.setName(sc.nextLine());
                    System.out.println("Введите описание вашего событя");
                    String info = sc.nextLine();
                    e.setInfo(info);
                    System.out.println("Введите год");
                    e.setYear(sc.nextInt());
                    System.out.println("Введите номер месяца");
                    e.setMonth(sc.nextInt()-1);
                    System.out.println("Введите число");
                    e.setDay(sc.nextInt());
                    System.out.println("Введите час события");
                    e.setHour(sc.nextInt());
                    System.out.println("Введите минуты");
                    e.setMinute(sc.nextInt());
                    System.out.println("Введите продолжительность события");
                    e.setLasting(sc.nextInt());
                    e.date = new GregorianCalendar(e.getYear(), e.getMonth(), e.getDay(), e.getHour(), e.getMinute());
                    Event eve = new Event(e.getName(),e.getInfo(), e.getDate(), e.getLasting());
                    list.addNewEvent(eve);
                    break;
                case "3":
                    list.getAllEvents();
                    break;
                case "4":
                    System.out.println("Введите год");
                    int tempYear = sc.nextInt();
                    System.out.println("Введите месяц");
                    int tempMonth = sc.nextInt()-1;
                    System.out.println("Введите число");
                    int tempDay = sc.nextInt();
                    Calendar tempDate = new GregorianCalendar(tempYear, tempMonth, tempDay);
                    list.getByDay(tempDate);
                    break;
                case "5":
                    list.getToday();
                    break;
                default:
                    System.out.println("Неизвестная команда");
                   // showHelp();
                    break;
            }
        }
    }*/

    public static void controler2(){
        Scanner sc = new Scanner(System.in);
        String op = " ";
        ListOfEvents list = new ListOfEvents();
        Event e = new Event();
        boolean exit = false;
        do{
            op = sc.nextLine();
            switch (op) {
                case "help": {
                    showHelp();
                    break;
                }
                case "1": {
                    e.setHour(00);
                    e.setMinute(00);
                    e.setLasting(0);
                    System.out.println("Введите название события:");
                    e.setName(sc.nextLine());
                    System.out.println("Введите описание вашего события:");
                    e.setInfo(sc.nextLine());
                    System.out.println("Введите год:");
                    e.setYear(sc.nextInt());
                    System.out.println("Введите месяц месяца:");
                    e.setMonth(sc.nextInt() - 1);
                    System.out.println("Введите число:");
                    e.setDay(sc.nextInt());
                    e.date = new GregorianCalendar(e.getYear(), e.getMonth(), e.getDay());
                    Event ev = new Event(e.getName(), e.getInfo(), e.getDate(), e.getLasting());
                    list.addNewEvent(ev);
                    System.out.println("Событие успешно добавлено.");
                    break;
                }
                case "2": {
                    System.out.println("Введите название события:");
                    e.setName(sc.nextLine());
                    System.out.println("Введите описание вашего события:");
                    String info = sc.nextLine();
                    e.setInfo(info);
                    System.out.println("Введите год:");
                    e.setYear(sc.nextInt());
                    System.out.println("Введите месяц(от 1 до 12):");
                    e.setMonth(sc.nextInt() - 1);
                    System.out.println("Введите число(от 1 до 31):");
                    e.setDay(sc.nextInt());
                    System.out.println("Введите час события(от 0 до 24):");
                    e.setHour(sc.nextInt());
                    System.out.println("Введите минуты(от 00 до 59):");
                    e.setMinute(sc.nextInt());
                    System.out.println("Введите продолжительность события(в часах):");
                    e.setLasting(sc.nextInt());
                    e.date = new GregorianCalendar(e.getYear(), e.getMonth(), e.getDay(), e.getHour(), e.getMinute());
                    Event eve = new Event(e.getName(), e.getInfo(), e.getDate(), e.getLasting());
                    list.addNewEvent(eve);
                    System.out.println("Событие успешно добавлено.");
                    break;
                }
                case "3": {
                    list.getAllEvents();
                    break;
                }
                case "4": {
                    System.out.println("Введите год:");
                    int tempYear = sc.nextInt();
                    System.out.println("Введите месяц(от 1 до 12):");
                    int tempMonth = sc.nextInt() - 1;
                    System.out.println("Введите число(от 1 до 31):");
                    int tempDay = sc.nextInt();
                    Calendar tempDate = new GregorianCalendar(tempYear, tempMonth, tempDay);
                    list.getByDay(tempDate);
                    System.out.println();
                    break;
                }
                case "5": {
                    list.getToday();
                    break;
                }
                case "6":{
                    System.out.println("Введите год:");
                    int tempYear = sc.nextInt();
                    System.out.println("Введите месяц(от 1 до 12):");
                    int tempMonth = sc.nextInt();
                    System.out.println("Введите число(от 1 до 31):");
                    int tempDay = sc.nextInt();
                    System.out.println("Введите начало периода(час):");
                    int tempHour = sc.nextInt();
                    System.out.println("Введите начало периода(минуты):");
                    int tempMinute = sc.nextInt();
                    System.out.println("Введите окончание периода(час):");
                    int tempEndHour = sc.nextInt();
                    System.out.println("Введите окончание периода(минуты):");
                    int tempEndMinute = sc.nextInt();
                    Calendar tempDate = new GregorianCalendar(tempYear, tempMonth, tempDay, tempHour, tempMinute);
                    list.getByPeriod(tempDate, tempHour, tempMinute);
                    break;
                }
                case "0": {
                    exit = true;
                    list.writeOnFile();
                    break;
                }
                default: {
                    System.out.print("");
                    // showHelp();
                    break;
                }
            }
            if (exit) {
                break;
            }
        }
        while (!op.equals("0"));
    }


    public static void showHelp( ) {

        System.out.println("|                   Чтобы добавить новое событие без учета времени, введите 1                         |");
        System.out.println("|                   Чтобы добавить новое событие с продолжительностью, введите 2                  |");
        System.out.println("|                   Чтобы вывести на экран все события, введите 3                     |");
        System.out.println("|                   Чтобы найти события по дате, введите 4                     |");
        System.out.println("|                   Чтобы посмотреть события, запланированные на сегодня, введите 5                    |");
        System.out.println("|                   Чтобы посмотреть события за период, введите 6                    |");
        System.out.println("|                   Чтобы записать события в файл, введите 7                    |");

        System.out.println("|                   Чтобы выйти из программы, введите 0                   |");

        System.out.println("|                   Чтобы вывести окно помощи еще раз, введите help                 |");

    }
}

