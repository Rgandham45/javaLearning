enum status{
    name, age, height,weight;
}

public class Enums{
    public static void main(String[] args){
        status r = status.age;
        System.out.println(r);

        if(r==status.age){
            System.out.println("age : 24");
        } else if (r==status.name) {
            System.out.println("rahul gandham");
        } else if (r==status.height) {
            System.out.println("168");
        }
        else {
            System.out.println("weight: 185");
        }
        System.out.println(r.ordinal());
    }
}