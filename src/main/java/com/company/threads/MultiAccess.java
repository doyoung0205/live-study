package com.company.threads;

public class MultiAccess {

  public static Counter cnt = new Counter();

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

class Counter {

  private int count = 0; // 두 쓰레드에 의해 공유되는 변수

  synchronized public void increment() {
    synchronized (this) {
      count++;
    }

    System.out.println("1 증가되어 " + count + " 가 되었습니다.");
  }

  synchronized public void decrement() {
    count--;
  }

  public int getCount() {
    return count;
  }
}

