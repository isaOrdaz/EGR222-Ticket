public class StudentAdvanceTicket extends Ticket {

    public double getPrice(int numDays){
        if(numDays >= 10)
            return super.getPrice() - (super.getPrice() * .70);
        else
            return super.getPrice() - (super.getPrice() * .60);
    }



}
