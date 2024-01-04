import java.util.ArrayList;
import java.util.List;


public class ArrStr {
    public static void main(String[] args){
        List arr= List.of("10","20","30","40","60","70","teja");
        List<String> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        String str = "44";
        int n =Integer.parseInt(str);

//        for(String s: arr){
//            try {
//                int s1 = Integer.parseInt(s);
//                arr2.add(s1);
//            }
//            catch (NumberFormatException e){
//                arr1.add(s);
//            }
//        }
//        System.out.println("integer array is: "+arr2);
//        System.out.println("String array is: "+arr1);
            for (Object s : arr) {
                try {
                    int s1 = Integer.parseInt((String) s);
                    //System.out.println(s1);

                } catch (NumberFormatException e) {
                    int i = arr.indexOf(s);
                    for (int j=i+1;j<arr.size();j++) {
                        System.out.println(arr.get(j));
                    }
break;
                }


            }
    }
}
