import java.util.ArrayList;
import java.util.List;

public class GroceryList {

    //initialize as a list, then make it an array list.
    List<GroceryItemOrder> list = null;
    int n;

    //represents a list of items to buy
    public GroceryList(){
        list = new ArrayList<>();
        this.n=0;

    }

    public void add(GroceryItemOrder item){
        list.add(item);
    }

    public double getTotalCost(){
        int total=0;
        for (int i =0; i<list.size(); i++){
            total+= list.get(i).getCost();
        }

        return total;
    }

    //bug is here
    public String toString() {

        return "Grocery List: ";
    }

}
