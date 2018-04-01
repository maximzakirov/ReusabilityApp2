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
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private Button trashButton;
    private Button recyclingButton;
    private Button compostButton;
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

        dayListView = (ListView) findViewById(R.id.dayListView);
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,thisWeeksWaste.listOfDays() );
        dayListView.setAdapter(itemsAdapter);

        trashListView = (ListView)findViewById(R.id.trashListView);
        ArrayAdapter<String> itemsAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,thisWeeksWaste.listOfTrash() );
        trashListView.setAdapter(itemsAdapter2);

        recyclingListView = (ListView) findViewById(R.id.recyclingListView);
        ArrayAdapter<String> itemsAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,thisWeeksWaste.listOfRecycling() );
        recyclingListView.setAdapter(itemsAdapter3);

        compostListView = (ListView)findViewById(R.id.compostListView);
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
