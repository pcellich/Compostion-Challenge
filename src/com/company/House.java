package com.company;

public class House {
    private int rooms;
    private Room1 room1;
    private String suburb;
    private int levels;

    public House(int rooms, Room1 room1, String suburb, int levels) {
        this.rooms = rooms;
        this.room1 = room1;
        this.suburb = suburb;
        this.levels = levels;
    }

    public int getRooms() {
        return rooms;
    }

    public Room1 getRoom1() {
        return room1;
    }

    public String getSuburb() {
        return suburb;
    }

    public int getLevels() {
        return levels;
    }
}
