package com.company.enums;

import java.util.Arrays;

public class EnumTest {

  public static void main(String[] args) {

    System.out.println(TestStatus.COMPLETED.hashCode());
    System.out.println(TestStatus.COMPLETED.hashCode());
    System.out.println(TestStatus.valueOf(TestStatus.class, "COMPLETED").hashCode());
    System.out.println(TestStatus.valueOf("COMPLETED").hashCode());

    System.out.println(new Test().hashCode());
    System.out.println(new Test().hashCode());

    System.out.println(Enum.valueOf(TestStatus.class, "COMPLETED"));
    System.out.println(TestStatus.valueOf("COMPLETED"));

    System.out.println("==");
    final TestStatus[] testStatuses = TestStatus.values();
    for (TestStatus testStatus : testStatuses) {
      System.out.println(testStatus);
    }
    System.out.println("==");

    System.out.println(TestStatus.COMPLETED.ordinal());
    System.out.println(TestStatus.COMPLETED.name());
    System.out.println(TestStatus.COMPLETED.compareTo(TestStatus.COMPLETED));
    System.out.println(TestStatus.COMPLETED.compareTo(TestStatus.WAIT));

  }

}
