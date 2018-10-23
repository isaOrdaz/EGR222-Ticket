import java.util.Random;

public class Ticket {
    private double price = 50.0;
    Random iD = new Random();
    private int ticketNum  = iD.nextInt(100) + 1;


    public double getPrice(){
        return this.price;
    }

    public int getNumber(){
        return this.ticketNum;
    }

    public String toString(){
        return "Number: " + getNumber() + ", Price: " + getPrice();
    }
}
