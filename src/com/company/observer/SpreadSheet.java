package com.company.observer;

public class SpreadSheet implements Observer {

    @Override
    public void update(int value) {
        System.out.println("Spreadsheet got notifed " + value);
    }
}
