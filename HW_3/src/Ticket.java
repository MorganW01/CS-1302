public class Ticket {
    private int ticketNumber;
    protected double ticketPrice;



    public Ticket (int ticketNumber) {
        this.ticketNumber=ticketNumber;
    }

    //need this?
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
