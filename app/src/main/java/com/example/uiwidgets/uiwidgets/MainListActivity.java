package com.example.uiwidgets.uiwidgets;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by jeanniel
 */
public class MainListActivity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(R.string.app_name);

        // Create a new Adapter containing a list of colors
        // Set the adapter on this ListActivity's built-in ListView
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.widget_items)));

        ListView lv = getListView();

        // Enable filtering when the user types in the virtual keyboard
        lv.setTextFilterEnabled(true);

        // Set an setOnItemClickListener on the ListView
        lv.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent();

                switch (position) {
                    case 0:
                        intent.setClass(view.getContext(), ButtonActivity.class);
                        startActivity(intent);
                    case 1:
                        intent.setClass(view.getContext(), RadioGroupActivity.class);
                        startActivity(intent);
                    case 2:
                        intent.setClass(view.getContext(), DatePickerActivity.class);
                        startActivity(intent);

                }


            }
        });
    }
}