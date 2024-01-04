package tools;

public class SecondThread implements Runnable{

    public void run() {
        System.out.println("byeworld"+Thread.currentThread().getName());
    }
}
