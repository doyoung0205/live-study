package com.company.enums;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public class EnumTest2 {

  public static void main(String[] args) {

    final EnumSet<TestStatus> testStatuses = EnumSet.of(TestStatus.WAIT, TestStatus.COMPLETED);
    EnumSet.of(TestStatus.WAIT, TestStatus.COMPLETED);
    EnumSet.noneOf(TestStatus.class);
    EnumSet.allOf(TestStatus.class);
    final Set<TestStatus> testStatuses1 = Collections
        .synchronizedSet(EnumSet.noneOf(TestStatus.class));


    final Set<TestStatus> testStatuses2 = Collections
        .synchronizedSet(EnumSet.allOf(TestStatus.class));

  }

}
