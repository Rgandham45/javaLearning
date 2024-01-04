
class AA{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args){

        AA obj = new AA();
        obj.setName("RahulGandham");
        obj.setAge(24);

        System.out.println(obj.getName()+":"+obj.getAge());

    }
}
