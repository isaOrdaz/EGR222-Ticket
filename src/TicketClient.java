import java.sql.SQLOutput;

public class TicketClient extends Ticket {
    public static void main(String[] args) {
        //ticket class
        Ticket t1 = new Ticket();

        System.out.println(t1.getNumber());
        System.out.println(t1.getPrice());
        System.out.println(t1.toString());

        //walk up ticket
        WalkupTicket w1 = new WalkupTicket();

        System.out.println(w1.getNumber());
        System.out.println(w1.getPrice());
        System.out.println(w1.toString());
        //Advance Tickets
        AdvanceTicket a1 = new AdvanceTicket();

        System.out.println(a1.getNumber());
        System.out.println(a1.getPrice(15));
        System.out.println(a1.toString());

        //Student Advance Tickets
        StudentAdvanceTicket s1 = new StudentAdvanceTicket();

        System.out.println(s1.getNumber());
        System.out.println(s1.getPrice(15));
        System.out.println(s1.toString());
    }


}
