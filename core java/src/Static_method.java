class Number{
     int age;
     String name;
    public void show(){
        System.out.println("In show...");
    }
    public void show1(){
        System.out.println(age+":"+name);
    }

    public static void show2(Number obj)
    {
        System.out.println(obj.name+":"+obj.age);
    }
}


public class Static_method {
    public static void main(String[] args){
        Number obj = new Number();
        obj.age =24;
        obj.name = "Rahul Gandham";
        obj.show();
        obj.show1();

        Number.show2(obj);

    }
}
