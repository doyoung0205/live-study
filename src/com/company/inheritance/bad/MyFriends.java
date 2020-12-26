package com.company.inheritance.bad;

import java.util.Arrays;
import java.util.List;

public class MyFriends {
    public static void main(String[] args) {

        // 대학 친구들
        List<UnivFriend> univFriends = getUnivFiends();

        for (UnivFriend univFriend : univFriends) {
            univFriend.showInfo();
        }

        // 사회 친구들
        List<CompFriend> compFriends = getCompFriends();

        for (CompFriend compFriend : compFriends) {
            compFriend.showInfo();
        }

    }

    private static List<CompFriend> getCompFriends() {
        return Arrays.asList(
                new CompFriend("ILL", "computer", "010-1111-1111"),
                new CompFriend("LEE", "Electronics", "010-2222-2222")
        );
    }

    private static List<UnivFriend> getUnivFiends() {
        return Arrays.asList(
                new UnivFriend("SAM", "computer", "010-3333-3333"),
                new UnivFriend("SA", "Electronics", "010-4444-4444")
        );
    }
}
