package com.company;

public class Bureau {
    private int numberOfDrawers;
    private String finish;
    private int height;
    private String manufacturer;
    private int legs;
    private int width;
    private int length;

    public Bureau(int numberOfDrawers, String finish, int height, String manufacturer, int legs, int width, int length) {
        this.numberOfDrawers = numberOfDrawers;
        this.finish = finish;
        this.height = height;
        this.manufacturer = manufacturer;
        this.legs = legs;
        this.width = width;
        this.length = length;
    }

    public Bureau(int numberOfDrawers, String finish, int height, int width, int length) {
        this.numberOfDrawers = numberOfDrawers;
        this.finish = finish;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void cleanOutBureau(String dayOfWeek) {
        System.out.println("Fold and re-arrange clothes every " + dayOfWeek + ".");
    }

    public int getNumberOfDrawers() {
        return numberOfDrawers;
    }

    public String getFinish() {
        return finish;
    }

    public int getHeight() {
        return height;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getLegs() {
        return legs;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}


