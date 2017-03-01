import java.util.Scanner;
import java.util.GregorianCalendar;

public class ListOfEvents {

    Event [] Events = new Event[1000];
    int index = 0;
    Event eventDefault = new Event("Default", 01, 01, 0001, "Monday", 00, 00, "Default info");

    ListOfEvents() {
        for (int j = 0; j < Events.length; j++) {
            Events[j] = eventDefault;
        }
    }

        public void add(){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Description of the event:");
            String info = scanner.nextLine();
            System.out.println("Enter name of the event:");
            String name = scanner.nextLine();
            System.out.println("Enter date:");
            String date = scanner.next();
            System.out.println("Enter day of week:");
            String dayOfWeek = scanner.next();
            System.out.println("Enter time:");
            String time = scanner.next();
            Scanner delimiter = new Scanner(date).useDelimiter("/");
            Scanner delimiter1 = new Scanner(time).useDelimiter(":");
            Event e = new Event(name,delimiter.nextInt(),delimiter.nextInt(),delimiter.nextInt(),
                    dayOfWeek,delimiter1.nextInt(),delimiter1.nextInt(),info);
            e.printInfo();
            delimiter.close();
            delimiter1.close();

            Events[index] = e;
            index++;
        }

    public  void  del(String name){
        for (Event event : Events)
            if (event.name.equals(name)) {
                event = eventDefault;
            }
    }

    public void print1MeetUp(String name){
        for (Event event : Events){
            if (event.name.equals(name))event.printInfo();
        }
    }

    public void printByDay(GregorianCalendar gregorianCalendar){
        for (Event event : Events){
            if (event.gregorianCalendar.equals(gregorianCalendar))event.printInfo();
        }
    }

    public void printAll(){
        for (int i = 0;i<index;i++) {
            if (Events[i].dayOfWeek.equals("Monday")) {
                if (Events[i].name.equals("Default")) System.out.println();
                else Events[i].printInfo();
            }
            if (Events[i].dayOfWeek.equals("Tuesday")) {
                if (Events[i].name.equals("Default")) System.out.println();
                else Events[i].printInfo();
            }
            if (Events[i].dayOfWeek.equals("Wednesday")) {
                if (Events[i].name.equals("Default")) System.out.println();
                else Events[i].printInfo();
            }
            if (Events[i].dayOfWeek.equals("Thursday")) {
                if (Events[i].name.equals("Default")) System.out.println();
                else Events[i].printInfo();
            }
            if (Events[i].dayOfWeek.equals("Friday")) {
                if (Events[i].name.equals("Default")) System.out.println();
                else Events[i].printInfo();
            }
            if (Events[i].dayOfWeek.equals("Saturday")) {
                if (Events[i].name.equals("Default")) System.out.println();
                else Events[i].printInfo();
            }
            if (Events[i].dayOfWeek.equals("Sunday")) {
                if (Events[i].name.equals("Default")) System.out.println();
                else Events[i].printInfo();
            }
        }
    }

}