import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Strm {
    public static void main(String[] args){
       List<Integer> nums = Arrays.asList(1, 4, 5, 6, 77, 9);
//        int sum = 0;
//        for(int n: nums){
//            if (n%2==0){
//                sum = sum+n*2;
//            }
//
//        }
//        System.out.println(sum);
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n ->n%2==0);

    s2.forEach(n -> System.out.println(n));
    }
}
