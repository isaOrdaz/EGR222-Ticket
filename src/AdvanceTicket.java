public class AdvanceTicket extends Ticket{

    public double getPrice(int numDays){
        if(numDays >= 10)
            return super.getPrice() - (super.getPrice() * .40);
        else
            return super.getPrice() - (super.getPrice() * .20);
    }

    public String toString(){
        return "Ticket Type: Advanced, Number: " + super.getNumber() + ", Price: " + getPrice();
    }
}
