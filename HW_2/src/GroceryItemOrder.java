public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double pricePerUnit;

    //stores an item quantity and a price per unit.
    public GroceryItemOrder (String name, int quantity, double pricePerUnit) {

        this.name = name;
        this.quantity=quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getCost (){
        return this.quantity * this.pricePerUnit;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

}
