package com.example.projectBack.models;



import com.github.sarxos.webcam.Webcam;


import java.awt.*;

public class Member {
    private String username;
    private Webcam camera = Webcam.getDefault();


    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public Webcam getCamera() {
        return camera;
    }

    public void setCamera(Webcam camera) {
        this.camera = camera;
    }
}
