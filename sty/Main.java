package com.aligazy;

public class Main {

    public static void main(String[] args) {

        Account c1 = new Account("@al1gazy");
        Subscribers anb = new Subscribers(c1);
        Subscribers anbc = new Subscribers(c1);
        Post post = new Post("Today we are going to the jym!", "");
        Post post1 = new Post("Check out video tutorial", "https://www.youtube.com/watch?v=GCraGHx6gso");

        c1.addObserv(anb);
        c1.addObserv(anbc);
        c1.addPost(post);
        c1.addPost(post1);

    }
}