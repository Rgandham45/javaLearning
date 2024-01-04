class duck{
    public void show() throws ClassNotFoundException {
        Class.forName("xyz");
    }
}

public class Ducking {
    public static void main(String[] args){
        duck obj = new duck();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Invalid class");
        }
    }
}
