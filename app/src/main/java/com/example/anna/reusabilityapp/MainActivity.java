package com.example.anna.reusabilityapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity{
    private ImageButton trashButton;
    private ImageButton recyclingButton;
    private ImageButton compostButton;
    private ListView dayListView;
    private ListView trashListView;
    private ListView recyclingListView;
    private ListView compostListView;

    private WeeklyWaste thisWeeksWaste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        thisWeeksWaste = new WeeklyWaste();



        trashButton = (ImageButton)findViewById(R.id.trashButton);


//        trashButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Calendar cal = Calendar.getInstance();
//                int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//                /*DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//                Date today = new Date();
//                String id = dateFormat.format(today);*/
//
//                thisWeeksWaste.getWeeklyWaste().get(dayOfWeek).addTrash();
//
//                update();
//            }
//        });

        dayListView = (ListView) findViewById(R.id.dayListView);
        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,thisWeeksWaste.listOfDays() );
        //dayListView.setAdapter(itemsAdapter);

        trashListView = (ListView)findViewById(R.id.trashListView);
        //ArrayAdapter<String> itemsAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,thisWeeksWaste.listOfTrash() );
        //trashListView.setAdapter(itemsAdapter2);

        recyclingListView = (ListView) findViewById(R.id.recyclingListView);
        ///ArrayAdapter<String> itemsAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,thisWeeksWaste.listOfRecycling() );
        //recyclingListView.setAdapter(itemsAdapter3);

        compostListView = (ListView)findViewById(R.id.compostListView);
        //ArrayAdapter<String> itemsAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,thisWeeksWaste.listOfCompost() );
        //compostListView.setAdapter(itemsAdapter4);

        update();


    }
    public void addToWaste(View v){
        if (v.getId() == R.id.trashButton){
            Calendar cal = Calendar.getInstance();
            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)-1;
                /*DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                Date today = new Date();
                String id = dateFormat.format(today);*/

            thisWeeksWaste.getWeeklyWaste().get(dayOfWeek).addTrash();

            update();
        }
        if (v.getId() == R.id.recyclingButton){
            Calendar cal = Calendar.getInstance();
            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)-1;
                /*DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                Date today = new Date();
                String id = dateFormat.format(today);*/

            thisWeeksWaste.getWeeklyWaste().get(dayOfWeek).addRecycling();

            update();
        }
        if (v.getId() == R.id.compostButton){
            Calendar cal = Calendar.getInstance();
            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)-1;
                /*DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                Date today = new Date();
                String id = dateFormat.format(today);*/

            thisWeeksWaste.getWeeklyWaste().get(dayOfWeek).addCompost();

            update();
        }

    }

    public void onCilckListener(View v){

    }

    public void update(){
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,thisWeeksWaste.listOfDays() );
        dayListView.setAdapter(itemsAdapter);

        ArrayAdapter<String> itemsAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,thisWeeksWaste.listOfTrash() );
        trashListView.setAdapter(itemsAdapter2);

        ArrayAdapter<String> itemsAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,thisWeeksWaste.listOfRecycling() );
        recyclingListView.setAdapter(itemsAdapter3);

        ArrayAdapter<String> itemsAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,thisWeeksWaste.listOfCompost() );
        compostListView.setAdapter(itemsAdapter4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
