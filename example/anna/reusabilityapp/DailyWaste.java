package com.example.anna.reusabilityapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by anna on 3/31/18.
 */

public class DailyWaste {
    ArrayList<Disposables> dailyWaste;
    String id;
    int dayOfWeek;


    public DailyWaste(){
        dailyWaste = new ArrayList<Disposables>();
        dailyWaste.add(new Trash());
        dailyWaste.add(new Recycling());
        dailyWaste.add(new Compost());

        Calendar cal = Calendar.getInstance();
        dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date today = new Date();
        id = dateFormat.format(today);
    }

    public int dailyTotalWaste(){
        int totalWaste = 0;
        for (Disposables disposables: dailyWaste){
            totalWaste+= disposables.getCounter();
        }
        return totalWaste;
    }

    public int dailyTotalPoints(){
        return -2* dailyWaste.get(0).getCounter() + dailyTotalWaste();

    }
}
