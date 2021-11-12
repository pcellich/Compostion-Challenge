package com.company;

public class Room1 {
    private int bed;
    private String floor;
    private TV tv;
    private int windows;;
    private boolean hasBathroom;
    private Bureau bureau;
    private Lamp lamp;

    public Room1(int bed, String floor, TV tv, int windows, boolean hasBathroom, Bureau bureau, Lamp lamp) {
        this.bed = bed;
        this.floor = floor;
        this.tv = tv;
        this.windows = windows;
        this.hasBathroom = hasBathroom;
        this.bureau = bureau;
        this.lamp = lamp;
    }

    public void makeBed(int time) {
        System.out.println("Please make sure to make the bed every day at " + time + ".");
    }

    public void turnOffLights () {
        System.out.println("Save on electricity by turning of all lights.");
        openWindows();
    }

    private void openWindows() {
        System.out.println("Open windows to get fresh air and light.");
    }

    public int getBed() {
        return bed;
    }

    public String getFloor() {
        return floor;
    }

    public TV getTv() {
        return tv;
    }

    public int getWindows() {
        return windows;
    }

    public boolean isHasBathroom() {
        return hasBathroom;
    }

    public Bureau getBureau() {
        return bureau;
    }

    public Lamp getLamp() {
        return lamp;
    }
}


//Name
//        /cafe/dbUser
//        Tier
//        Standard
//        Type
//        String
//        Last modified date
//        Thu, 11 Nov 2021 20:53:50 GMT
//        Value
//        root

//Name
//        /cafe/dbName
//        Tier
//        Standard
//        Type
//        String
//        Last modified date
//        Thu, 11 Nov 2021 20:53:49 GMT
//        Value
//        cafe_db

//Name
//        /cafe/dbPassword
//        Tier
//        Standard
//        Type
//        String
//        Last modified date
//        Thu, 11 Nov 2021 20:53:50 GMT
//        Value
//        Re:Start!9

//Name
//        /cafe/dbUrl
//        Tier
//        Standard
//        Type
//        String
//        Last modified date
//        Thu, 11 Nov 2021 20:53:49 GMT
//        Value
//        ec2-54-202-248-145.us-west-2.compute.amazonaws.com


