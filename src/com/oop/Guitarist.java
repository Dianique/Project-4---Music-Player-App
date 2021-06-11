package com.oop;

class Guitarist extends Musician {
    String numstrings;

    public Guitarist(String name, String country, String style, int timePeriod, String numstrings) {
        super(name, country, style, timePeriod);
        this.numstrings = numstrings;
    }

    public void show() {

            System.out.println("Top Guitarist");
            System.out.println(".....................");
            System.out.println("Name: " + name);
            System.out.println("Country: " + country);
            System.out.println("Style: " + style);
            System.out.println("TimePeriod: " + timePeriod);
            System.out.println("Number of Strings: " + numstrings);
            System.out.println("\n");

    }
}

