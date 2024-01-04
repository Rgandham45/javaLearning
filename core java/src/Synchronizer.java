import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Synchronizer {


    public static void main(String[] args) {
        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        ThreadPoolExecutor executor2 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 1000; i++) {
            Runnable task1 = new Counter();
            executor1.submit(task1);
        }

        for (int i = 1; i <= 1000; i++) {
            Runnable task2 = new Counter();
            executor2.submit(task2);
        }
        executor1.shutdown();
        executor2.shutdown();

        try {
           executor1.awaitTermination(10, TimeUnit.SECONDS);
            executor2.awaitTermination(10,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            executor1.shutdownNow();
            executor2.shutdownNow();

            e.printStackTrace();

        }



        System.out.println("Total count is"+":"+Counter.count);

    }
}
