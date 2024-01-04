import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cmptr implements Comparable<Cmptr> {
    int age;
    String name;

    public Cmptr(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cmptr{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cmptr that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }

    public static void main(String[] args) {
        List<Cmptr> details = new ArrayList<>();
        details.add(new Cmptr(54, "rambabu"));
        details.add(new Cmptr(49, "madhavi"));
        details.add(new Cmptr(24, "rahul"));
        details.add(new Cmptr(11, "goutham"));

        Comparator<Cmptr> com = new Comparator<Cmptr>() {
            @Override
            public int compare(Cmptr i, Cmptr j) {
                if (i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(details);
        for (Cmptr i : details) {
            System.out.println(i);
        }
    }
}


