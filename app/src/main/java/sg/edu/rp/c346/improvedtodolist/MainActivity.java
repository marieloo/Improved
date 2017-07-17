package sg.edu.rp.c346.improvedtodolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    ListView lvToDo;
    ArrayList<ToDoItem> toDoList;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvToDo=(ListView)findViewById(R.id.listViewToDo);

        toDoList = new ArrayList<ToDoItem>();

        caToDo = new CustomAdapter(this, R.layout.todoitem_row, toDoList);

        lvToDo.setAdapter(caToDo);


        Calendar d1 = Calendar.getInstance(); //Create a Calendar object with current date/time
        d1.set(2016,10,1); //Set it to a new date
        ToDoItem item1 = new ToDoItem("MSA",d1); //Create a ToDoItem object named item1
        toDoList.add(item1);  //Add the ToDoItem object to the toDoList ArrayList

        Calendar d2 = Calendar.getInstance();
        d2.set(2016,9,20);
        ToDoItem item2 = new ToDoItem("Go for haircut",d2);
        toDoList.add(item2);

    }
}
