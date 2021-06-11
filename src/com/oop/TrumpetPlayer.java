package com.oop;

class TrumpetPlayer extends Musician {
      String trumpetType;

    public TrumpetPlayer (String name, String country, String style, int timePeriod,String trumpetType) {
        super(name, country, style, timePeriod);
        this.trumpetType = trumpetType;
    }

    public void show() {
            System.out.println("Top Trumpet Player");
            System.out.println(".....................");
            System.out.println("Name: " + name);
            System.out.println("Country: " + country);
            System.out.println("Style: " + style);
            System.out.println("TimePeriod: " + timePeriod);
            System.out.println("Trumpet Type: " + trumpetType);
            System.out.println("\n");
        }
    }



