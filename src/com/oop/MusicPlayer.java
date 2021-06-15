package com.oop;


public class MusicPlayer { // This is my main class called Music Player.

    public static void main(String[] args) { //I created new instantiated objects as vocalist, guitarist, and trumpet player with their specific fields included in parentheses. I then called the show method on each to display in the terminal.

       Musician esperanza = new Vocalist ("ESPERANZA SPALDING", "USA","JAZZ",2000, "RON CARTER"); //
       esperanza.show();
       Musician prince = new Guitarist ("PRINCE", "USA","ROCK",1980, "SIX");
       prince.show();
       Musician satchmo = new TrumpetPlayer ("LOUIS ARMSTRONG", "USA","JAZZ",1950, "BRASS");
       satchmo.show();
       System.out.println(".......................");


        System.out.println("List of Songs");
        Musician burnaB = new Musician ("Burna Boy", "NIGERIA", "AFRO BEATS", 2000);
        Musician alicia = new Musician ("Alicia Keys", "USA", "R&B", 2000);
        Musician donnyH = new  Musician ("Donny Hathaway", "USA", "SOUL", 1950);
        Musician grupoN= new Musician ("Grupo Niche", "COLOMBIA", "SALSA", 1990);


        Playlist myTunes = new Playlist();// Creates a new instantiated object Playlist.
// I'm calling the Playlist myTunes (add method) to add each song into my myTunes Arraylist. It has two functions to add a song and instantiate the object.
       myTunes.add(new Song("Ye", burnaB, "Vibe", "https://www.youtube.com/watch?v=lPe09eE6Xio"));
       // OR... TO BE WRITTEN AS: Song newBurna = new Song ("Ye", burnaB, "Vibe", "https://www.youtube.com/watch?v=lPe09eE6Xio");
      //                          newBurna.show();
        myTunes.add(new Song("Lovin U",  alicia, "R&B", "https://www.youtube.com/watch?v=icQ6W97f1gI"));
        myTunes.add(new Song("A Song For You", donnyH, "Soul", "https://www.youtube.com/watch?v=VE1nh7KREcA"));
        myTunes.add(new Song("Culebra",  grupoN, "Salsa", "https://www.youtube.com/watch?v=Y3Y9YKncNRo"));
        myTunes.displaySongs();
    }
        }





