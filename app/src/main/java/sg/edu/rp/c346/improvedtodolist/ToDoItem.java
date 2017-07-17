package sg.edu.rp.c346.improvedtodolist;


import java.util.Calendar;

public class ToDoItem {
    private String title;



    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    //POINT A Missing Setter and Getter codes
    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }



    public String getDateString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "title='" + title + '\'' +
                ", date=" + getDateString() +
                '}';
    }

}

