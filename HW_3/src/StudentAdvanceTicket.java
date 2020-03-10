public class StudentAdvanceTicket extends Ticket {

    public StudentAdvanceTicket (int ticketNumber, int daysInAdvance){
        super(ticketNumber);

        if (daysInAdvance>=10){

            ticketPrice=15;
        }

        else {

            ticketPrice=20;
        }

    }

    @Override
    public String toString() {
        return super.toString() +" (ID REQUIRED)";
    }
}
