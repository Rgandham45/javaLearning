import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class mc{
    public static void main(String[] args){
        ThreadPoolExecutor exec1 = (ThreadPoolExecutor) Executors.newScheduledThreadPool(5);
        ThreadPoolExecutor exec2 = (ThreadPoolExecutor) Executors.newScheduledThreadPool(5);

        for(int i=1;i<=5;i++){
            Runnable tsk1 = new tp();
            exec1.execute(tsk1);
        }
        for(int j=1;j<=5;j++) {
            Runnable tsk2 = new tp();
            exec2.execute(tsk2);
        }

        exec1.shutdown();
        exec2.shutdown();

        try {
            exec1.awaitTermination(5, TimeUnit.SECONDS);
            exec2.awaitTermination(5,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            exec1.shutdownNow();
            exec2.shutdownNow();

        }

        System.out.println(tp.count);


    }
}
