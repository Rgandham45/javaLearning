package tools;

import java.util.Objects;

public class laptop {
    String name;
    int price;

    public String toString() {
        return name + ":" + price;
    }

   // @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof laptop laptop)) return false;
//        return price == laptop.price;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public boolean equals(laptop that) {
return this.price==that.price;

    }
}



