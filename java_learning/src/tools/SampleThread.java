package tools;
public class SampleThread implements Runnable {

    public void run() {

        TriggerMethod();

    }

    public void TriggerMethod(){
        for(int i=0;i<=5;i++){
            System.out.println("hello");
        }
        System.out.println("Printing Thread name" + Thread.currentThread().getName());
    }
}
