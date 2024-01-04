package tools;
class calculat{
    int cal = 0;
    public void cnt(){
        cal++;
    }

}
public class Race {
    public static void main(String[] args){
        calculat c = new calculat();
        Runnable obj6 = ()->
        {
            for(int i=1;i<=1000;i++){
                c.cnt();
            }
        };
        Runnable obj7 = ()->
        {
            for(int i=1;i<=1000;i++){
                c.cnt();
            }
        };

        Thread t = new Thread(obj6);
        Thread tt = new Thread(obj7);

        t.start();
        tt.start();


        System.out.println(c.cal);
    }
}
