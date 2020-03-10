public class TicketTester {

    public static void main (String []args){
        //print the price for each object and the object itself.


        WalkupTicket walkupTicket =new WalkupTicket(15);

        // ticket number 16, purchased 11 days in advance
        AdvanceTicket advanceTicket = new AdvanceTicket (16,11);

        //ticket number 17, purchased 10 days in advance
        StudentAdvanceTicket studentAdvanceTicket = new StudentAdvanceTicket(17,10);

        //print price and ticket number for walkupTicket
        System.out.println("Price: "+walkupTicket.ticketPrice);
        System.out.println(walkupTicket);

        //print price and ticket number for advanceTicket
        System.out.println("Price: "+advanceTicket.ticketPrice);
        System.out.println(advanceTicket);

        //print price and ticket number for studentAdvanceTicket
        System.out.println("Price: "+studentAdvanceTicket.ticketPrice);
        System.out.println(studentAdvanceTicket);


    }


}
