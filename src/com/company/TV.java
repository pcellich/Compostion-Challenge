package com.company;

public class TV {
    private String name;
    private String manufacturer;
    private int size;

    public TV(String name, String manufacturer, int size) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public void powerOn(int time) {
        System.out.println("TV is powering on at " + time + "o'clock");
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }
}
