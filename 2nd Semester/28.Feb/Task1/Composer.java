package Task1;

import java.util.Calendar;

public class Composer implements Comparable<Composer> {
    private String name;
    private Calendar date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public int compareTo(Composer o) {
        return name.compareTo(o.getName());
    }
}
