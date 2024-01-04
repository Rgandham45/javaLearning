package tools;

public class VotingRC {
    public static void main(String[] args){
        Runnable vc = new Voting();

        Thread v1 = new Thread(new Voting(),"voter1");
        Thread v2 = new Thread(new Voting(),"voter2");
        Thread v3 = new Thread(new Voting(),"voter3");
        Thread v4 = new Thread(new Voting(),"voter4");

        v1.start();
        v2.start();
        v3.start();
        v4.start();

        System.out.println(Voting.cunt);
    }
}
