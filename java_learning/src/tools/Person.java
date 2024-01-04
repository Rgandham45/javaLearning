package tools;

public class Person {
    String name;
    int id;
    int zipcode;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    int salary;

    public Person(){

    }

    public Person(String name, int id, int zipcode, int salary) {
        this.name = name;
        this.id = id;
        this.zipcode = zipcode;
        this.salary = salary;
    }

    public void show() {
        show2();
        System.out.println("hello world");
    }
    public void show2() {
        System.out.println("hello world 2");
    }
    public boolean equals(Person person) {
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

