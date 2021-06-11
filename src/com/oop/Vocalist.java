package com.oop;

class Vocalist extends Musician {
      String influencedBy;

      public Vocalist(String name, String country, String style, int timePeriod, String influencedBy) {
            super(name, country, style, timePeriod);
            this.influencedBy = influencedBy;
      }

      public void show() {
            System.out.println("Top Vocalist");
            System.out.println(".....................");
            System.out.println("Name: " + name);
            System.out.println("Country: " + country);
            System.out.println("Style: " + style);
            System.out.println("TimePeriod: " + timePeriod);
            System.out.println("Influenced By: " + influencedBy);
            System.out.println("\n");
            }
      }





