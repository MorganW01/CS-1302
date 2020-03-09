public class Ticket {
    private int ticketNumber;
    private double ticketPrice;

    public Ticket (){


    }

    public Ticket (int ticketNumber, double ticketPrice) {

        this.ticketNumber=ticketNumber;
        this.ticketPrice =ticketPrice;

    }

    //might have done this wrong...
    public int constructTicketNumber(int additionalTix){
        return ticketNumber+additionalTix;
    }

    public double getTicketPrice(){
        return ticketPrice;
    }

    public String toString(){
        return "Number: "+ ticketNumber +", Price: "+ ticketPrice;
    }



}
