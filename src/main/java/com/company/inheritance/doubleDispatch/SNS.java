package com.company.inheritance.doubleDispatch;

public abstract class SNS {
    public abstract void contact(UnivFriend friend);

    public abstract void contact(CompFriend friend);
}

class Facebook extends SNS {
    public void contact(UnivFriend friend) {
        System.out.println("facebook 으로 " + friend.major + " 전공인 " + friend.name + "에게 연락하기");
    }

    public void contact(CompFriend friend) {
        System.out.println("facebook 으로 " + friend.job + " 직업인 " + friend.name + "에게 연락하기");
    }
}

class Twitter extends SNS {
    public void contact(UnivFriend friend) {
        System.out.println("Twitter 로 " + friend.major + " 전공인 " + friend.name + "에게 연락하기");
    }

    public void contact(CompFriend friend) {
        System.out.println("Twitter 로 " + friend.job + " 직업인 " + friend.name + "에게 연락하기");
    }
}



class Instagram extends SNS {
    public void contact(UnivFriend friend) {
        System.out.println("Instagram 로 " + friend.major + " 전공인 " + friend.name + "에게 연락하기");
    }

    public void contact(CompFriend friend) {
        System.out.println("Instagram 로 " + friend.job + " 직업인 " + friend.name + "에게 연락하기");
    }
}
