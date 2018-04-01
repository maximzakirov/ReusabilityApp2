package com.example.anna.reusabilityapp;

import java.util.ArrayList;

public class WeeklyWaste {
    private ArrayList<DailyWaste> weeklyWaste;

    public WeeklyWaste(){
        weeklyWaste = new ArrayList<DailyWaste>();
        for (int i =0; i<7; i++){
            weeklyWaste.add(new DailyWaste());
        }
    }

    public ArrayList<DailyWaste> getWeeklyWaste(){
        return weeklyWaste;
    }

    public int getWeeklyTrash(){
        int weeklyTrash =0;
        for (DailyWaste dailyWaste: weeklyWaste){
            weeklyTrash += dailyWaste.getTrash();
        }
        return weeklyTrash;
    }
    public int getWeeklyRecycling(){
        int weeklyRecycling =0;
        for (DailyWaste dailyWaste: weeklyWaste){
            weeklyRecycling += dailyWaste.getRecycling();
        }
        return weeklyRecycling;
    }
    public int getWeeklyCompost(){
        int weeklyCompost =0;
        for (DailyWaste dailyWaste: weeklyWaste){
            weeklyCompost += dailyWaste.getCompost();
        }
        return weeklyCompost;
    }

    public ArrayList<String> listOfDays(){
        ArrayList<String> days = new ArrayList<String>();
        days.add("DAY");
        days.add("Sun");
        days.add("Mon");
        days.add("Tus");
        days.add("Wed");
        days.add("Thu");
        days.add("Fri");
        days.add("Sat");
        return days;
    }

    public ArrayList<String> listOfTrash(){
        ArrayList<String> trash = new ArrayList<String>();
        trash.add("T");
        for (DailyWaste dailyWaste: weeklyWaste){
            trash.add(""+dailyWaste.getTrash());
        }
        return trash;
    }
    public ArrayList<String> listOfRecycling(){
        ArrayList<String> recycling = new ArrayList<String>();
        recycling.add("R");
        for (DailyWaste dailyWaste: weeklyWaste){
            recycling.add(""+dailyWaste.getRecycling());
        }
        return recycling;
    }
    public ArrayList<String> listOfCompost(){
        ArrayList<String> compost = new ArrayList<String>();
        compost.add("C");
        for (DailyWaste dailyWaste: weeklyWaste){
            compost.add(""+ dailyWaste.getCompost());
        }
        return compost;
    }
}
