import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ListOfEvents {
    private static ArrayList<Event> events = new ArrayList<>();
    private int size = 0;
    private final String file = "db.csv";

    public  void addNewEvent(Event event){
        events.add(event);
        size++;
    }

    public void writeOnFile() {
        try {
            for (int i = 0; i < this.size; i++) {
                FileWriter fw = new FileWriter(file, true);
                fw.write(events.get(i).toString());
                fw.write("\n");
                fw.flush();
                fw.close();
            }
        } catch (IOException e) {
            System.out.println("Error created");
        }
    }

    public  void getAllEvents(){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (events.get(i).lasting == 0) {
                System.out.println("Число : " + events.get(i).date.get(Calendar.DAY_OF_MONTH) + "/" + (events.get(i).date.get(Calendar.MONTH)+1) +
                "/" + events.get(i).date.get(Calendar.YEAR));
                System.out.println("Название: " + events.get(i).getName());
                System.out.println("Описание: " + events.get(i).getInfo());
                count++;
                System.out.println();
            } else {
                System.out.println("Число : " + events.get(i).date.get(Calendar.DAY_OF_MONTH) + "/" + (events.get(i).date.get(Calendar.MONTH)+1) +
                        "/" + events.get(i).date.get(Calendar.YEAR));
                System.out.println("Продолжительность: " + events.get(i).date.get(Calendar.HOUR_OF_DAY) + ":" +
                events.get(i).date.get(Calendar.MINUTE) + " - " + (events.get(i).date.get(Calendar.HOUR_OF_DAY) + events.get(i).lasting) +
                ":" + events.get(i).date.get(Calendar.MINUTE));
                System.out.println("Название: " + events.get(i).getName());
                System.out.println("Описание: " + events.get(i).getInfo());
                System.out.println();
                count++;
            }
        }
        if (count == 0 ){
            System.out.println("Ни одного события не было добавлено.");
        }
    }

    public  int getSize() {
        return events.size();
    }


    public void getByDay(Calendar newDate){
        int count = 0;
        for (int i = 0; i < size; i++){
            if ((events.get(i).date.get(Calendar.MONTH)) == newDate.get(Calendar.MONTH) &&
                    (events.get(i).date.get(Calendar.DAY_OF_MONTH)) == newDate.get(Calendar.DAY_OF_MONTH) &&
                    (events.get(i).date.get(Calendar.YEAR)) == newDate.get(Calendar.YEAR)){
                if(events.get(i).lasting == 0){
                    System.out.println("Число : " + events.get(i).date.get(Calendar.DAY_OF_MONTH) + "/" + (events.get(i).date.get(Calendar.MONTH)+1) +
                            "/" + events.get(i).date.get(Calendar.YEAR));
                    System.out.println("Название: " + events.get(i).getName());
                    System.out.println("Описание: " + events.get(i).getInfo());
                    count++;
                    System.out.println();
                }
                else{
                    System.out.println("Число : " + events.get(i).date.get(Calendar.DAY_OF_MONTH) + "/" + (events.get(i).date.get(Calendar.MONTH)+1) +
                            "/" + events.get(i).date.get(Calendar.YEAR));
                    System.out.println("Продолжительность: " + events.get(i).date.get(Calendar.HOUR_OF_DAY) + ":" +
                            events.get(i).date.get(Calendar.MINUTE) + " - " + (events.get(i).date.get(Calendar.HOUR_OF_DAY) + events.get(i).lasting) +
                            ":" + events.get(i).date.get(Calendar.MINUTE));
                    System.out.println("Название: " + events.get(i).getName());
                    System.out.println("Описание: " + events.get(i).getInfo());
                    count++;
                    System.out.println();
                }
            }
        }
        if (count == 0){
            System.out.println("Вы еще не добавили событий.");
        }
    }

    public void getToday(){
        Calendar c1 = new GregorianCalendar();
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        format1.format(c1.getTime());
        int count = 0;
        for (int i = 0; i < size; i++){
            if((events.get(i).date.get(Calendar.DAY_OF_MONTH)) == c1.get(Calendar.DAY_OF_MONTH) &&
                    (events.get(i).date.get(Calendar.MONTH)) == c1.get(Calendar.MONTH) &&
                    (events.get(i).date.get(Calendar.YEAR)) == c1.get(Calendar.YEAR)){
                if(events.get(i).lasting == 0){
                    System.out.println("Число : " + events.get(i).date.get(Calendar.DAY_OF_MONTH) + "/" + (events.get(i).date.get(Calendar.MONTH)+1) +
                            "/" + events.get(i).date.get(Calendar.YEAR));
                    System.out.println("Название: " + events.get(i).getName());
                    System.out.println("Описание: " + events.get(i).getInfo());
                    count++;
                    System.out.println();
                }
                else{
                    System.out.println("Число : " + events.get(i).date.get(Calendar.DAY_OF_MONTH) + "/" + (events.get(i).date.get(Calendar.MONTH)+1) +
                            "/" + events.get(i).date.get(Calendar.YEAR));
                    System.out.println("Продолжительность: " + events.get(i).date.get(Calendar.HOUR_OF_DAY) + ":" +
                            events.get(i).date.get(Calendar.MINUTE) + " - " + (events.get(i).date.get(Calendar.HOUR_OF_DAY) + events.get(i).lasting) +
                            ":" + events.get(i).date.get(Calendar.MINUTE));
                    System.out.println("Название: " + events.get(i).getName());
                    System.out.println("Описание: " + events.get(i).getInfo());
                    count++;
                    System.out.println();
                }

            }
        }
        if (count == 0){
            System.out.println("Сегодня событий нет.");
        }
    }

    public void getByPeriod(Calendar newDate, int hour, int minute){
        int count = 0;
        for (int i = 0; i < size; i++){
            if ((events.get(i).date.get(Calendar.MONTH)) == newDate.get(Calendar.MONTH) &&
                    (events.get(i).date.get(Calendar.DAY_OF_MONTH)) == newDate.get(Calendar.DAY_OF_MONTH) &&
                    (events.get(i).date.get(Calendar.YEAR)) == newDate.get(Calendar.YEAR)){
                int start = newDate.get(Calendar.HOUR_OF_DAY) * 60 + newDate.get(Calendar.MINUTE);
                int end = (events.get(i).date.get(Calendar.HOUR_OF_DAY) + events.get(i).getLasting() * 60 +
                        events.get(i).date.get(Calendar.MINUTE));
                if(events.get(i).getLasting() == 0){
                    System.out.println("Число : " + events.get(i).date.get(Calendar.DAY_OF_MONTH) + "/" + (events.get(i).date.get(Calendar.MONTH)+1) +
                            "/" + events.get(i).date.get(Calendar.YEAR));
                    System.out.println("Название: " + events.get(i).getName());
                    System.out.println("Описание: " + events.get(i).getInfo());
                    count++;
                    System.out.println();
                } else if ((start >= end) && (end <= (hour * 60 + minute)) || ((end - events.get(i).getLasting() *60 )
                        >= start) && ((end - events.get(i).getLasting()*60) <= (hour * 60 + minute))){
                    System.out.println("Число : " + events.get(i).date.get(Calendar.DAY_OF_MONTH) + "/" + (events.get(i).date.get(Calendar.MONTH)+1) +
                            "/" + events.get(i).date.get(Calendar.YEAR));
                    System.out.println("Продолжительность: " + events.get(i).date.get(Calendar.HOUR_OF_DAY) + ":" +
                            events.get(i).date.get(Calendar.MINUTE) + " - " + (events.get(i).date.get(Calendar.HOUR_OF_DAY) + events.get(i).lasting) +
                            ":" + events.get(i).date.get(Calendar.MINUTE));
                    System.out.println("Название: " + events.get(i).getName());
                    System.out.println("Описание: " + events.get(i).getInfo());
                    count++;
                    System.out.println();

                }
            }
        }
        if (count == 0) {
            System.out.println("За данный период событий не найдено.");
        }
    }


}
