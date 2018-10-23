public class WalkupTicket extends Ticket {
    public String toString(){
        return ("Ticket Type: Walk-up," + " Number: " + super.getNumber() + ", Price: " + super.getPrice());
    }
}
