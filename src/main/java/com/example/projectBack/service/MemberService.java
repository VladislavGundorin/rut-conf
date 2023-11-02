package com.example.projectBack.service;

import com.example.projectBack.models.Member;

public interface MemberService {
    void mute(Member member);
    void unmute(Member member);

    void cameraOn(Member member);
    void cameraOff(Member member);
}
