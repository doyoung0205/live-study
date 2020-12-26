package com.company.inheritance.good;

import java.util.Arrays;
import java.util.List;

public class MyFriends {
    public static void main(String[] args) {

        // 모든 친구들
        List<Friend> univFriends = getFiends();
        for (Friend univFriend : univFriends) {
            univFriend.showInfo();
        }

    }

    private static List<Friend> getFiends() {
        return Arrays.asList(
                new CompFriend("ILL", "computer", "010-1111-1111"),
                new CompFriend("LEE", "Electronics", "010-2222-2222"),
                new UnivFriend("SAM", "computer", "010-3333-3333"),
                new UnivFriend("SA", "Electronics", "010-4444-4444")
        );
    }

}
