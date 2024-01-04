abstract class car {
     public abstract void drive();

     public void PlayMusic(){
         System.out.println("Music Playing");
     }
     public void engine(){
         System.out.println("V6");
     }
}

class Wagnor extends car {

    @Override
    public void drive() {
        System.out.println("Driving....");
    }

    public void engine(){
        super.engine();
        System.out.println("V8");
    }
}

public class Abstract{
    public static void main(String[] args) {

        car obj = new Wagnor();
        obj.drive();
        obj.PlayMusic();
        obj.engine();
    Wagnor obj1 = new Wagnor();
    obj1.engine();
    obj.PlayMusic();
    }
}
