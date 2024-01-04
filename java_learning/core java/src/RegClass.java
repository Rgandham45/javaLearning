class A{
    public A(){
        System.out.println("in A");
    }
    public A(int Number){
        System.out.println("int para A");
    }
}

class B extends Firstclass {
    public B()
    {
        System.out.println("in B");
    }

    public B(int Num){
        this();
        System.out.println("in para B");
    }
}

public class RegClass {
public static void main(String[] args){

    B obj = new B(5);

}
}
