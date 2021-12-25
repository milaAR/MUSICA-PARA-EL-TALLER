package com.example.act4musicplayermila;
//CLASE MUSIC QUE USA MI ADAPTADOR
public class Music {

    private String nameMAR;
    private String singerMAR;
    private int songMAR;

    public Music(String name, String singer, int song) {
        this.nameMAR = name;
        this.singerMAR = singer;
        this.songMAR = song;
    }

    public String getName() {
        return nameMAR;
    }

    public void setName(String name) {
        this.nameMAR = name;
    }

    public String getSinger() {
        return singerMAR;
    }

    public void setSinger(String singer) {
        this.singerMAR = singer;
    }

    public int getSong() {
        return songMAR;
    }

    public void setSong(int song) {
        this.songMAR = song;
    }
}

