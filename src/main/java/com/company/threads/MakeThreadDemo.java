package com.company.threads;

public class MakeThreadDemo {
  public static void main(String[] args) {
    Runnable task = () -> { // 쓰레드가 실행할 내용
      int n1 = 10;
      int n2 = 20;
      final String name = Thread.currentThread().getName();
      System.out.println(name + ": " + (n1 + n2));
    };

    Thread t = new Thread(task, "thread name");
    t.start(); // 쓰레드 실행
    System.out.println("End " + Thread.currentThread().getName());
  }
}
