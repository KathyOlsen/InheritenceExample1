package com.company;

import com.company.*;

import java.util.ArrayList;

public class SoftwareDatabase {
    private Software software;

    private ArrayList<Software> softs;

    public SoftwareDatabase(){
        software = new Software();
        softs = new ArrayList<>();

        softs.add(new Software("Fi","Windows","Program 1234","Spreadsheet",999.99));

    }

    public void printAllSoftware(ArrayList<Software> softs){
        for(Software software : softs) {
            System.out.println(software.toStringSoft());
        }
    }

    public ArrayList<Software> getSofts() {
        return softs;
    }

    public void setSofts(ArrayList<Software> softs) {
        this.softs = softs;
    }

}
