package com.oop;


import java.sql.SQLOutput;

public class MusicPlayer {

    public static void main(String[] args) {
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
        Musician donnyH = new Musician ("Donny Hathaway", "USA", "SOUL", 1950);
        Musician grupoN= new Musician ("Grupo Niche", "COLOMBIA", "SALSA", 1990);

        Playlist deeTunes = new Playlist(); // Creates a new instantiated object Playlist. (Follow-up on this method for greater understanding)

// I'm calling the Playlist deeTunes add method to add each song into my deeTunes Arraylist. It has two functions to add a song and instantiate the object.
       deeTunes.add(new Song("Ye",  burnaB , "Vibe", "https://www.youtube.com/watch?v=4rz_kQiBxaQ"));
       deeTunes.add(new Song("Lovin U",  alicia, "R&B", "https://www.youtube.com/watch?v=icQ6W97f1gI"));
       deeTunes.add(new Song("A Song For You", donnyH, "Soul", "https://www.youtube.com/watch?v=VE1nh7KREcA"));
       deeTunes.add(new Song("Culebra",  grupoN, "Salsa", "https://www.youtube.com/watch?v=Y3Y9YKncNRo"));
       deeTunes.displaySongs();
    }
        }

