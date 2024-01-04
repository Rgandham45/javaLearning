class Firstclass {
    public void show(){
        System.out.println("Outer class");
    }

    class InnerFirstclass{
        public void show1(){
            System.out.println("Inner class ");
        }
    }
    static class S_Innerclass{
        public void show2(){
            System.out.println("Static inner class");
        }
    }
}


public class Innerclass {
    public static void main(String [] args){

        Firstclass obj = new Firstclass();
        obj.show();

        Firstclass.InnerFirstclass obj1 = obj.new InnerFirstclass();
        obj1.show1();
        Firstclass.S_Innerclass obj2 = new Firstclass.S_Innerclass();
        obj2.show2();


    }
}
