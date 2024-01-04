import java.util.concurrent.atomic.AtomicInteger;


public class tp implements Runnable{

    static AtomicInteger count=new AtomicInteger(0);

    public void range()
    {
        count.getAndIncrement();
    }

    @Override
    public void run() {
        range();
        System.out.println(Thread.currentThread().getName()+":"+count);
    }
}


