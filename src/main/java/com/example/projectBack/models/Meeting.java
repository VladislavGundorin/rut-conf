package com.example.projectBack.models;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Random;

public class Meeting {
    private String link;
    private List<Member> members;

    public Meeting() {
        this.link = confLink();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
    public String confLink(){
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder url = new StringBuilder();
        Random random = new Random();
        int urlLength = 21;
        for (int i = 0; i < urlLength; i++) {
            int index = random.nextInt(characters.length());
            url.append(characters.charAt(index));
        }


        return url.toString();
    }
}
