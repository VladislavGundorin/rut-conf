package com.example.projectBack.models;



public class Main {
    public static void main(String[] args) {
        Meeting meeting = new Meeting();
        System.out.println(meeting.getLink());
        Member member = new Member();
        System.out.println(member.getCamera());
        member.getCamera().open();


    }
}
