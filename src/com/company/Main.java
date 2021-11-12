package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bureau brandedBureau = new Bureau(6, "white", 58, "Sears", 4, 21, 32   );
        Bureau bureau = new Bureau(4, "black", 24, 15, 24);
        Room1 room1 = new Room1(1, "carpet", new TV("B1", "LG", 32), 2, true, bureau, new Lamp(60, 2, "Round", "Silver"));
        room1.turnOffLights();
        System.out.println(room1.getBureau().getNumberOfDrawers());
        room1.turnOffLights();
    }
}
