package com.oop;
import java.util.ArrayList;
import java.sql.SQLOutput;

public class Song {
    String title; // what type of accessor?
    Musician musician;
    String playlist;
    String url;


    public Song(String title, Musician musician, String plist, String url) {
        this.title = title;
        this.musician = musician;
        this.playlist = plist;
        this.url = url;
    }


        public void show () {
            System.out.println(title + "\n" + musician.name + "\n" + playlist + "\n" + url + "\n");
        }
    }

