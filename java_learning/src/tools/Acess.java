package tools;
/*package tools;
public class Acess extends Access_Method {
public int add(int n1, int n2){
    return n1+n2;
}
public int sub(int n1, int n2){
    return n1-n2;
}

}

abstract class computer{
    public abstract void code();
}

class laptop extends computer{
    public void code(){
        System.out.println("lap coding");
    }
}

class desktop extends computer{
    public void code(){
        System.out.println("desktop coding..");
    }
}

class developer{
    public void dev(computer obj){
        obj.code();
    }
}

public class Acess{
    public static void main(String[] args){
        computer lap = new laptop();
        computer desk = new desktop();

        developer rahul = new developer();
        rahul.dev(lap);
        developer gandham = new developer();
        gandham.dev(desk);
   }
}
 */

enum status{
    running, failed, pending, Success;
        }

public class Acess{
    public static void main(String[] args){
        status s = status.running;
//       if(s==status.pending)
//           System.out.println("please wait");
//       else if (s==status.Success)
//           System.out.println("done");
//       else if (s==status.failed)
//        System.out.println("failed");
//    else
//        System.out.println("running");

        switch (s){
            case running:
                System.out.println("all good");
                break;
            case pending:
                System.out.println("not done yet");
                break;
            case failed:
                System.out.println("break");
                break;
                default:
                System.out.println("done");
                break;
        }
    }

    }
