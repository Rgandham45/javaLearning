class RahulException extends Exception{
    public RahulException(String string){
        super(string);
    }
}


public class Excep {
    public static void main(String[] args){
        int i = 20;
        int j = 0;
         Integer[] arr  = {1,2,3,4,5};
        try{
            j=18/i;
            if(j==0) {
                throw new RahulException("its okay");
            }
            System.out.println(arr[2]);

        } catch (ArithmeticException e) {
            System.out.println("cannot enter zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Its out of the box");
        } catch (RahulException e) {
            System.out.println("lets use another Exception"+e);;
        }
        System.out.println(j);
    }
}
