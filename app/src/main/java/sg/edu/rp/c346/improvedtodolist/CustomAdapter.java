package sg.edu.rp.c346.improvedtodolist;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> toDoList;

    public CustomAdapter(Context context,int resource,ArrayList<ToDoItem> objects){
        super(context,resource,objects);
        parent_context=context;
        layout_id=resource;
        toDoList=objects;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Obtain the LayoutInflater object
        //Standard code don't need to modify
        LayoutInflater inflater =(LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //Inflate a new view hierarchy from the specified xml source (layout_id)
        //and return the root View of the inflated hierarchy
        View rowView=inflater.inflate(layout_id,parent,false);

        //Obtain the UI elements and assign to variables
        TextView tvTitle= (TextView) rowView.findViewById(R.id.textViewTitle);
        TextView tvDate = (TextView) rowView.findViewById(R.id.textViewDate);

        // Obtain the to-do item based on the 'position'.
        ToDoItem currentItem = toDoList.get(position);

        // Set the TextView to display corresponding information
        tvTitle.setText(currentItem.getTitle());
        tvDate.setText(currentItem.getDateString());

        //return the View corresponding to the data at the specified position.
        return rowView;


    }
}
