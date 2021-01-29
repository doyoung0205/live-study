package com.company.enums;

import lombok.Getter;
import lombok.ToString;


@Getter
public enum TestStatus {

  WAIT(1, "제출 전"),
  COMPLETED(2, "제출 후")
  ;

  private int value;
  private String name;

  TestStatus(int value, String name) {
    this.value = value;
    this.name = name;
  }

  @Override
  public String toString() {
    return "TestStatus{" +
        "value=" + value +
        ", name='" + name + '\'' +
        '}';
  }
}
