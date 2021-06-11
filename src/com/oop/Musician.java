package com.oop;

public class Musician {
    String name;
    String country;
    String style;
    int timePeriod;


    public Musician(String name, String country, String style, int timePeriod) {
        this.name = name;
        this.country = country;
        this.style = style;
        this.timePeriod = timePeriod;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Style: " + style);
        System.out.println("timePeriod: " + timePeriod);
        System.out.println("\n");

    }
}

