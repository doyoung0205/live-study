package com.company.inheritance.doubleDispatch;

public abstract class Friend {
    protected String name;
    protected String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public abstract void writeLetter(SNS sns);
}

class CompFriend extends Friend { // 사회 친구
    protected String job;

    public CompFriend(String name, String phone, String job) {
        super(name, phone);
        this.job = job;
    }

    @Override
    public void writeLetter(SNS sns) {
        sns.contact(this);
    }
}

class UnivFriend extends Friend { // 대학 친구
    protected String major; //전공

    public UnivFriend(String name, String phone, String major) {
        super(name, phone);
        this.major = major;
    }

    @Override
    public void writeLetter(SNS sns) {
        sns.contact(this);
    }
}
