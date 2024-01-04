/*
public class program {
    public static void main(String[] args) {
        int num, fact = 1;
        System.out.println("Enter your factorial number");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else if (num == 0) {
            System.out.println("1");
        } else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
        }
    }
}*/
/*
public class program{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ID Number");
        System.out.println("Enter name");
        System.out.println("Enter Salary");
        int num = s.nextInt();
        String name = s.next();
        int Sal = s.nextInt();
        System.out.println("you ID Number is: " + num);
        System.out.println("your name is: "+ name);
        System.out.println("your Salary is: " + Sal);


    }
}*/
// enter 3 numbers and find their sum and average
/*
public class program {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        System.out.println("enter your first number");
        int num1 = s.nextInt();
        System.out.println("Enter your second number");
        int num2 = s.nextInt();
        System.out.println("enter third number");
        int num3 = s.nextInt();

        int sum = num1+num2+num3;
        int average =num1+num2+num3/3;
        System.out.println("your sum is: "+sum);
        System.out.print("your average is: "+average);
    }

}*/

// enter radius of a circle and find the area
/*
public class program {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value for radius");
        int num = s.nextInt();
        int radius = (int) (2* 3.14 * num);
        System.out.println("Area is :"+radius);


    }
}
*/


//check whether entered number is even or odd

/*
public class program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int num = s.nextInt();
        if(num%2==0)
        {
            System.out.println("It is even number: ");
        }
            else
            {
                System.out.println("It is a odd number");

        }


    }
}*/

// Display numbers from 100 to 110
/*
public class program {
    public static void main(String[] args) {
        int i;
        for (i=100;i<=110;i++){
            System.out.println(i);
        }



    }
}*/

// display even numbers between 100 and 110
/*
public class program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number starting");
        int starting = s.nextInt();
        System.out.println("enter ending number");
        int ending = s.nextInt();

        for(int i = starting; i<=ending; i++){
            if (i%2!=0){
                System.out.println(i);
            }

        }
    }
}

*/


