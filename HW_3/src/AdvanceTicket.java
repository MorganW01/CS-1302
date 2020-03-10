public class AdvanceTicket extends Ticket {

    public AdvanceTicket (int ticketNumber, int daysInAdvance){
        super(ticketNumber);

        if (daysInAdvance>=10){

            ticketPrice=30;
        }

        else {

            ticketPrice=40;
        }


    }

}
