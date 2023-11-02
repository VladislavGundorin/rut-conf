package com.example.projectBack.service.impl;

import com.example.projectBack.models.Member;
import com.example.projectBack.service.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Override
    public void mute(Member member) {

    }

    @Override
    public void unmute(Member member) {

    }

    @Override
    public void cameraOn(Member member) {
        if(!member.getCamera().isOpen()){
            member.getCamera().open();
        }
    }

    @Override
    public void cameraOff(Member member) {
        if(member.getCamera().isOpen()){
            member.getCamera().close();
        }
    }
}
