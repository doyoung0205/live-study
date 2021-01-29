package com.company.enums;

public class Test {

  private String problem;
  private String answer;
  private String result;
  private String state; // 제출 전, 제출 후

  public static Test getInstance() {
    return new Test("시험 문제", "문제 결과", "", "테스트전");
  }

  public Test() {

  }

  public Test(String problem, String answer, String result, String state) {
    this.problem = problem;
    this.answer = answer;
    this.result = result;
    this.state = state;
  }

  public String getProblem() {
    return problem;
  }

  public String getAnswer() {
    return answer;
  }

  public String getResult() {
    return result;
  }

  public String getState() {
    return state;
  }
}
