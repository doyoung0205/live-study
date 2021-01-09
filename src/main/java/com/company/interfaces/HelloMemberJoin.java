package com.company.interfaces;

public class HelloMemberJoin implements JoinGroup, JoinMember {

    @Override
    public void preJoin() {
        JoinGroup.super.preJoin();
        JoinGroup.super.afterJoin();
    }

    @Override
    public void afterJoin() {

    }
}
