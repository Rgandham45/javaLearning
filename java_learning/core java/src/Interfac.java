 abstract class computer{
    public  abstract void code();
}


class laptop extends computer{
    public void code(){
        System.out.println(" Lap coding...");
    }
}

class Desktop extends computer{
    public void code(){
        System.out.println(" Desk coding...");
    }
}

class Developer{
    public void task(computer obj){
        obj.code();
    }
}



public class Interfac {
    public static void main(String[] args){

        computer obj = new laptop();
        computer obj1 = new Desktop();

        Developer tsk = new Developer();
        tsk.task(obj);


    }
}
