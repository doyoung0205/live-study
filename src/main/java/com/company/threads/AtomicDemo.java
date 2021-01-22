package com.company.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

  public static AtomicCounter cnt = new AtomicCounter();

  public static void main(String[] args) throws InterruptedException {
    Runnable task1 = () -> {
      for (int i = 0; i < 1000; i++) {
        cnt.increment();
      }
    };

    Runnable task2 = () -> {
      for (int i = 0; i < 1000; i++) {
        cnt.decrement();
      }
    };

    Thread t1 = new Thread(task1);
    Thread t2 = new Thread(task2);

    t1.start();
    t2.start();

    t1.join(); // t1이 참조하는 쓰레드의 종료를 기다림
    t2.join(); // t2가 참조하는 쓰레드의 종료를 기다림

    System.out.println(cnt.getCount());
  }
}

class AtomicCounter {

  private final AtomicInteger count = new AtomicInteger(0); // 두 쓰레드에 의해 공유되는 변수

  public void increment() {
    count.incrementAndGet();

  }

   public void decrement() {
    count.decrementAndGet();
  }

  public int getCount() {
    return count.get();
  }
}

