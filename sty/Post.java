package com.aligazy;

public class Post {
    String txt;
    String mp;

    public Post(String text, String video){
        this.mp = video;
        this.txt = text;
    }

    public String getText() {
        return txt;
    }

    public String getVideo() {
        return mp;
    }
}