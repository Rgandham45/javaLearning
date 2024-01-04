public class ThreadPooll implements Runnable{
    static String message;

    public ThreadPooll(String message) {
        this.message = message;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"Received :"+message);
        respond();
        System.out.println(Thread.currentThread().getName()+"Processing done"+message);
    }

    public void respond(){
       try {
           Thread.sleep(10);
       }
       catch (InterruptedException e) {
           System.out.println("unable to process"+Thread.currentThread().getName()+":"+message);;
       }
    }
}
