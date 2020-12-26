package com.company.inheritance.doubleDispatch;

import java.util.Arrays;
import java.util.List;

public class MyFriends {
    public static void main(String[] args) {

        // 모든 친구들
        List<Friend> univFriends = getFiends();
        List<SNS> snsGroup = getSnsGroup();
        for (Friend friend : univFriends) {
            for (SNS sns : snsGroup) {
                friend.writeLetter(sns);
            }
        }

    }
    private static List<SNS> getSnsGroup() {
        return Arrays.asList(
                new Facebook(),
                new Twitter()
        );
    }

    private static List<Friend> getFiends() {
        return Arrays.asList(
                new CompFriend("ILL", "010-1111-1111", "computer"),
                new CompFriend("LEE", "010-2222-2222", "Electronics"),
                new UnivFriend("SAM", "010-3333-3333", "computer"),
                new UnivFriend("SA", "010-4444-4444", "Electronics")
        );
    }

}
