package tools;

public class RaceCondition implements Runnable{
    static int count = 0;

    @Override
    public synchronized void run() {
        for (int i = 1; i < 1000; i++) {
            counter();
            System.out.println(Thread.currentThread().getName()+":"+count);
        }
    }


    public void counter(){
        count++;
    }
}
