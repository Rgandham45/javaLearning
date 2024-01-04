package tools;

public class Access_Method {

    public int multiply(int n1,int n2){
        return n1*n2;
    }
    public double div(int n1,int n2){
        return (double) (n1 /n2);
    }


    public static void main(String[] args) {
        int num = 10;
        num = 11;
        System.out.println(num);

        fnl obj = new fnl();
        obj.show();
        obj.add(3,4);

        F oj = new F();
        oj.show();


    }
}


class M extends launch{
    launch obj = new launch();
    int me;

    {
        me = obj.marks;
    }

    public void PrintMe () {
            System.out.println(me);
        }

}

class F{
    public void show(){
        System.out.println("im in f method");
    }
public void add(int a,int b){
        System.out.println(a+b);
}
}
class fnl extends F{
    public void show(){
        System.out.println("this is final method");
    }

}

