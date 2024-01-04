import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collect {
    public static void main(String[] args){
//        Map<String,Integer> students = new HashMap<>();
//
//        students.put("rambabau",54);
//        students.put("madhavi",49);
//        students.put("rahul",24);
//        students.put("goutham",14);

//        System.out.println(students.keySet());
//        System.out.println(students.get("rahul"));
//
//        for(String name : students.keySet()) {
//            System.out.println(name+":"+students.get(name));
//        }
        List<String> names = new ArrayList<>();
        names.add("rambabu");
        names.add("madhavi");
        names.add("rahul");
        names.add("goutham");


        Comparator<String> com  = Comparator.comparing(String::length);

        Collections.sort(names, com);

        for(String str: names){
            System.out.println(str);
        }

    }
    }
