import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        ThreadPoolExecutor executor2 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);

        for(int i=1;i<=100;i++){
            Runnable task1 = new ThreadPooll("Message"+i);
            executor.execute(task1);
        }

        for(int j=1;j<=50;j++){
            Runnable task2 = new ThreadPooll("message2"+j);
            executor2.execute(task2);
        }
        executor.shutdown();
        executor2.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
            executor2.awaitTermination(3,TimeUnit.SECONDS);

        } catch (InterruptedException e) {

            executor2.shutdownNow();
            executor.shutdownNow();
            Thread.currentThread().interrupt();

            Thread.currentThread().getStackTrace();
            System.out.println("Interrupted threads: " + Arrays.toString(Thread.currentThread().getStackTrace()));

        }
        System.out.println("done"+ThreadPooll.message);

    }
}