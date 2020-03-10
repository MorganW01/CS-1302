public class Ticket {
    private int ticketNumber;
    protected double ticketPrice;

    Ticket (int ticketNumber) {
        this.ticketNumber=ticketNumber;
    }

    public double getTicketPrice(){
        return ticketPrice;
    }

    public String toString(){
        return "Number: "+ ticketNumber +", Price: "+ ticketPrice;
    }

}
