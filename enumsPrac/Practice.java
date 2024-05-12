package enumsPrac;


enum Laptop{
    MacBook(2000),XPS(2200),Surface(1800),ThinkPad(1500);

    private int price;

    private Laptop(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    

}


public class Practice{
    public static void main(String args[]){
        // Laptop lap = Laptop.MacBook;
        // System.out.println(lap.getPrice());

        for(Laptop lap:Laptop.values()){
            System.out.println(lap + ":" + lap.getPrice());
        }
    }
}