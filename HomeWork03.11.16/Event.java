import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Event {

    String name;
    String dayOfWeek;
    GregorianCalendar gregorianCalendar;
    SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd MMM yyyy hh:mm aa");
    String info;

    Event(String name,int date,int month,int year, String dayOfWeek, int hourOfDay, int minute, String info){
        this.name = name;
        this.dayOfWeek = dayOfWeek;
        this.gregorianCalendar = new GregorianCalendar(year,month-1,date,hourOfDay,minute);
        this.info = info;
    }

    public void printInfo() {
        System.out.println(this.dayOfWeek);
        System.out.println(simpleDateFormat.format(gregorianCalendar.getTime()));
        System.out.println(this.name);
        System.out.println(this.info);
    }
}