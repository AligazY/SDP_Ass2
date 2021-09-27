package com.aligazy;

public class Subscribers implements Follower {
    Account Acc;

    public Subscribers(Account Acc){
        this.Acc=Acc;
    }

    @Override
    public void update(Post ali) {
        if(ali.getVideo().isEmpty())
            System.out.println("User with id " + Acc.getName() + " has a new text information: " + ali.getText());
        else
            System.out.println("User with id " + Acc.getName() + " has a new video information: " + ali.getVideo() + " " + ali.getText());
    }
}