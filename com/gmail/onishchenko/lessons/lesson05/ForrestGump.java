package com.gmail.onishchenko.lessons.lesson05;

public class ForrestGump {
    public static void main(String[] args) {
        int menPower = 42;
        int dangerLevel = 42;

        System.out.println("Men's poser is " + menPower);
        if (menPower > dangerLevel) {
            System.out.println("!!! DANGER!!!");
            System.out.println("Run, Forrest, run!!!");
        } else {
            System.out.println("All FINE)");
        }

        System.out.println("The end");
    }
}
