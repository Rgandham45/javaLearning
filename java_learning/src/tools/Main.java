package tools;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//FirstThread obj = new FirstThread();
//SecondThread obj1 = new SecondThread();
//
//ThreadGroup tg1 = new ThreadGroup("FirstThread");
//
//Thread t1 = new Thread(tg1,obj,"one");
//t1.start();
//Thread t2 = new Thread(tg1,obj,"two");
//t2.start();
//for(int i=0;i<=10;i++){
//    Thread t3  = new Thread(tg1,obj,"Thread"+i);
//    t3.start();
//}
//System.out.println(tg1.getName());
//
//
//ThreadGroup tg2 = new ThreadGroup("SecThread");
//
//Thread T1 = new Thread(tg2,obj1,"one");
//T1.start();
//Thread T2 = new Thread(tg2,obj1,"two");
//
//T2.start();
//System.out.println(tg2.getName());
//
//for(int i=0;i<50;i++){
//    Runnable  obj2 = new SecondThread();
//    obj2.run();
//}
//


        Runnable obj = new RaceCondition();
        Runnable obj1 = new RaceCondition();
        RaceCondition c = new RaceCondition();
            Thread t1 = new Thread(obj);

        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("final count value is " + RaceCondition.count);

    }
}
//FirstThread fs = new FirstThread();
//fs.run();
//
//Thread t3 = new Thread(fs);
//t3.start();
