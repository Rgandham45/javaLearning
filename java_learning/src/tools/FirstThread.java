package tools;

public class FirstThread implements Runnable {
  public void run(){
      System.out.println("Hello World"+Thread.currentThread().getName());

  }
}
