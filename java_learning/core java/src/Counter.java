public class Counter implements Runnable{
    public static int count;


    @Override
    public void run() {
        increment();
        hold();
        System.out.println(Thread.currentThread().getName()+":"+count);
    }

    public void increment(){
        count++;
    }

    public void hold(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+":"+count);
        }

    }
}
