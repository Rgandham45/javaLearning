/*class Mobile_ref {
    String brand;
    int price;
    static String name = "mb";


    public void show() {
System.out.println(brand+" : "+price+":"+name);
    }
    public static void show1(Mobile_ref object){
        System.out.println(object.brand+" : "+object.price+":"+name);
    }
}
-----------------------------------------------------------------------------------------
public class Mobile{
    public static void main(String[] args){
        Mobile_ref obj = new Mobile_ref();
        obj.brand = "apple";
        obj.price = 1000;
        Mobile_ref.name = "smart-phone";

        Mobile_ref obj2 = new Mobile_ref();
        obj2.brand = "Samsung";
        obj2.price = 200;
        Mobile_ref.name = "landline";

        obj.show();
        obj2.show();
        Mobile_ref.show1(obj);
//print 

    }
}
---------------------------------------------------------------------------------------------------------

class student{
    private static int StudentCount = 0;

    private String name;

    public void Student (String name){
        this.name = name;
        StudentCount++;
    }
    public static int getStudentCount(){
        return StudentCount;
    }
    public void Display_info(){
        System.out.println("name"+" : "+name);
    }

    public static void main(String[] args){
        student obj= new student();
        obj.Student("rahul");
        student obj2 = new student();
        obj2.Student("maggie");
        System.out.println("total_Count is: "+ student.getStudentCount());
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.makeSound();  // Calls the makeSound method of the Animal class
        dog.makeSound();

        cal ad = new cal();
        int res = ad.add(1,2,3);
        int res1 = ad.add(1,2);
        System.out.println(res);
        System.out.println(res1);

    }


}
---------------------------------------------------------------------------------------------------------------------


class cal{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int q,int w,int e){
        return q+w+e;
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Lap{
    String model;
    int Pri;

    @Override
    public String toString() {
        return "Lap{" +
                "model='" + model + '\'' +
                ", Pri=" + Pri +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lap lap = (Lap) o;
        return Pri == lap.Pri && Objects.equals(model, lap.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, Pri);
    }
}
----------------------------------------------------------------------------------------------------------------------

public class Mobile {
    public static void main(String[] args){
    Lap obj = new Lap();
    obj.model = "predator";
    obj.Pri = 70000;
    Lap obj1 = new Lap();
    obj1.model = "Acer";
    obj1.Pri = 40000;

    boolean rest = obj.equals(obj1);
   String res = obj.toString();
    String res1 = obj1.toString();
    System.out.println(res);
    System.out.println(res1);
    System.out.println(rest);

    }
}

----------------------------------------------------------------------------------------------------------------------

abstract class car{
    abstract public void cars();
    abstract public void fly();

    public void IsCar(){
        System.out.println("yes in car");
    }
}

abstract class Waganor extends car{

    @Override
    public void cars() {

    }
}
class flyWag extends Waganor{

    @Override
    public void fly() {

    }
};
-----------------------------------------------------------------------------------------------------------------------------
public class Mobile{
    public static void main(String[] args){
        flyWag obj = new flyWag();
        obj.IsCar();

    }
}
abstract class computer{
    public abstract void code();

}
class laptop extends computer{
    public void code(){
        System.out.println("coding...");
    }
}
class desktop extends computer{
    public void code(){
        System.out.println("in desktop");
    }
}

class developer {
    public void code(computer lap){
        lap.code();
    }
}
----------------------------------------------------------------------------------------------------------------------

public class Mobile{
    public static void main(String[] args){
        computer lap = new laptop();
        computer desk = new desktop();


        developer rahul  = new developer();
        rahul.code(lap);
        developer raj = new developer();
        raj.code(desk);
    }
}
-----------------------------------------------------------------------------------------------------------------------

enum laptop{
    Macbook(1000), acer(1100), xps(1000), Thinkpad(1000),own;
    private int price;

    private laptop() {
        System.out.println(this.name()+this.price);
        this.price = 500;
    }

    private laptop(int price) {
        this.price = price;
        System.out.println("in laptop"+this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
----------------------------------------------------------------------------------------------------------------------
public class Mobile{
    public static void main(String[] args){
//        laptop lap = laptop.Macbook;
//        System.out.println(lap+":"+lap.getPrice());

        for(laptop lap:laptop.values()){
            System.out.println(lap+":"+lap.getPrice());
        }
        laptop l = laptop.own;
        l.setPrice(1);
        System.out.println(l+":"+l.getPrice());
    }
}
-----------------------------------------------------------------------------------------------------------
@FunctionalInterface

interface A{
    public int add(int i, int j);
}

public class Mobile {
    public static void main(String[] args){
        A obj = (i,j) ->  i+j;
            int res = obj.add(5,7);
System.out.println(res);


    }
}

public class Mobile{
    public static void main(String[] args){
        int i = 0;
        int j = 0;
        int nums[] = new int[5];
        try{
            j=18/i;
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e){
            System.out.println("enter correct digit");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of range");
        }
        System.out.println(j);
    }}
-----------------------------------------------------------------------------------------------------------------
public class Mobile{
    public static void main(String[] args){
        int i=20;
        int j=0;

        try {
            j=18/i;
            if(j==0)
                throw new ArithmeticException("Dont want to print zero");
        }
        catch (ArithmeticException e){
            j= 18/1;
            System.out.println("wrong input"+e);
        }
    }}
class rahulException extends Exception{
    public rahulException(String string){
        super(string);
    }
}
-----------------------------------------------------------------------------------------------------------------------
public class Mobile{
    public static void main(String[] args){
        int i=20;
        int j=0;

        try {
            j=18/i;
            if(j==0)
                throw new rahulException("Dont want to print zero");
        }
        catch (rahulException e){
            j= 18/1;
            System.out.println("Default output"+e);
        }
        catch (Exception e){
            System.out.println("Something went wrong....");
        }
    }
}

---------------------------------------------------------------------------------------------------------------------------
class a {
    public void show() throws ClassNotFoundException {

        Class.forName("Mobile");

    }
    }

    public class Mobile {
        static {
            System.out.println("class loaded");
        }

        public static void main(String[] args) {

            a obj = new a();
            try {
                obj.show();
            }
            catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
    }
---------------------------------------------------------------------------------------------------------------------------
class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
class B extends Thread{
public void run(){
    for(int i=0;i<100;i++){
        System.out.println("hey");
        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
}

public class Mobile{
    public static void main(String[] args){
        A obj = new A();
        B obj1 =new B();

        obj.start();
        try {
            Thread.sleep(5);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        obj1.start();

    }}
    -------------------------------------------------------------------------------------------------------------------
public class Mobile {
    public static void main(String[] args) {

        Runnable obj = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };


            Runnable obj1 = new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("hey");
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
            Thread t1 = new Thread(obj);
            Thread t2 = new Thread(obj1);
            t1.start();
            t2.start();
}
}
-------------------------------------------------------------------------------------------------------------------------------------
class counter{
    int count;
    public synchronized  void increment(){
        count++;
    }
}

public class Mobile{
    public static void main(String[] args) throws InterruptedException {
       counter c = new counter();
        Runnable obj = new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<1000;i++){
                    c.increment();
                }
            }
        };
        Runnable obj2  = new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<1000;i++) {
                    c.increment();
                }
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
 }
}
--------------------------------------------------------------------------------------------------------------------
class Z{

}
class A implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("hi");
        }
    }
}
class B implements Runnable{
public void run(){
    for(int i=0;i<=5;i++){
        System.out.println("hello");
    }
}
}
class Age{
     int age;
     String name;
     int weight;

    public void show(){
        System.out.println("Regular show");
    }
    public void show1(){
        System.out.println(name+":"+age+":"+weight);
    }

    public static void show2(Age obj){
        System.out.println(obj.name+":"+obj.age+":"+obj.weight);
    }

}
------------------------------------------------------------------------------------------------------------------------
public class Mobile {
    public static void main(String[] args) {
        Age obj = new Age();
        obj.name = "rahul gandham";
        obj.age = 24;
        obj.weight = 185;
        Age obj1 = new Age();
        obj1.name = "maggie";
        obj1.age = 22;
        obj1.weight = 185;
        obj.show();
        obj.show1();
     Age.show2(obj1);
           }
}
class a{
    int age;
    String name;
    static int weight;

    public a() {
        name = " ";
        age = 24;
        weight = 185;
        System.out.println("IN CONSTRUCTOR");

    }
}
------------------------------------------------------------------------------------------------------------------------

public class Mobile {
    public static void main(String[] args){

        a obj = new a();
        obj.age = 24;
        obj.name = "rahul Gandham";
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(a.weight);   }
}




class a{
    private int age;
    private String name;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

  public String getName(){
        return name;
  }
  public void setName(String name){
        this.name = name;
  }

}
public class Mobile {
public static void main(String[] args){
    a obj = new a();
    obj.setAge(10);
    obj.setName("Goutham");
    System.out.println(obj.getAge());
    System.out.println(obj.getName());
}
}
 */