//multiplication number of a given number
/*
public class program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int num = s.nextInt();
        for(int i =1;i<=10;i++){
            int table = num * i;
            System.out.println(num+"X"+i+"="+table);
        }
    }
}


//break a loop 1 to 10 at 5

public class program {
    public static void main(String[] args) {
        int num = 1;

        while(num <=10){
            System.out.println(num);
            if(num ==5) {
                break;
            }
            num++;
        }

    }

}


public class program{
    public static void main (String[]args){
    for(int i=0;i<=10;i++){
        System.out.println(i);
    }
    }
}

public class program{
    public static void main (String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int num = s.nextInt();
        int sum = 0;

        for(int i=0;i<=num;i++){
            sum +=i;
        }
    System.out.println(sum);
    }
    }


public class program{
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// write a program to declare elements in a array and print elements with its index number


public class program  {
    public static void main(String[] args){
        int[] arr = {12,234,534,234,2344,4353};
        int sum = 0;

        for(int i=0;i<arr.length;i++) {
            sum +=arr[i];
        }
        //System.out.println("elements in this array index "+i+":"+arr[i]);
        System.out.println(sum);

    }
}


public class program  {
    public static void main(String[] args) {
        int[] arr = {12,323,12,32,35,44};
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println(max);


    }
    }



public class program {
    public static void main(String[] args) {
        int[] arr = {12, 323, 12, 32, 35, 44};
        Arrays.sort(arr);
        System.out.println("sorted array: "+Arrays.toString(arr));
    }
}




public class program{
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("\t"+arr[i][j]);

            }
            System.out.println();
        }
    }
}



public class program {
    public static void main(String[] args) {
        int[][][] arr = new int[3][3][4];
        int[][][] cube = {{
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        },
                {{1, 2, 3, 4}, {1, 2, 3, 4}
                },
                {{1, 2, 3, 4}, {1, 2, 3, 4}
                }
        };
for(int i=0;i< cube.length;i++){
    for(int j=0;j<cube[i].length;j++){
        for(int k=0;k<cube[i][j].length;k++){
            int element = cube[i][j][k];
            System.out.print(element+" ");
        }
    System.out.println();
    }

    System.out.println();
}
    }
}




public class program{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int num = s.nextInt();
        long factorial = find_factorial(num);
        System.out.println("facorial of " + num + "is: " + factorial);
    }
    public static long find_factorial(int num){
       int factorial = 1;
                for(int i=1;i<=num;i++){
                    factorial *=i;
                }
                return factorial;

    }
}


//  Implement a program to reverse the elements of a 1D array.


public class program{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
       System.out.println("original Array is:");
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
       reverse(arr);
       System.out.println("reversed array:");
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }

    }
public static void reverse(int[] arr) {
    int left = 0;
    int right = arr.length - 1;

    while (left<right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}
}




// finding second largest num in an array


public class program {
    static int second(int[] a) {
        int max1 = 0;
        int max2 = 0;
        if (a[0] > a[1]) {
            max1 = a[0];
            max2 = a[1];
        } else {
            max1 = a[1];
            max2 = a[0];
        }

        for (int i = 2; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];

            }
        }

        return max2;
    }


    public static void main(String[] args) {
        int[] a = {12,432,122,454,889,2,4};
        System.out.println(second(a));

    }
}



public class program{
    static void bubble(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;

                }
            }
        }
    }

    public static void main(String[] args){
        System.out.print("Enter Number of Values");
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int [] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        bubble(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}


//strings in java
public class program{
    public static void main(String[] args){
        String name = "rahul gandham";
        String fst_name = "rahul";
        String full = name.concat(" gandham");
        String full_name = "Rahul Gandham";
        // System.out.println(full);
      // char at   System.out.println(full.charAt(2));
        int l = full.length();
        // System.out.println(l); length of a string

       boolean c =  name.equals(full_name);
        boolean d =  name.equalsIgnoreCase(full_name);
       System.out.println(c);
        System.out.println(d);

        boolean n =name.startsWith("r");
        boolean cd = name.endsWith("m");
        int i = name.lastIndexOf("a");
        String neww = fst_name.replace("ul","a");
        String[] res = name.split(" ");
        System.out.println(n);
        System.out.println(i);
        System.out.println(neww);
        System.out.println(name.substring(0,5));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(res.length);
        for(i = 0; i< res.length; i++){
            System.out.println(res[i]);
            char[] a = new char[100];
            fst_name.getChars(0,5,a,0);
            name.getChars(0,13,a,5);
            System.out.println(res[1]);
        }



    }
}

public class program {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer(40);
        str.append("rambabu");
        System.out.println(str.hashCode());
        str.append( 54);
        System.out.println(str.hashCode());

        int ele = str.lastIndexOf("a");
        System.out.println(ele);
        String s = str.substring(0,7);
        System.out.println(s);
        String fst_name = "rahul";
        String lst = fst_name.concat(" gandham");
        System.out.println(lst);
        System.out.println(str);
    }

}


public class program {
    public static void main(String[] args){
        String name = "rahul gandham";
     for(int i=0;i<name.length();i++){
         char letter;
         letter = name.charAt(i);
         System.out.println(letter);
     }
    }

}


public class program {
    public static void main(String[] args){
        List<Integer> sum = new ArrayList<>();
        sum.add(20);
        sum.add(25);
        sum.add(33);
        sum.add(35);
        int t_sum = 0;
        for(int item: sum){
            t_sum+=item;

        }
        System.out.println(t_sum);
    }
}


public class program{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int num = s.nextInt();
        for(int i=1;i<=10;i++){
           System.out.println(num+"*"+i+"="+(num*i));

        }
    }
}


public class program {
    public static void main(String[] args){
        String name = "rahul gandham";
        String vowels  = "a,e,i,o,u";
        int count = 0;
        List<Character> new_vowels = new ArrayList<>();
        for(int i=0;i<name.length();i++){
            char item = name.charAt(i);
            if (item == 'a' || item == 'e' || item == 'i' || item == 'o' || item == 'u') {
                System.out.println(item);
                new_vowels.add(item);
                count = count + 1;

            }

            }
        System.out.println("total vowel count is: "+count);
        System.out.println(new_vowels);
        }

    }
public class program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to search in a list: ");
        int num = sc.nextInt();
        List<Integer> check = new ArrayList<>();
        check.add(1);
        check.add(2);
        check.add(3);
        check.add(4);
        check.add(5);
        if (IsNumberInList(num,check)){
            System.out.println(num + "is in list");
        }
        else{
            System.out.println(num + "not in list");
        }

    }

    public static boolean IsNumberInList(int number, List<Integer> list) {
        for (int num : list) {
            if (num == number) {
                return true;
            }

        }
        return false;
    }}
public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> check = new ArrayList<>();
        System.out.println("enter how many numbers");
        int NumOfValues = sc.nextInt();
        sc.nextLine();
        System.out.println("enter values for the list");
        for(int i=0;i<NumOfValues;i++){
            int num = sc.nextInt();
            check.add(num);
        }


        List<Integer> negitive = NegitiveNumbers(check);
        System.out.println("Positive numbers are:"+negitive);

    }
public static List<Integer> NegitiveNumbers(List<Integer> List){
        List<Integer> negitive = new ArrayList<>();
        for(int num:List){
            if(num>0){
                negitive.add(num);
            }
        }
        return negitive;
}
}


public class program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = s.nextInt();
        if (num < 0) {
            System.out.println("Entered wrong num");
        } else {
            long fact = LongFactorial(num);
            System.out.println(fact);

        }
    }

    public static long LongFactorial(int n){
        if(n==0 || n==1) {
            return 1;
        }
        long factorial =1;
        for(int i=n;i>=1;i--){
            factorial = factorial*i;
        }
        return factorial;
    }
}
 *
class calculator{
    public int add(int n1, int n2){
        int res = n1 + n2;
        return res;
    }
}
public class program {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 5;

        calculator calc = new calculator();
        int result = calc.add(num1,num2);
        System.out.println(result);



        // int res = num1 + num2;
        // System.out.println(res);

    }
}

class Calculator{
    public int add(int a, int b) {
        int res = a + b;
        return res;
    }
}
public class program{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("enter second number");
        int num2 = sc.nextInt();
        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
        System.out.println("Addition of two numbers is :"+result);
    }
}


// Encapsulation


class Encapsulation{
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

public class program {
    public static void main(String[] args){

        Encapsulation obj = new Encapsulation();
        obj.setName("rahul");
        String res = obj.getName();
        obj.setAge(24);
        int result = obj.getAge();
        System.out.println(res+":"+result);

    }
}


class human{
    private int age;
    private String name;

    public human(int n, String s){
        age = 24;
        name = "rahul";
        System.out.println(name+":"+age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class program {
    public static void main(String[] args){
        human h = new human(24, "rahul");
        //int age = h.getAge();
        System.out.println(h.getAge()+":"+h.getName());
    }}

 */

package tools;
class A{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int n){
        this();
        System.out.println("this is int A");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
    public B(int n){
        super(n);
        System.out.println("this is B int");
    }
}

public class program {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
