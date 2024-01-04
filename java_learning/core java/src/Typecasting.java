class UpCasting{

    public void show(){
        System.out.println("In Upcasting");
    }

}
class DownCasting extends UpCasting{

    public void show1(){
        System.out.println("in DownCasting");
    }
}

public class Typecasting {
    public static void main(String[] args){

        UpCasting obj = new DownCasting();
        obj.show();

        DownCasting obj1 = (DownCasting) obj;
        obj1.show1();

        int num = 5;
        Integer num1 = num;

    }
}
