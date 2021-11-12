package com.company;

public class Lamp {
    private int height;
    private int numOfBulbs;
    private String base;
    private String color;

    public Lamp(int height, int numOfBulbs, String base, String color) {
        this.height = height;
        this.numOfBulbs = numOfBulbs;
        this.base = base;
        this.color = color;
    }

    public void changeBulb(){
        System.out.println("Replace any dead bulb.");
    }

    public int getHeight() {
        return height;
    }

    public int getNumOfBulbs() {
        return numOfBulbs;
    }

    public String getBase() {
        return base;
    }

    public String getColor() {
        return color;
    }
}
