@FunctionalInterface
interface lam {
     void show(int i,int j);
}


public class lamda {
    public static void main (String[] args){
    lam obj = (int i,int j)-> {
            int res = i+j;
        System.out.println("result is "+res);

    };
    obj.show(5,5);
    }
}
