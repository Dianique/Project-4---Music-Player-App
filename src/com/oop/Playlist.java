package com.oop;

import java.util.ArrayList;

public class Playlist {


    ArrayList<Song> playlistArray = new ArrayList<Song>();
    public void displaySongs() {  //Static is only used to keep methods or variables constant.

        System.out.println(".....................");

        for (Song songList : playlistArray) {
            songList.show();
        }
    }

    public void add(Song song) {
        playlistArray.add(song);
     // This is a add method that takes in a parameter type 'Song' class named song and allows you to add songs to the Playlist.
    }
}