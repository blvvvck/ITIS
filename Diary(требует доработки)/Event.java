import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Event {

    protected String name;
    protected String info;
    protected Calendar date = new GregorianCalendar();
    protected int lasting;
    protected int year;
    protected int day;
    protected int month;
    protected int hour;
    protected int minute;

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }


        Event(String name, String info, Calendar date, int lasting ){
            this.name = name;
            this.info = info;
            this.date = date;
            this.lasting = lasting;
        }

        Event() {}

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public Calendar getDate(){
        return date;
    }

    public int getLasting() {
        return lasting;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setLasting(int lasting) {
        this.lasting = lasting;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }


}

