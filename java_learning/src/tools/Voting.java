package tools;

public class Voting implements Runnable {
    static int cunt = 0;
    public void run(){
        counting();
        System.out.println(Thread.currentThread().getName());
    }
    public void counting(){
        cunt=cunt+1;
    }
}
