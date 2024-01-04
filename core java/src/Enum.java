enum laptops{
    macbook(1300), acer(1000),pavilion(900), Alienware(1500);
    private int price;
    private int newPrice;
   private laptops(){

}
    private laptops(int price){
        this.price = price;
    }
    public int  getPrice(){
        return price;
    }
    public int getNewPrice(){

        return newPrice;
    }


    public void setPrice(int Price){
            this.newPrice = Price;
    }
}

public class Enum {
    public static void main(String[] args) {
        laptops lp = laptops.acer;
        System.out.println(lp);
        lp.setPrice(15000);
        System.out.println(lp.getNewPrice());

        laptops [] lap = laptops.values();
        for(laptops laps:lap){
            System.out.println(laps+":"+laps.getNewPrice());
        }

    }
}
